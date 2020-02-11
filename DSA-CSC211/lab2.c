#include <stdio.h>
#include "lab1.c"

/**
 * Sum factorials of all the number from 1 to n recursively
 * 
 * This algorithm guarantees that factorial of each number
 * will be calculated once
 */
int recursiveFactorialSum(int n, int *frac)
{
    if (n <= 1)
    {
        *frac = 1;
        return 1;
    }
    int prefac;
    int sum = recursiveFactorialSum(n - 1, &prefac);
    *frac = n * prefac;
    return sum + *frac;
}

/**
 * Simple recursive factorial sum
 */
int recursiveFactorialSum2(int n)
{
    if (n <= 1)
        return 1;
    return iterativeFactorial(n) + recursiveFactorialSum2(n - 1);
}


/** Finds sum of natural numbers recursively */
int recursiveNaturalSum(int n)
{
    if (n == 1)
        return 1;
    return n + recursiveNaturalSum(n - 1);
}

/** Finds sum of natural numbers iteratively */
int iterativeNaturalSum(int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum += i;
    }
    return sum;
}

/** Private Fibonacci Series printer */
int _fibonacciSeries(int n, int *lastFab)
{
    if (n == 1)
    {
        printf("0\n1\n");
        *lastFab = 0;
        return 1;
    }
    int last2;
    int f = _fab(n - 1, &last2);
    *lastFab = f;
    printf("%d\n", last2 + f);
    return last2 + f;
}

/** Fibonacci Series printer */
int fibonacciSeries(int n)
{
    int _;
    return _fab(n, &_);
}

int recursiveFibonacciSeries(int n)
{
    if (n < 2)
    {
        return n;
    }
    return fab2(n - 1) + fab2(n - 2);
}