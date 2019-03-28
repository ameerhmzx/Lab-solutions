#include<stdio.h>
#include<stdlib.h>

float calculate_charges(float hrs);

int main()
{
    int i;
    float hrs,hrs1,hrs2,hrs3,chrg1,chrg2,chrg3;

    for(i = 1;i <= 3;i++)
    {
       printf("Enter number of hours for car%d: ",i);
       scanf("%f",&hrs);

       if(i == 1)
       {
           chrg1 = calculate_charges(hrs);

           hrs1 = hrs;
       }

       if(i == 2)
       {
           chrg2 = calculate_charges(hrs);

           hrs2 = hrs;
       }

       if(i == 3)
       {
           chrg3 = calculate_charges(hrs);

           hrs3 = hrs;
       }
    }

    printf("car\tHours\tCharges\n");

    printf("%2d\t%.1f\t%.1f\n",1,hrs1,chrg1);
    printf("%2d\t%.1f\t%.1f\n",2,hrs2,chrg2);
    printf("%2d\t%.1f\t%.1f\n",3,hrs3,chrg3);
    printf("Total\t%.1f\t%.1f\n",hrs1+hrs2+hrs3,chrg1+chrg2+chrg3);


    system("pause");
    return 0;
}

float calculate_charges(float hrs)
{
    float chrg;

    if(hrs == 0)
      chrg = 0;

    else if(hrs > 0 && hrs <= 3)
           chrg = 2.0;

    else if(hrs > 3 && hrs <= 24)
    {
       chrg = (((hrs - 3)*0.5)+2.0);

       if(chrg > 10)
         chrg = 10;

    }
    else
        printf("Invalid Input !!!\n");

    return chrg;
}
