#include <stdio.h>

void main()
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
