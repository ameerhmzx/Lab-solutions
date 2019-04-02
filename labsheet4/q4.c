#include <stdio.h>

float F2C(float f){
  return (f - 32) * 5 / 9;
}

float C2F(float c){
  return (c * 9/5) + 32;
}

int main(void) {
  printf("C\tF\n");
  for(int i =0; i <= 100; i++){
    printf("%d\t%.2f\n", i, C2F((float)i));
  }

  printf("\n\nF\tC\n");
  for(int i =32; i <= 212; i++){
    printf("%d\t%.2f\n", i, F2C((float)i));
  }
  return 0;
}
