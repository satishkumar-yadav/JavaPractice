# 🔥 FINAL EXAM / INTERVIEW BREAKPOINTS

🔥 IMPORTANT BREAKPOINT TEST CASES (EXAM FAVORITES)

## 1️⃣ Integer Division Trap

```
System.out.println(5/2);   // 2
System.out.println(5/2.0); // 2.5
```

## 2️⃣ Static Trap

```
static int x = 10;
x = 50; // affects ALL objects
```

## 3️⃣ Short Circuit

```
false && (++x > 0); // ++x NOT executed
```

## 4️⃣ Post vs Pre

```
int x=1;
System.out.println(x++); // 1
System.out.println(++x); // 3
```

## 1️⃣ else binding

```
if(a)
   if(b)
      X
   else
      Y  // binds to inner if
```

## 2️⃣ Loop exit priority

```
break > continue > condition
```

## 3️⃣ switch works with

```
- byte, short, int, char
- String
- enum
❌ NOT float/double

```

## 4️⃣ next() vs nextLine()

```
| Method     | Reads       |
| ---------- | ----------- |
| next()     | single word |
| nextLine() | full line   |

```
