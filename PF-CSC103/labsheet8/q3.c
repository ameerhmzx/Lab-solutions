#include <stdio.h>
#include <ctype.h>

typedef struct {
  int spaces;
  int lines;
  int words;
  int character;
  int tabs;
} state;

int main(void) {
  FILE *fp = fopen("test", "r");
  state state = {0, 1, 1, 0, 0};
  char last;

  while(!feof(fp)){
    char ch = fgetc(fp);
    if (ch == ' ')
      state.spaces++;
    else if(ch == '\t')
      state.tabs++;
    else if(ch == '\n')
      state.lines++;
    else if(last == ' ' && isalpha(ch))
      state.words++;

    state.character++;
    last = ch;
  }

  printf("Characters: %d\n", state.character);
  printf("Spaces: %d\n", state.spaces);
  printf("Tabs: %d\n", state.tabs);
  printf("Lines: %d\n", state.lines);
  printf("Words: %d\n", state.words);
  return 0;
}
