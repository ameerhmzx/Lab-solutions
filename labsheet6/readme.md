# Lab Sheet 6

## Question 1

[Source Code](./q1.c)

Given the following piece of code

```c
 int i = 10;    
 char c= 'A';
 double f = 25.5;
 int *iptr = &i;
 char *cptr = &c;
```

 You are expected to write the result of following statements from the output you got after running your program for the above given values. 


| Value of i | Address of i | Value of iptr | Address of iptr | Derefrenced Value of *iptr | Size of iptr | Size of i |
|:----------:|--------------|---------------|-----------------|----------------------------|--------------|-----------|
| <br><br> |  |  |  |  |  |  |
| **Value of c** | **Address of c** | **Value of cptr** | **Address of cptr** | **Derefrenced Value of *cptr** | **Size of cptr** | **Size of c** |
| <br><br> |  |  |  |  |  |  |



						
**Note:** The format specifier for displaying address of any data item is %p


## Question 2

[Source Code](./q2.c)


Consider the following array of integers:
Array of integers, named ‘arr’

| 2 | 6 | -4 | 8 | 10 |	-12 | 14 | 16 | 18 | 20 |
|---|---|----|---|----|-----|----|----|----|----|
|num[0]|num[1]|num[2]|num[3]|num[4]|num[5]|num[6]|num[7]|num[8]|num[9]|

Implement the following pointer notations to traverse and display the given array ‘arr’.
1.	Printing array using array[i] notation.
2.	Printing array using ptr[i] notation.
3.	Printing array using *(array+i) notation.
4.	Printing array using *(ptr+i) notation.
5.	Printing array using *ptr notation.


## Question 3

[Source Code](./q3.c)

Write, compile and execute the program below. Explain why the function swap does not work properly. Using pointers, change the program to make the function swap to work properly. 
