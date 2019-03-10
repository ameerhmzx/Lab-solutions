#include <stdio.h>

void q1()
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

void q2()
{
    int i = 1, sum = 0;
    while (i <= 30)
    {
        if (i % 2 == 0)
            sum += i;
        i++;
    }
    printf("Sum of even numbers from 1-30 is %d\n\n", sum);
}

void q3()
{
    int i = 1, prod = 1;
    while (i <= 19)
    {
        if (i % 2 != 0)
            prod *= i;
        i++;
    }

    printf("Product of odd numbers from 1-19 is %d\n\n", prod);
}

void q4()
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

void q5()
{
    int ac_num;
    float init_balance, ttl_charges, ttl_credit, credit_lmt;

    while (1)
    {
        printf("Enter account number (-1 to end): ");
        scanf("%d", &ac_num);
        if (ac_num == -1)
            break;

        printf("Enter initial balance: ");
        scanf("%f", &init_balance);
        printf("Enter total charges: ");
        scanf("%f", &ttl_charges);
        printf("Enter total credits: ");
        scanf("%f", &ttl_credit);
        printf("Enter credit limit: ");
        scanf("%f", &credit_lmt);

        printf("Account: %d\n", ac_num);
        printf("Credit limit: %.0f\n", credit_lmt);
        float balance = init_balance + ttl_charges - ttl_credit;
        printf("Balance: %.2f\n", balance);

        if (balance > credit_lmt)
            printf("Credit Limit Exceeded\n");
        printf("\n");
    }
}

void q6()
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
