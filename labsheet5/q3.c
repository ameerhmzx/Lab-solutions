#include <stdio.h>

int main()
{
  // Will be available soon
    int i;
    float sal[5], hrs, rate;

    for(i = 0;i < 5;i++)
    {
        printf("Enter the number of hours worked for employee %d: ",i+1);
        scanf("%f",&hrs);

        printf("Enter the rate per hour worked for employee %d: ",i+1);
        scanf("%f",&rate);

        sal[i] = hrs*rate;
    }

    for(i=0; i < 5; i++){
      printf("Basic Salary of employee %d: %.2f\n", i+1, sal[i]);
    }

    return 0;
}
