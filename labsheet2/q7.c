#include <stdio.h>

void q7()
{
    int x;
    printf("Enter a number: ");
    scanf("%d", &x);

    if (x % 2 == 0)
        printf("Even\n");
    else
        printf("Odd\n");
}
