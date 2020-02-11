#include<stdio.h>

float calc_charges(float hours) {
    if ((int)hours == 0)
      return 0.0;
    else if (hours > 0 && hours <= 3)
      return 30.0;
    else if (hours > 3 && hours <= 24){
      float ch = (((hours-3)*5)+30);
      return (ch > 100.0)? 100: ch;
    }
    
    return -1;
}

int main()
{
    float h1, h2, h3;
    
    printf("Enter the number of hours for  car 1: ");
    scanf("%f", &h1);

    printf("Enter the number of hours for  car 2: ");
    scanf("%f", &h2);

    printf("Enter the number of hours for  car 3: ");
    scanf("%f", &h3);
    
    float ttl_charges = calc_charges(h1) + calc_charges(h2) + calc_charges(h3);

    printf("\nCars\tHours\t\tCharges\n");
    printf("1\t\t%.2f\t\t%.2f\n",h1,calc_charges(h1));
    printf("2\t\t%.2f\t\t%.2f\n",h2,calc_charges(h2));
    printf("3\t\t%.2f\t\t%.2f\n",h3,calc_charges(h3));
    printf("Total\t%.2f\t\t%.2f\n",h1+h2+h3,ttl_charges);


    return 0;
}
