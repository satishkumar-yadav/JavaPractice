# Scanner Class

Scanner reads user input from console via import java.util.Scanner.​

Basic Usage
Create Scanner object: Scanner sc = new Scanner(System.in);.

## Important methods

- nextInt()
- nextFloat()
- next()
- nextLine()
- nextDouble()

⚠️ nextLine() issue after nextInt()
Example:

```
Scanner sc = new Scanner(System.in);
System.out.print("Enter name: ");
String name = sc.nextLine();
int x = sc.nextInt();
String s = sc.next();
sc.close();

//Always close Scanner to free resources.
```

---

---

# Practice Questions: Scanner

## Basic (1-3)

1. Read int via nextInt(), print.​ https://www.programiz.com/java-programming/scanner
2. Read String via nextLine().​ https://www.programiz.com/java-programming/scanner
3. Read double input.​ https://www.programiz.com/java-programming/scanner

`// GPT`

- 1. Why Scanner used?
- 2. Import statement?
- 3. Difference between next() and nextLine()
- 4. Input integer example
- 5. What happens if wrong input type?
- 6. Scanner package name?

## Easy (4-6)

4. Read name and age, print greeting.​ https://www.programiz.com/java-programming/scanner
5. next() vs nextLine() difference demo.​ https://www.programiz.com/java-programming/scanner
6. Read multiple ints in loop.​ https://sircrrengg.ac.in/images/newsletter/ITMATERIALS/JP.pdf

`// GPT`

- 7. Program to add two numbers
- 8. Input name and age

- 9. Predict output with nextLine()

```
Q9 — Input skipping issue

``
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
String name = sc.nextLine();
System.out.println(name);
``

❌ Problem
- nextInt() leaves newline
- nextLine() reads empty line

✅ Fix
sc.nextLine(); // consume leftover newline
```

- 10. Close scanner – why?
- 11. Can Scanner read char?
- 12. Multiple inputs example

## Medium (7-10)

7. Read line after int (handle newline bug).​ https://www.programiz.com/java-programming/scanner
8. Validate positive number input. https://www.exercisesjava.com/flow-controls-loops/access-control/​
9. Read array size then elements.​ https://www.programiz.com/java-programming/scanner
10. Sum numbers until 0 input.​ https://sircrrengg.ac.in/images/newsletter/ITMATERIALS/JP.pdf

`// GPT`

- 13. Fix input skipping issue

- 14. Read full sentence

```
Q13 — Read full sentence
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();
System.out.println(line);

✅ Reads entire line including spaces
```

- 15. Input validation logic
- 16. Scanner vs BufferedReader
- 17. Read array using Scanner
- 18. Handle InputMismatchException

## Hard (11-13)

11. Read delimited inputs (e.g., CSV line).​ https://www.programiz.com/java-programming/scanner
12. Exception handling for invalid int input.​ https://www.programiz.com/java-programming/scanner
13. Menu loop: read choice 1-3, repeat till 0. https://www.exercisesjava.com/flow-controls-loops/access-control/

`// GPT`

- 19. Predict output with mixed inputs

```
Q19 (Hard) — Mixed input
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
double b = sc.nextDouble();
System.out.println(a + b);

🧪 Input
10
5.5

✅ Output
15.5

```

- 20. Design menu-driven program
- 21. Debug input crash
- 22. Scanner performance issue

- 23. Why Scanner is slow?

```
✅ Answer

Uses regex internally
Suitable for small programs
Avoid in competitive programming
```

- 24. When not to use Scanner?
- 25. Real-life input scenario program
