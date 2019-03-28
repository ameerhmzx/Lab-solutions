#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int randR(int min, int max){
    return (rand() % (max - min + 1)) + min;
}

int main()
{
    srand(time(0));
    int num = randR(1, 2);
    printf("%d\n", num);
    num = randR(1, 100);
    printf("%d\n", num);
    num = randR(0, 9);
    printf("%d\n", num);
    num = randR(1000, 1112);
    printf("%d\n", num);
    num = randR(-1, 1);
    printf("%d\n", num);
    num = randR(-3, 11);
    printf("%d\n", num);

    return 0;
}
