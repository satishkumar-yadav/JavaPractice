# 🔹 MINI PROGRAM SET (JAVA FUNDAMENTALS)

## 🟢 1. Sum of digits of a number

❓ Problem

- Input: 1234 → Output: 10

✅ Code

```
int n = 1234, sum = 0;

while(n != 0) {
    sum += n % 10;
    n /= 10;
}

System.out.println(sum);

```

🧠 Dry Run

```
| n    | n%10 | sum |
| ---- | ---- | --- |
| 1234 | 4    | 4   |
| 123  | 3    | 7   |
| 12   | 2    | 9   |
| 1    | 1    | 10  |

```

## 🟢 2. Palindrome number

❓ Problem

- 121 → Palindrome

✅ Code

```
int n = 121, temp = n, rev = 0;

while(n != 0) {
    rev = rev * 10 + n % 10;
    n /= 10;
}

if(temp == rev)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
```

🧠 Breakpoints

- n = 0
- n = single digit
- n = 10 ❌ not palindrome

## 🟢 3. Prime number

❓ Problem

- Check if 29 is prime

✅ Code

```
int n = 29;
boolean prime = true;

if(n <= 1) prime = false;

for(int i = 2; i <= n/2; i++) {
    if(n % i == 0) {
        prime = false;
        break;
    }
}

System.out.println(prime ? "Prime" : "Not Prime");
```

🧠 Dry Run

- Loop runs till n/2
- Stops early if divisor found

## 🟢 4. Fibonacci series

❓ Problem

- Print first 5 numbers

✅ Code

```
int a = 0, b = 1;

for(int i = 1; i <= 5; i++) {
    System.out.print(a + " ");
    int c = a + b;
    a = b;
    b = c;
}
```

✅ Output
`0 1 1 2 3`

## 🟡 5. Armstrong number

❓ Problem

- 153 → 1³ + 5³ + 3³ = 153

✅ Code

```
int n = 153, temp = n, sum = 0;

while(n != 0) {
    int d = n % 10;
    sum += d * d * d;
    n /= 10;
}

System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
```

## 🟡 6. Count digits

```
int n = 12345, count = 0;

while(n != 0) {
    count++;
    n /= 10;
}

System.out.println(count);
```

⚠️ Test Case

- n = 0 → digits = 1 (special case)

## 🟡 7. Reverse string (no built-in)

```
String s = "JAVA";
String rev = "";

for(int i = s.length()-1; i >= 0; i--)
    rev += s.charAt(i);

System.out.println(rev);
```

## 🟡 8. Largest element in array

```
int[] arr = {2, 9, 1, 5};
int max = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max)
        max = arr[i];
}

System.out.println(max);
```

## 🔵 9. Second largest element

```
int[] arr = {10, 20, 5, 8};

int max = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for(int x : arr) {
    if(x > max) {
        second = max;
        max = x;
    } else if(x > second && x != max) {
        second = x;
    }
}

System.out.println(second);
```

⚠️ Breakpoint

- Duplicate max values

## 🔵 10. Count vowels in string

```
String s = "education";
int count = 0;

for(char c : s.toCharArray()) {
    if("aeiou".indexOf(c) != -1)
        count++;
}

System.out.println(count);
```

## 🔵 11. Pattern printing

```
*
**
***
```

```
for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

## 🔵 12. Number pyramid

```
1
12
123
```

## 🔴 13. Swap without 3rd variable

```
int a = 10, b = 20;

a = a + b;
b = a - b;
a = a - b;

System.out.println(a + " " + b);
```

⚠️ Overflow risk (important interview point)

## 🔴 14. Menu-driven program

```
Scanner sc = new Scanner(System.in);
System.out.println("1.Add 2.Sub");
int ch = sc.nextInt();

int a = 10, b = 5;

switch(ch) {
    case 1: System.out.println(a+b); break;
    case 2: System.out.println(a-b); break;
    default: System.out.println("Invalid");
}
```

## 🔴 15. Most IMPORTANT logic trap

```
int i = 1;

for(; i <= 5; i++);
System.out.println(i);
```

✅ Output
`6`

🔥 WHY?

- Semicolon ends loop
- Loop runs fully
- Print executes once

# 🧠 MASTER TEST CASES YOU MUST TRY

```
| Case             | Why            |
| ---------------- | -------------- |
| 0                | boundary       |
| 1                | minimum        |
| negative numbers | logic check    |
| duplicate values | array logic    |
| empty input      | Scanner issues |
```
