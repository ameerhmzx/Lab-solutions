#include <stdio.h>

void main()
{
  
  FILE *fptr = fopen("data.txt","w");
  char x[100];

  if(fptr==NULL)
  {
    printf("\nUnable to open/create file!!!");
    exit(0);
  }

  gets(x);
  fputs(x, fptr);
  
  fclose(fptr);
}
