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

void getStat(void) {
  char str[10] = "asdfasdfgh";
  int freq[4] = {0};
  int i=0;

  for(; i < strlen(str); i++){
    if(str[i] == ' ')
      freq[3]++;
    
    else if(isdigit(str[i]))
      freq[2]++;
    
    if(str[i] == 'A' || str[i] == 'E' || str[i] == 'I'
    || str[i] == 'O' || str[i] == 'U'
    || str[i] == 'a' || str[i] == 'e' || str[i] == 'i'
    || str[i] == 'o' || str[i] == 'u' )
      freq[0]++;
    else
      freq[1]++;
  }

  printf("Digits: %d\n", freq[2]);
  printf("Vowels: %d\n", freq[0]);
  printf("Consonants: %d\n", freq[1]);
  printf("Spaces: %d\n", freq[3]);

}

void keepAplha(void) {
  char str[10] = "asdff23#gh";
  char newStr[10] = "";
  int i=0, j=0;

  for(; i < strlen(str); i++){
    if(isalpha(str[i])){
      newStr[j] = str[i];
      j++;
    }
  }

  puts(newStr);
}

void main()
{
  strFreq();
  getStat();
}
