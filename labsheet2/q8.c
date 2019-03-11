#include <stdio.h>

void main()
{
    int x;
    for (int i = 0; i < 10; i++)
    {
        printf("Enter a number: ");
        scanf("%d", &x);

        if (x % 2 == 0)
            printf("Even\n");
        else if (x % 3 == 0)
            printf("Divisible by 3\n");
    }
}
