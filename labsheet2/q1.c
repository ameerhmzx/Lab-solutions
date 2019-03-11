#include <stdio.h>

void q1()
{
    int units;
    float price, rate, surch;
    printf("Enter units: ");
    scanf("%d", &units);

    if (units <= 300)
    {
        rate = 3;
        surch = 1;
    }
    else
    {
        rate = 3.5;
        surch = 1.05;
    }

    price = (units * rate) * surch;
    printf("price: %.2f\n\n", price);
}
