#include <stdio.h>

void main()
{
    int i;
    for (i = 1; i <= 100; i++)
        printf("%d\t", i);

    printf("\n");
    for (i = 100; i >= 1; i--)
        printf("%d\t", i);

    printf("\n");
    for (i = 20; i >= 2; i -= 2)
        printf("%d\t", i);

    printf("\n");
    for (i = 2; i <= 20; i += 3)
        printf("%d\t", i);

    printf("\n");
    for (i = 99; i >= 0; i -= 11)
        printf("%d\t", i);
}
