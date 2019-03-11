#include <stdio.h>

void main()
{
    int i = 1, prod = 1;
    while (i <= 19)
    {
        if (i % 2 != 0)
            prod *= i;
        i++;
    }

    printf("Product of odd numbers from 1-19 is %d\n\n", prod);
}
