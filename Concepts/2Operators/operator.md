# Operators

Operators perform computations on operands, categorized by functionality.​

## Arithmetic Operators

+, -, \*, /, % for basic math. Example: int sum = 10 + 5; results in 15.​

## Unary Operators

++ (increment), -- (decrement), !, +/-. Example: int x = 5; x++; makes x=6.​

## Relational Operators

==, !=, >, <, >=, <= for comparisons. Example: 5 > 3 returns true.​

## Logical Operators

&& (AND), || (OR), ! (NOT). Example: (true && false) is false.​

## Bitwise Operators

& (AND), | (OR), ^ (XOR), ~, <<, >>, >>>. Example: 5 & 3 is 1.​

## Ternary Operator

condition ? expr1 : expr2. Example: int max = (10 > 5) ? 10 : 5; is 10.​

## Instanceof Operator

Checks object type. Example: "Hello" instanceof String is true.

```
String s = "Java";
System.out.println(s instanceof String);
```

---

---

# Practice Questions: Operators

## Basic (1-3)

1. Compute 10 + 5 \* 2 (precedence?).​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
2. Use == for 3 == 3.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
3. Ternary: max of 7, 4.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary

`// GPT`

- 1. List arithmetic operators
- 2. Difference between && and &
- 3. Example of ternary operator
- 4. What does instanceof return?
- 5. Unary operator example
- 6. Modulus use case

## Easy (4-7)

4. Bitwise & on 6 & 3.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
5. Logical &&: true && false.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
6. Post-increment: int x=5; System.out.println(x++);​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
7. instanceof: new Object() instanceof Object.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary

`// GPT`

- 7. Predict output:

```
int x = 5;
System.out.println(x++ + ++x);
```

```
✅ Answer
12

🔍 Dry Run
| Step       | Value              |
| ---------- | ------------------ |
| Initial x  | 5                  |
| x++        | uses 5, then x → 6 |
| ++x        | x → 7, uses 7      |
| Expression | 5 + 7 = 12         |

```

- 8. Output of logical OR
- 9. Bitwise AND example
- 10. When to use ternary?
- 11. Relational operator result type?
- 12. Difference between == and equals()

## Medium (8-12)

8. Shift: 8 >> 1.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
9. Compound: x += 3 \* 2.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
10. Chain relational: 1 < 2 < 3 (trick?).​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
11. Bitwise XOR ^ for flags toggle.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
12. Ternary nested for grade A/B/C.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary

`// GPT`

- 13. Operator precedence
- 14. Predict output:

```
int a=10,b=20;
System.out.println(a>b && b++>10);
System.out.println(b);
```

```
✅ Answer
false
20

🔍 Dry Run
a > b → 10 > 20 → false
&& → short-circuit
b++ NOT executed
b remains 20
```

- 15. Short circuiting
- 16. Left shift example
- 17. XOR truth table
- 18. instanceof with inheritance

## Hard (13-15)

13. Simulate power using <<.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
14. Swap two vars without temp using ^.​ https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary
15. Check even/odd with % and bitwise &. https://learncodewithdurgesh.com/tutorials/core-java-tutorial-for-beginners/java-operators-arithmetic-relational-logical-bitwise-ternary

`// GPT`

- 19. Predict output:

```
int a = 5;
int b = a++ + ++a;
System.out.println(b);
```

```
✅ Answer
12

🔍 Dry Run
| Step  | a                   |
| ----- | ------------------- |
| Start | 5                   |
| a++   | use 5 → a becomes 6 |
| ++a   | a becomes 7 → use 7 |
| Sum   | 5 + 7 = 12          |

```

- 20. Write custom max using ternary
- 21. Debug bitwise logic error
- 22. Explain signed vs unsigned shift

- 23. Can instanceof be used with primitives?

```
❓ Can instanceof be used with primitive?

✅ Answer
❌ NO

int a = 10;
// a instanceof Integer ❌

Reason: instanceof works only with objects
```

- 24. Why logical operators return boolean?
- 25. Write expression covering all operators
