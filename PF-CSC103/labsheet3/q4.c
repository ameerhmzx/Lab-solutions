#include <stdio.h>

void main()
{
    int num, i = 1000;
    printf("Enter a 4 digit number: ");
    scanf("%d", &num);

    while (i >= 1)
    {
        printf("%d\t", (num / i) % 10);
        i /= 10;
    }

    printf("\n\n");
}
