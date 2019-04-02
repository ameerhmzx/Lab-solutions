#include <stdio.h>

int GCD(int x, int y){
  if (y==0) return x;
  return GCD(y, x % y);
}

int main(void) {
  printf("%d", GCD(12, 3));
  return 0;
}
