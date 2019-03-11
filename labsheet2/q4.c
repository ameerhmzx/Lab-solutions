#include <stdio.h>

void main()
{
    int age;
    char m;
    printf("Are you married (y/n): ");
    scanf("%c", &m);

    if (m == 'Y' || m == 'y')
        printf("You will be insured\n");
    else
    {
        printf("Are you mall (y/n): ");
        scanf("%c", &m);
        printf("Whats ypur age: ");
        scanf("%d", &age);
        if ((m == 'Y' || m == 'y') && age > 30)
            printf("You will be insured\n");
        else if (age > 25)
            printf("You will be insured\n");
    }
    printf("You will not be insured\n");
}
