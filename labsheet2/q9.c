#include <stdio.h>

void main()
{
    float p = 1000.0, r = .05, n = 1;
    printf("Year\tAmount on deposit\n");
    for(;n <= 10; n++){
        printf("%.0f\t%.2f\n", n, p*(1.0+r));
        p += p*r;
    }
}
