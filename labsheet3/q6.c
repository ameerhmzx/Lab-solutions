#include <stdio.h>

void main()
{
    float sale;

    while (1)
    {
        printf("Enter sales in pounds: ");
        scanf("%f", &sale);
        if (sale == -1)
            break;

        printf("Salary is: £%.2f\n\n", 200.0 + (sale * 0.09));
    }
}
