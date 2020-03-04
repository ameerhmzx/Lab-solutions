#include <iostream>

using namespace std;

class Matrix
{
private:
    int *mat, m, n;

public:
    Matrix(int m, int n)
    {
        this->m = m;
        this->n = n;
        this->mat = (int *)malloc(sizeof(int) * m * n);
    }

    ~Matrix()
    {
        free(this->mat);
    }

    int get(int i, int j)
    {
        return this->mat[i * n + j];
    }

    void set(int i, int j, int val)
    {
        this->mat[i * n + j] = val;
    }

    void setAll(int *arr){
        for(int i = 0; i < m * n; i++)
            this->mat[i] = arr[i];
    }

    bool LuDecompose(Matrix *l, Matrix *u)
    {
        if (this->m != this->n)
            return false;

        for (int i = 0; i < m; i++)
        {
            for (int k = 0; k < n; k++)
            {
                int uVal = 0, lVal = 0;

                if (i <= k)
                {
                    uVal = this->get(i, k);
                    for (int j = 0; j < i; j++)
                    {
                        uVal -= l->get(i, j) * u->get(j, k);
                    }
                }
                else
                {
                    lVal = this->get(i, k);
                    for (int j = 0; j < i; j++)
                        lVal -= l->get(i, j) * u->get(j, k);

                    lVal /= u->get(k, k);
                }

                if (i == k)
                    lVal = 1;

                l->set(i, k, lVal);
                u->set(i, k, uVal);
            }
        }

        return true;
    }

    bool determinant(int *det)
    {
        if (m != n) return false;

        Matrix lMat(m, n);
        Matrix uMat(m, n);
        this->LuDecompose(&lMat, &uMat);
        lMat.print();
        uMat.print();

        *det = 1;
        for(int i = 0; i < m; i++)
            *det *= uMat.get(i,i);

        return true;
    }

    void print(){
        cout << "[" << endl;
        for(int i = 0; i < m; i++){
            cout << "\t[";
            for(int j = 0; j < n; j++)
                cout << this->get(i, j) << ", ";
            cout << "]," << endl;
        }
        cout << "]" << endl;
    }
};


int main()
{
    Matrix mat(3,3);
    int matix[9] = {
        2, -1, -2,
        -4, 6, 3,
        -4, -2, 8
    };
    mat.setAll(matix);

    int det = 1;
    mat.determinant(&det);
    cout << det << endl;
}
