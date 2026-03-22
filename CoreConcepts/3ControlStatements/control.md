# Control Flow: If-Else and Switch

Control flow directs code execution based on conditions.​

## If-Else

### Simple:

if (condition)
{ ... }
else
{ ... }.

```
if(age >= 18) {
    System.out.println("Adult");
}
```

### Nested:

Multiple if-else chains. Example:

```
int score = 85;
if (score >= 90) {
 System.out.println("A");
} else if (score >= 80) {
 System.out.println("B");
} else {
 System.out.println("C");
}
```

## Switch

Multi-way branch for exact matches (int, String, enum). Example:

```
int day = 2;
switch (day) {
 case 1: System.out.println("Monday"); break;
 case 2: System.out.println("Tuesday"); break;
 default: System.out.println("Other");
}
```

---

---

# Practice Questions: Control Flow

## Basic (1-3)

1. If score > 50, print pass.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
2. Nested if: age >=18 && citizen.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
3. Switch on char 'A'.​ https://mrcet.com/downloads/digital_notes/ECE/III%20Year/Java.pdf

`// GPT`

- 1. Syntax of if
- 2. When to use switch?
- 3. Default case purpose
- 4. Can if be nested?
- 5. switch works with which data types?
- 6. Break statement use

## Easy (4-7)

4. else-if ladder for grades.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
5. Switch on String "red".​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
6. Leap year check (div 4 not 100 or 400).​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
7. Positive/negative/zero if-else.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more

`// GPT`

- 7. Even or odd program

```
Q7 — Even or Odd
int n = 10;
if(n % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");

✅ Output
Even

🔍 Dry Run
10 % 2 = 0
Condition true → prints Even
```

- 8. Largest of 3 numbers

```
Q8 — Largest of 3 numbers
int a=10, b=20, c=15;

if(a>b && a>c)
    System.out.println(a);
else if(b>c)
    System.out.println(b);
else
    System.out.println(c);

✅ Output
20

🔍 Dry Run
1. a>b && a>c → false
2. b>c → 20>15 → true
3. Print 20
```

- 9. Grade system using if
- 10. Menu using switch

- 11. switch without break

```
Q11 — switch without break
int x = 2;
switch(x) {
    case 1: System.out.print("One ");
    case 2: System.out.print("Two ");
    case 3: System.out.print("Three ");
    default: System.out.print("Default");
}

✅ Output
Two Three Default

🔍 Dry Run
Match case 2
No break → fall-through happens
Executes case 2 → 3 → default
```

- 12. Predict output

## Medium (8-11)

8. Nested switch for menu options.​ https://mrcet.com/downloads/digital_notes/ECE/III%20Year/Java.pdf
9. Vowel/consonant with switch (char).​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
10. Max of 3 numbers with if-else.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
11. BMI category if-else chain.​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more

`// GPT`

- 13. Nested if example
- 14. Convert if to switch

- 15. Fall-through concept

```
Q15 — Fall Through Concept
int day = 1;
switch(day) {
    case 1:
    case 2:
    case 3:
        System.out.println("Weekday");
        break;
    default:
        System.out.println("Weekend");
}

✅ Output
Weekday

🔍 Dry Run
day = 1
Matches case 1 → jumps to common block
Prints Weekday
```

- 16. switch with String
- 17. Multiple conditions
- 18. Logical condition debugging

## Hard (12-15)

12. Rock-paper-scissors vs computer (nested if).​ https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more
13. Switch fall-through for ranges (pre-Java14).​ https://mrcet.com/downloads/digital_notes/ECE/III%20Year/Java.pdf
14. Enumerate day-of-week with switch enum.​ https://mrcet.com/downloads/digital_notes/ECE/III%20Year/Java.pdf
15. Quadratic roots: discriminant if-else. https://mayankblogs.hashnode.dev/java-decision-making-mastering-if-else-nested-if-switch-case-and-more

`// GPT`

- 19. Predict complex nested if

```
Q19 (Hard) — Nested if
int a = 5, b = 10, c = 15;

if(a > b)
    if(a > c)
        System.out.println(a);
    else
        System.out.println(c);
else
    System.out.println(b);

✅ Output
10

🔍 Dry Run
a > b → 5 > 10 → false
Goes to else
Prints b = 10

⚠️ Very common exam trap (else belongs to nearest if)
```

- 20. switch vs if performance
- 21. switch inside loop
- 22. Validate input range
- 23. Real-life decision program

- 24. Debug unreachable code

```
Q24 — Unreachable code
if(true) {
    System.out.println("Hello");
}
// else {
//     System.out.println("Hi"); // ❌ compile error
// }

✅ Explanation
else without if → unreachable
Java compiler error
```

- 25. Write clean conditional logic
