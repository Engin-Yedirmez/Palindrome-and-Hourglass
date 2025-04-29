## 🧮 Palindrome Checker & Hourglass Printer

This repository contains two Java console applications written as part of a Computer Engineering assignment. The programs use only fundamental programming constructs like `int`, `if/else` conditions, and loops—**without using strings or arrays**—to meet the requirements.

### 📌 1. Palindrome Checker (7-digit Integers)

This program:
- Repeatedly prompts the user to enter a **7-digit integer**.
- Checks if the number is a **palindrome** (reads the same forward and backward).
- Displays an **alert message** if the number is not 7 digits long.
- Continues running until the user enters **-1**.

🚫 *Strings and advanced classes are not used.*  
✅ Only `int`, loops, and conditionals are used to reverse the number and compare it.

### 🧵 2. Hourglass Pattern Printer

This program:
- Asks the user to input a number to determine the size of an **hourglass pattern**.
- Prints a **symmetric hourglass** made of asterisks (`*`) depending on whether the input is **even or odd**.
- Continues running until the user inputs **"q"** to quit.

### 🛠️ Technologies Used
- Java (JDK 8+)
- Command-line input/output (`Scanner`, `System.out.print`)
- Loops and conditionals only (no arrays or strings)

### 🧪 Sample Input/Output

#### Palindrome Checker:

Enter a 7-digit number: 1234321 This number is a palindrome!

Enter a 7-digit number: 1234567 Not a palindrome.

Enter a 7-digit number: 1234 Invalid input! Please enter a 7-digit number.

Enter a 7-digit number: -1 Program terminated.

#### Hourglass Printer:

Enter initial star number: 10
**********
********
******
****
**
**
****
******
********
**********
Enter initial star number: 5
*****
***
*
***
*****
Enter initial star number: q
Program Terminates

### 📄 License
This project was developed for educational purposes and is shared as a sample academic assignment.
