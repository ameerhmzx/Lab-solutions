#include <stdio.h>

void main()
{
    int smallest, largest, num;
    printf("Enter a number: ");
    scanf("%d", &num);
    smallest = largest = num;

    for (int i = 0; i < 3; i++)
    {
        printf("Enter another number: ");
        scanf("%d", &num);
        if (num > largest)
            largest = num;
        else if (num < smallest)
            smallest = num;
    }

    printf("Smallest %d\nLargest: %d\n", smallest, largest);
}
