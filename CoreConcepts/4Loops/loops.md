# Loops

Loops repeat code blocks until a condition fails.​

## For Loop

Known iterations: for (init; condition; update) { ... }. Example: Print 1-5.​
`for(int i=1;i<=5;i++)`

## While Loop

Condition-checked before: while (condition) { ... }.​

## Do-While Loop

Executes once, checks after: do { ... } while (condition);. Example for input validation.​

## For-Each Loop - only for iterables

Iterates arrays/collections: for (type var : array) { ... }.
`for(int x : arr)`

---

---

# Practice Questions: Loops

## Basic (1-3)

1. For loop print 1-10.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
2. While sum 1 to 5.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
3. Do-while print once.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions

`// GPT`

- 1. Types of loops
- 2. When to use do-while?
- 3. Infinite loop example
- 4. Loop control variables
- 5. Syntax of for-each
- 6. Loop exit condition

## Easy (4-7)

4. Enhanced for on {1,2,3}.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
5. While factorial input.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
6. For table of 5.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
7. Do-while menu yes/no.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions

`// GPT`

- 7. Print 1–10
- 8. Sum of numbers

- 9. Reverse number

```
Q9 — Reverse a number
int n = 123, rev = 0;
while(n != 0) {
    int d = n % 10;
    rev = rev * 10 + d;
    n = n / 10;
}
System.out.println(rev);

✅ Output
321

🔍 Dry Run
| n   | d    | rev |
| --- | ---- | --- |
| 123 | 3    | 3   |
| 12  | 2    | 32  |
| 1   | 1    | 321 |
| 0   | exit |     |

```

- 10. Factorial program

```
Q10 — Factorial
int n = 5, fact = 1;
for(int i=1;i<=n;i++)
    fact *= i;
System.out.println(fact);

✅ Output
120
```

- 11. Multiplication table
- 12. Count digits

## Medium (8-12)

8. Nested for: 5x5 star pattern.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
9. While Fibonacci till 100.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
10. Break at sum>100.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
11. Continue skip evens.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
12. For reverse 10-1.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions

`// GPT`

- 13. Nested loops

```
Q14 — Nested loop
for(int i=1;i<=3;i++) {
    for(int j=1;j<=2;j++) {
        System.out.print(i + "" + j + " ");
    }
}

✅ Output
11 12 21 22 31 32

🔍 Dry Run
Outer loop controls rows
Inner loop runs fully for each outer iteration
```

- 14. Pattern printing
- 15. Prime number
- 16. Fibonacci series

- 17. Break vs continue

```
Q17 — break vs continue
for(int i=1;i<=5;i++) {
    if(i==3) continue;
    System.out.print(i + " ");
}

✅ Output
1 2 4 5

🔍 Dry Run
When i==3 → skip print only
Loop continues
```

- 18. Loop dry run

## Hard (13-15)

13. Labeled break in nested loops.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
14. Infinite while prevented by counter.​ https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions
15. GCD with while Euclid algo. https://www.codingshuttle.com/java-programming-handbook/java-flow-control-interview-questions

`// GPT`

- 19. Predict output (nested loops)

```
Q19 (Hard) — Predict Output
int i = 1;
while(i <= 5) {
    if(i == 3)
        break;
    System.out.print(i + " ");
    i++;
}

✅ Output
1 2

🔍 Dry Run

i=3 → break → loop stops immediately
```

- 20. Remove infinite loop bug

```
Q21 — Infinite loop bug
int i = 1;
while(i <= 5) {
    System.out.println(i);
}

❌ Problem

i never increments

Infinite loop

✅ Fix
i++;
```

- 21. Loop optimization
- 22. for vs while memory

- 23. for-each limitations

```
Q24 — for-each limitation
int[] arr = {1,2,3};
for(int x : arr) {
    x = x * 2;
}
System.out.println(arr[0]);

✅ Output
1

🔍 Reason
x is copy of element
Original array not modified
```

- 24. Real-world looping example
- 25. Debug complex iteration
