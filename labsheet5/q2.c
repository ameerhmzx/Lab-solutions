#include <stdio.h>

#define SIZE 10

int c;

void getArray(int arr[]);
int FindEven(int arr[]);
void Modify(int arr[]);
int FindMax(int arr[]);

int main(){
    int arr[SIZE] = {0};
    getArray(arr);
    printf("Number of Evens are = %d\n",FindEven(arr));
    Modify(arr);
    printf("Largest Element = %d\n", FindMax(arr));
    return 0;
}

void getArray(int arr[]){
    for(c=0; c<=4; c++){
        printf("Enter value at index - %d : ",c);
        scanf("%d",&arr[c]);
    }
}

int FindEven(int arr[]){
    int Evens = 0;
    for(c=0; c<=SIZE; c++){
        if(arr[c]%2==0){
            Evens++;
        }
    }
    return Evens;
}

void Modify(int arr[]){
    for(c=0; c<=SIZE; c++){
        arr[c] *= 4;
    }
}

int FindMax(int arr[]){
    int max = 0;
    for(c=0; c<=SIZE; c++){
        max = (max<arr[c])?arr[c]:max;
    }
    return max;
}
