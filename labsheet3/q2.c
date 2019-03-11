#include <stdio.h>

void main()
{
    int i = 1, sum = 0;
    while (i <= 30)
    {
        if (i % 2 == 0)
            sum += i;
        i++;
    }
    printf("Sum of even numbers from 1-30 is %d\n\n", sum);
}
