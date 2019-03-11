# Lab Sheet 4

## Question 1

[Source Code](./q1.c)

Recall the programme you wrote to implement a simple calculator now rewrite the same programme using functions.


## Question 2

[Source Code](./q2.c)

Write a program that uses six calls to the function rand() to generate six random integer numbers, num1, num2, num3, num4, num5, and num6, and then print them out.   
num1 should be in the range 1 to 2 (inclusive), num2 should be in the range 1 to 100 (inclusive), num3 should be in the range 0 to 9, num4 should be in the range 1000 to 1112 (inclusive), num5 should be in the range -1 to 1, and num 6 should be in the range -3 to 11. 


## Question 3

[Source Code](./q3.c)

A car park charges a £2.00 minimum fee to park for up to 3 hours, and an additional £0.50 for each hour or part hour in excess of three hours. The maximum charge for any given 24-hour period is £10.00. Assume that no car parks for more than 24 hours at a time. 
Write a C program that will calculate and print the parking charges for each of 3 customers who parked their car in the car park yesterday. The program should accept as input the number of hours that each customer was parked, and output the results in a neat tabular form, along with the total receipts from the three customers: 
 
The program should use the function calculate_charges to determine the charge for each customer.


## Question 4

[Source Code](./q4.c)

Implement the following functions. The functions return a real number:  
(a) Function celsius returns the Celsius equivalent of a Fahrenheit temperature (Hint: 0 Celsius is equal to 32 Fahrenheit and 100 Celsius is equal to 212 Fahrenheit).  
(b) Function Fahrenheit returns the Fahrenheit equivalent of a Celsius temperature.   
Use these functions to write a program that prints charts showing the Fahrenheit equivalent of all Celsius temperatures between 0 and 100 degrees, and the Celsius equivalent of all Fahrenheit temperatures between 32 and 212 degrees. Print the output neatly in a table. 


## Question 5

[Source Code](./q5.c)

The greatest common divisor of integers x and y is the largest integer that divides both x and y. Write a recursive function GCD that returns the greatest common divisor of x and y. The GCD of x and y is defined as follows: If y is equal to zero, then GCD(x, y) is x; otherwise GCD(x, y) is GCD(y, x % y) where % is the remainder operator.  