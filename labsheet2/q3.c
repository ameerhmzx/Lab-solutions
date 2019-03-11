#include <stdio.h>

void main()
{
    int qty, price;
    float ttl;
    printf("Enter Qty & Price (comma seperated): ");
    scanf("%d, %d", &qty, &price);

    if (qty > 1000)
        ttl = (float)price * (float)qty * 0.9;
    else
        ttl = (float)price * (float)qty;

    printf("Total Price: %.2f\n", ttl);
}
