# Variables

Variables store data values during program execution.
A variable is a container that stores data in memory.
Java categorizes them into local, instance (non-static), and static types, each with distinct scopes and lifetimes.
`int age = 25;`
​

## Local Variables

- Declared inside methods or blocks;
- exist only within that scope and must be initialized before use.
- No default value
- Scope limited to block
- ❌ Error if used outside method
  Example:

```
public class Example {
    public static void main(String[] args) {
        int localVar = 10;  // Local variable
        System.out.println(localVar);
    }

    void show() {
    int x = 10; // local variable
    System.out.println(x);
}

}
```

## Instance Variables (Non-Static)

- Declared without static keyword in classes;
- belong to objects and default-initialized if not set.
- Declared inside class but outside methods
  Example:

```
public class Example {
 int instanceVar = 20; // Instance variable
 String name; // default null
 public static void main(String[] args) {
 Example obj = new Example();
 System.out.println(obj.instanceVar);
 }
}
```

## Static Variables

- Shared across all instances(objects), declared with static;
- accessed via class name.
- Memory allocated once
  Example:

```
public class Example {
 static int staticVar = 30; // Static variable
 static String collegeName = "ABC College";
 public static void main(String[] args) {
 System.out.println(Example.staticVar);
 }
}
```

🔎 Comparison Summary

```
| Feature       | Local  | Instance | Static      |
| ------------- | ------ | -------- | ----------- |
| Scope         | Method | Object   | Class       |
| Default value | ❌      | ✅        | ✅           |
| Memory        | Stack  | Heap     | Method Area |
| Keyword       | ❌      | ❌        | static      |

```

---

---

# Practice Questions: Variables

## Basic (1-3)

1. Declare a local variable named 'age' of type int and assign 25.​ https://code-knowledge.com/java-data-types-exercises/
2. Create an instance variable 'salary' as double.​ https://www.datacamp.com/doc/java/java-variables
3. Declare and print a static variable 'count' initialized to 0.​ https://www.geeksforgeeks.org/java/java-programming-basics/

`// GPT`

- 1. What is a variable?
- 2. Difference between local and instance variable?
- 3. Can a local variable have default value?
- 4. Write syntax of static variable
- 5. Which memory stores static variables?
- 6. Identify variable type: static int count;

## Easy (4-6)

4. Write code to initialize and print local, instance, static vars in a method.​ https://www.geeksforgeeks.org/java/java-programming-basics/
5. Explain scope difference between local and static vars.​ https://www.datacamp.com/doc/java/java-variables
6. Declare instance var without init; print its default value. https://www.datacamp.com/doc/java/java-variables​

`// GPT`

- 7. Predict output:

```
class Test {
    int x = 5;
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }
}
```

```
✅ Answer
5

🔍 Dry Run
1. Class Test loaded
2. main() starts
3. new Test() → object created in heap
4. Instance variable x = 5 stored inside object
5. t.x accesses instance variable
6. Printed value = 5
```

- 8. Can static variable be accessed without object?
- 9. Write program using local variable
- 10. What happens if local variable not initialized?
- 11. Can instance variable be static?
- 12. Why static variables are shared?

## Medium (7-10)

7. Create class with instance var, modify via object, print for two objects.​ https://www.datacamp.com/doc/java/java-variables
8. Use static var incremented in main and non-static method. https://www.geeksforgeeks.org/java/java-programming-basics/
9. Show error if local var used without init.​ https://code-knowledge.com/java-data-types-exercises/
10. Compare memory sharing: static vs instance for multiple objects.​ https://www.datacamp.com/doc/java/java-variables

`// GPT`

- 13. Predict output:

```
class Demo {
    static int x = 10;
    int y = 20;
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.x = 50;
        d2.y = 100;
        System.out.println(d1.x + " " + d2.y);
    }
}
```

```
✅ Answer
50 100

🔍 Dry Run
x is static → one copy shared
y is instance → separate per object

Steps:
1. x = 10 (class level)
2. d1 created → y = 20
3. d2 created → y = 20
4. d1.x = 50 → static x becomes 50
5. d2.y = 100 → only d2’s y changes
6 Print:
      d1.x → 50
      d2.y → 100
```

- 14. Memory diagram of static vs instance
- 15. Why static variables reduce memory?
- 16. Can local variable be static?
- 17. How many copies of static variable exist?
- 18. Use case of static variable

## Hard (11-13)

11. Class with static block initializing static var; print sequence.​ https://www.geeksforgeeks.org/java/java-programming-basics/
12. Method-local class accessing outer instance var.​ https://www.datacamp.com/doc/java/java-variables
13. Shadowing: local var same name as instance var. https://code-knowledge.com/java-data-types-exercises/

`// GPT`

- 19. Predict output:

```
class A {
    static int x = 5;
    int y = 10;
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.x = 20;
        a2.y = 30;
        System.out.println(a1.x + " " + a1.y);
    }
}
```

```
✅ Answer
20 10

🔍 Dry Run
x is static → shared
y belongs to object

Steps:
1. x = 5
2. a1 → y = 10
3. a2 → y = 10
4. a1.x = 20 → static updated
5. a2.y = 30 → affects only a2
6. Print:
         a1.x → 20
         a1.y → 10 (unchanged)
```

- 20. Explain variable shadowing
- 21. Write code showing static vs instance conflict
- 22. Explain lifecycle of local variable
- 23. Why static variables cannot access non-static directly?
- 24. Debug scenario where variable not updating
- 25. Write program showing shared static value
