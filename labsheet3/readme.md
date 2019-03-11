# Lab Sheet 3

## Question 1

[Source Code](./q1.c)

Because of the high price of petrol, you are concerned with the fuel consumption of your car.
As a result you have a record of the kilometers driven and liters used for each tank of petrol you purchase.
Write a program that will display the kilometers driven, liters used, and consumption (in litres/100km) for each tankful.
After processing all the input information, the program should calculate the overall average consumption: (Hint The liters/100km is (Liters/KM driven) x 100)

### output:
|  Enter the liters used (-1 to end): 57.6  |
|  Enter the kilometers driven: 459  |
|  The liters/100km for this tank was 12.5 |
|  Enter the liters used (-1 to end): 45.3 |
|  Enter the kilometers driven: 320  |
|  The liters/100km for this tank was 14.2 |
|  Enter the liters used (-1 to end): -1  |
|  The overall average consumption was: 13.4 |


## Question 2

[Source Code](./q2.c)

Write a C program that uses a while loop to calculate and print the sum of the even integers from 1 to 30. 

## Question 3

[Source Code](./q3.c)

Write a C program that uses a while loop to calculate and print the product of the odd integers from 0 to 19.

## Question 4

[Source Code](./q4.c)

Write a program that reads in a four-digit number, separates the number into its individual digits and prints them separated by three spaces. Thus given the number 4233, the program should print: 
4   2   3   3 
(Hint use / and % operators)

## Question 5

[Source Code](./q5.c)

Write a C program that will determine if a department store customer has exceeded the credit limit on a charge account. For each customer, the following facts are available: 
* Account number 
* Balance at beginning of month 
* Total of all items charged by the customer this month 
* Total of all credits applied to the account this month 
* Allowed credit limit
The program should input each of these facts, calculate the new balance (initial balance + charges - credits) and determine if the new balance exceeds the credit limit. If it does, a suitable message should be displayed.

Enter account number (-1 to end): 100
Enter initial balance: 5394.78  
Enter total charges: 1000  
Enter total credits: 500.00  
Enter credit limit: 5500.00  
Account:  100  
Credit limit: 5500  
Balance:  5894.78  
Credit Limit Exceeded

Enter account number (-1 to end): 200 
Enter initial balance: 1000.00  
Enter total charges: 123.45  
Enter total credits: 321.00  
Enter credit limit: 1500.00   
Account:  200  
Credit limit: 1500  
Balance:  802.45 


## Question 6

[Source Code](./q6.c)

A large chemical company pays its sales staff on a commission basis. They receive £200 per week plus 9% of their gross sales for that week. For example, someone who sells £5000 of chemicals in one week will earn £200 plus 9% of £5000, a total of £650. Develop a C program that will input each salesperson’s sales for the previous week, and print out their salary. Process one person’s figures at a time.

Enter sales in pounds (-1 to end): 5000.00  
Salary is: 650.00   
Enter sales in pounds (-1 to end): 00.00 
Salary is: 200.00   
Enter sales in pounds (-1 to end): 1088.89  
Salary is: 298.00   
Enter sales in pounds (-1 to end): -1 
