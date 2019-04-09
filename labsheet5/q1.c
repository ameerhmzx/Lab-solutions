#include<stdio.h>
#define SUB 10

void main(){
    int marks;
    int i, sum=0;

    for(i=0; i < SUB; i++){
        printf("Enter subject marks: ");
        scanf("%d", &marks);
        sum += marks;
    }

    printf("Sum: %d\n", sum);
    printf("Percentange: %.2f\n", (float) sum / (100.0 * SUB) * 100.0);
    printf("Average: %.2f\n", (float) sum / (float) SUB);
}
