#include <stdio.h>

void main()
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
