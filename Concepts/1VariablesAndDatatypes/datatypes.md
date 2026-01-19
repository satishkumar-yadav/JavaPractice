# Data Types

Java uses strong typing with primitive and non-primitive types to define memory allocation and operations.​

## Primitive Types

Include int (32-bit integer), char (16-bit Unicode), float/double (floating-point), boolean (true/false).
Example:

```
int num = 100;
float b = 2.5f;
double price = 19.99;
boolean flag = true;
char letter = 'A';
```

Primitive Data Types

```
| Type    | Size          | Example |
| ------- | ------------- | ------- |
| int     | 4 bytes       | 10      |
| float   | 4 bytes       | 10.5f   |
| double  | 8 bytes       | 10.55   |
| char    | 2 bytes       | 'A'     |
| boolean | JVM dependent | true    |
```

## Non-Primitive Types

Reference types like classes (e.g., String) and arrays; store references, not values.

✅ Class
String s = "Hello";

✅ Array
int[] arr = {1,2,3};

Example:

```
String name = "Java";
int[] arr = {1, 2, 3};
```

---

---

# Practice Questions: Data Types

## Basic (1-3)

1. Declare int, double, boolean vars and print.​ https://code-knowledge.com/java-data-types-exercises/
2. Assign char 'Z' and print.​ https://www.edureka.co/blog/data-types-in-java/
3. Create String var with "Hello".​ https://www.edureka.co/blog/data-types-in-java/

`// GPT`

- 1. What is data type?
- 2. Difference between primitive & non-primitive
- 3. Size of int?
- 4. Why float needs f?
- 5. Example of non-primitive
- 6. Default value of boolean

## Easy (4-7)

4. Declare array of 5 ints.​ https://www.edureka.co/blog/data-types-in-java/
5. Print size range of int vs long.​ https://www.hackerrank.com/challenges/java-datatypes/problem
6. Assign float value and cast to int.​ https://code-knowledge.com/java-data-types-exercises/
7. Use boolean in if condition.​ https://www.edureka.co/blog/data-types-in-java/

`// GPT`

- 7. Predict output:

```
char c = 65;
System.out.println(c);
```

```
✅ Answer
A

🔍 Dry Run
char stores Unicode value
ASCII / Unicode 65 = 'A'
Java converts int → char automatically
```

- 8. Can boolean store 1 or 0?
- 9. Why String is non-primitive?
- 10. Declare array of 5 integers
- 11. Default value of int instance variable
- 12. What is wrapper class?

## Medium (8-11)

8. Check if number fits byte/short/int/long ranges.​ https://www.hackerrank.com/challenges/java-datatypes/problem
9. Create 2D array and print element.​ https://www.edureka.co/blog/data-types-in-java/
10. String concatenation with primitives.​ https://www.edureka.co/blog/data-types-in-java/
11. Default values: print uninit primitive vs reference.​ https://techtipnow.in/fundamentals-of-java-class-12-notes/

`// GPT`

- 13. Type casting example
- 14. Predict output:

```
int a = 'A';
System.out.println(a);
```

```
✅ Answer
65

🔍 Dry Run
'A' → Unicode 65
Stored into int
Printed as number
```

- 15. Difference between float and double
- 16. Memory allocation of array
- 17. Why char is 2 bytes?
- 18. Explain reference variable

## Hard (12-15)

12. Overflow: int max +1, observe wrap-around.​ https://www.hackerrank.com/challenges/java-datatypes/problem
13. Array of Strings, access via index.​ https://www.edureka.co/blog/data-types-in-java/
14. Type promotion: byte + int to double.​ https://code-knowledge.com/java-data-types-exercises/
15. Varargs as non-primitive simulation. https://www.edureka.co/blog/data-types-in-java/

`// GPT`

- 19. Predict output:

```
double d = 10/3;
System.out.println(d);
```

```
✅ Answer
3.0

🔍 Dry Run
10/3 → both int
Integer division → 3
Assigned to double → 3.0
⚠️ To get 3.333, use:

double d = 10.0/3;
```

- 20. Explain implicit vs explicit casting
- 21. Why boolean size not fixed?

- 22. Can array store mixed types?

```
❓ Can array store mixed types?

✅ Answer
❌ NO (except Object[])

int[] arr = {1,2,3};      // valid
// int[] arr = {1, "a"}; // invalid
```

- 23. Difference between String and char[]
- 24. Memory diagram of primitive vs object
- 25. Why Java is strongly typed?
