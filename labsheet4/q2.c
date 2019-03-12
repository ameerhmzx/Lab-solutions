#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int randR(int min, int max){
    srand(time(0));
    return (rand() % (max - min + 1)) + max;
}

void main()
{
    int num1 = randR(1, 2);
    int num2 = randR(1, 100);
    int num3 = randR(0, 9);
    int num4 = randR(1000, 1112);
    int num5 = randR(-1, 1);
    int num6 = randR(-3, 11);
    printf("%d\n%d\n%d\n%d\n%d\n%d\n\n\n", num1, num2, num3, num4, num5, num6);
}
