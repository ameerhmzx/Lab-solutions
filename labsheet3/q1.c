#include <stdio.h>

void main()
{
    float liters, km, sum = 0, i = 0;

    while (1)
    {
        printf("Enter the liters used (-1 to end): ");
        scanf("%f", &liters);
        if (liters == -1)
            break;

        printf("Enter the kilometers driven: ");
        scanf("%f", &km);

        float x = liters / km * 100.0;
        sum += x;
        i++;
        printf("The liters/100 km for this tank was %.1f\n\n", x);
    }

    float avg = sum / i;

    printf("The overall average consumption was: %.1f\n\n", avg);
}
