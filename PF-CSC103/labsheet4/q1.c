#include <stdio.h>

int sub(int x, int y)
{
    return x - y;
}

int add(int x, int y)
{
    return x + y;
}

int mul(int x, int y)
{
    return x * y;
}

int divide(int x, int y)
{
    return x / y;
}

void main()
{
    char op;
    int num1, num2;

    printf("Enter +, -, *, / to continue: ");
    scanf("%c", &op);

    printf("Enter 1st number: ");
    scanf("%d", &num1);
    printf("Enter 2nd number: ");
    scanf("%d", &num2);

    switch (op)
    {
    case '-':
        printf("%d - %d = %d", num1, num2, sub(num1, num2));
        break;

    case '+':
        printf("%d + %d = %d", num1, num2, add(num1, num2));
        break;

    case '*':
        printf("%d * %d = %d", num1, num2, mul(num1, num2));
        break;

    case '/':
        printf("%d / %d = %d", num1, num2, divide(num1, num2));
        break;
    }

    printf("\n\n");
}
