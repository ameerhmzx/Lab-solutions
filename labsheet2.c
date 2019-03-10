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

void q2()
{
    int s1, s2, s3, s4, s5;
    printf("Enter marks of 5 subjects seperated by comma: ");
    scanf("%d, %d, %d, %d, %d", &s1, &s2, &s3, &s4, &s5);

    int sum = s1 + s2 + s3 + s4 + s5;
    float percent = sum / 5;

    printf("Sum: %d\n", sum);
    printf("Percentage: %.2f\n", percent);

    if (percent > 90)
        printf("Grade: A\nCredit Points: 4.0");
    else if (percent > 85)
        printf("Grade: A-\nCredit Points: 3.7");
    else if (percent > 80)
        printf("Grade: B+\nCredit Points: 3.3");
    else if (percent > 75)
        printf("Grade: B\nCredit Points: 3.0");
    else if (percent > 70)
        printf("Grade: B-\nCredit Points: 2.7");
    else if (percent > 65)
        printf("Grade: C+\nCredit Points: 2.3");
    else if (percent > 60)
        printf("Grade: C\nCredit Points: 2.0");
    else if (percent > 55)
        printf("Grade: C-\nCredit Points: 1.7");
    else if (percent > 50)
        printf("Grade: D\nCredit Points: 1.3");
    else
        printf("Grade: F\nCredit Points: 0.0");
}

void q3()
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

void q4()
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

void q5()
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


void q6()
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

void q8()
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

void q9()
{
    float p = 1000.0, r = .05, n = 1;
    printf("Year\tAmount on deposit\n");
    for(;n <= 10; n++){
        printf("%.0f\t%.2f\n", n, p*(1.0+r));
        p += p*r;
    }
}
