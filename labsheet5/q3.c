#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i;
    float hrs[5],hrs_rate[5],sal;

    for(i = 0;i < 5;i++)
    {
        printf("Enter the number of hours worked for employee %d: ",i+1);
        scanf("%f",&hrs[i]);

        printf("Enter the rate per hour worked for employee %d: ",i+1);
        scanf("%f",&hrs_rate[i]);

        printf("The basic salary of %d employee is %.2f\n",i+1,hrs[i]*hrs_rate[i]);
    }

    system("pause");
    return 0;
}
