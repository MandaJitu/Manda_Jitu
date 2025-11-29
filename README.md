# Coding Language: JAVA

# PROGRAM-1:
  This is a basic calculator program written in Java using **classes and methods**.  
  It performs four mathematical operations:
  
  ✔ Addition
  ✔ Subtraction  
  ✔ Multiplication  
  ✔ Division  
  
  The program takes **two numbers** and an **operator(+, -, *, /)** as input, processes them, and prints the result.
  
  ---
  
  ## 📌 Features
  
  - Implemented using **separate functions** for each operation  
  - Uses **switch-case** for operator selection  
  - Beginner-friendly and easy to understand  
  - Works for decimal (`double`) type numbers  
  - Good program to learn method usage and user input handling in Java
  
  ---
  
  ## 🛠 Technologies Used
  
  | Component | Value |
  |----------|--------|
  | Language | Java |
  | Input Method | Scanner Class |
  | Data Types | double (a, b), String (operation) |
  
  ---
  
  ## 📂 Program Flow
  
  1. User enters first number  
  2. User enters second number  
  3. User chooses operation (`+`, `-`, `*`, `/`)  
  4. Program uses `calculate()` to process values  
  5. Output is displayed on screen


# PROGRAM-2:
  This Java program prints a number series containing the first **n odd numbers**, starting from **1**.  
  The user provides an input `n`, and the program outputs the sequence in the format:
  
  ## 📌 Problem Requirement
  > Take one integer input `n` and generate a series as shown:
  
  | Input | Output |
  |-------|---------|
  | 1     | 1       |
  | 2     | 1, 3    |
  | 3     | 1, 3, 5 |
  | 4     | 1, 3, 5, 7 |
  | x     | 1, 3, 5, 7, ... (first x odd numbers) |
  
  The goal is to print numbers sequentially, separated by commas.
  
  ---
  
  ## 🛠 Technologies Used
  
  | Component | Description |
  |----------|-------------|
  | Language | Java |
  | Input | Scanner Class |
  | Output Format | Comma-separated series |
  
  ---
  
  ## 🧠 Logic Used
  
  1. Initialize array of size `n`
  2. Start first number as **1**
  3. Add next odd number by incrementing **num += 2**
  4. Print sequence with commas using loop


# PROGRAM-3:
  A simple Java program that generates a sequence of odd numbers from **1** up to the nearest odd value of the input number.

  ---
  
  ## 📌 Problem Description
  
  Given an integer `a`, generate the following sequence:
  
  | Input (a) | Output |
  |----------|------------------|
  | 1 | 1 |
  | 2 | 1 |
  | 3 | 1, 3, 5 |
  | 4 | 1, 3, 5 |
  | 5 | 1, 3, 5, 7, 9 |
  | 6 | 1, 3, 5, 7, 9 |
  | x | 1, 3, 5, 7, ... |
  
  > If the input is even, the program subtracts 1 to generate only odd numbers.
  
  ---
  
  ## 🧠 How It Works
  
  - Take an integer input from the user.
  - If the number is **even**, reduce it by 1 (convert to nearest odd).
  - Generate and print odd numbers starting from 1.
  - Display result in comma-separated form.


# PROGRAM-4:
  This Java program counts how many numbers in a given list are divisible by **each number from 1 to 9**.  
  It returns the result as a dictionary-style output where the key is the divisor, and the value is the count of numbers divisible by it.
  
  ---
  
  ## 📌 Problem Statement
  
  Given an input list of numbers, generate the count of how many numbers are divisible by: [1,2,3,4,5,6,7,8,9]
  ### Example
  **Input:** [1,2,8,9,12,46,76,82,15,20,30]
  **Output:** {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
  
  ---

  ## 🧠 Program Working Explained
  
  - Iterate from **1 to 9**.
  - For each number `i`, check how many elements in the array are divisible by `i`.
  - Store divisor → count mapping inside a `HashMap`.
  - Finally print the output in dictionary format.
  
