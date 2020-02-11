#include <stdio.h>

/** Finds the factorial of given integer recursively */
int recursiveFactorial(int n)
{
    if (n <= 1)
        return 1;
    return n * fr(n - 1);
}

/** Finds factorial of given integer iteratively */
int iterativeFactorial(int n)
{
    int f = 1;
    for (int i = n; i > 1; i--)
        f *= i;
    return f;
}

/** Calculates power recursivly */
int recursivePower(int b, int e)
{
    if (e == 1)
        return b;
    if (e == 0)
        return 1;
    if (e > 0)
        return b * pr(b, e - 1);
    return 1 / (b * pr(b, e - 1));
}

/** Calculates power iteratively */
int iterativePower(int b, int e)
{
    if (e == 0)
        return 1;
    int pw = 1;

    if (e > 0)
    {
        for (int i = 0; i < e; i++)
        {
            pw *= b;
        }
        return pw;
    }

    for (int i = 0; i < e; i++)
    {
        pw /= b;
    }
    return pw;
}