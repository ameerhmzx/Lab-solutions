#include <stdio.h>
#include <string.h>

void strFreq(void) {
  char str[10] = "asdfasdfgh";
  int freq[256] = {0};
  int i=0;

  for(; i < strlen(str); i++){
    freq[str[i]]++;
  }

  for(i=0; i < strlen(str); i++){
    printf("%c: %d\n", str[i], freq[str[i]]);
  }
}

void main()
{
  strFreq();
}
