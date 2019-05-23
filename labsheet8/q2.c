#include <stdio.h>

void main()
{
   FILE *f1ptr = fopen("file1.txt","r");
  FILE *f2ptr = fopen("file2.txt","w");
  if(f1ptr == NULL || f2ptr == NULL)
  {
    printf("\nUnable to open/create file!!!");
    exit(0);
  }
  while(!feof(f1ptr)){
    fputc(fgetc(f1ptr), f2ptr);
  }
  fclose(f1ptr);
  fclose(f2ptr);
}
