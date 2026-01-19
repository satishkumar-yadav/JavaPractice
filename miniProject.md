# 🧩 MINI PROJECT

## Student Management System (Console-Based)

This project uses ONLY what you’ve learned so far:

- variables
- data types
- operators
- if / switch
- loops
- arrays
- Scanner
  ❌ No OOP yet (we’ll upgrade it later)

### 🎯 FEATURES

1. Add student
2. View all students
3. Search student by ID
4. Update student marks
5. Exit

### 🧠 DATA MODEL (Simple & Clear)

We will use parallel arrays:

```
int[] ids
String[] names
int[] marks
int count   // number of students stored
```

### ✅ FULL WORKING CODE

```
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ids = new int[100];
        String[] names = new String[100];
        int[] marks = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: // ADD
                    System.out.print("Enter ID: ");
                    ids[count] = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student added successfully!");
                    break;

                case 2: // VIEW
                    if (count == 0) {
                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\nID\tName\tMarks");
                    for (int i = 0; i < count; i++) {
                        System.out.println(ids[i] + "\t" + names[i] + "\t" + marks[i]);
                    }
                    break;

                case 3: // SEARCH
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ids[i] == searchId) {
                            System.out.println("Found: " + names[i] + " | Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 4: // UPDATE
                    System.out.print("Enter ID to update marks: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (ids[i] == updateId) {
                            System.out.print("Enter new marks: ");
                            marks[i] = sc.nextInt();
                            updated = true;
                            System.out.println("Marks updated!");
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

```

### 🧪 SAMPLE RUN (VERY IMPORTANT)

```
1. Add Student
Enter ID: 101
Enter Name: Rahul
Enter Marks: 85

1. Add Student
Enter ID: 102
Enter Name: Anita
Enter Marks: 90

2. View Students
ID   Name    Marks
101  Rahul   85
102  Anita   90

3. Search Student by ID
Enter ID: 102
Found: Anita | Marks: 90

4. Update Marks
Enter ID: 101
Enter new marks: 88
Marks updated!

```

### 🔍 DRY RUN (CORE LOGIC)

```
Adding student
- count = 0
- Data stored at index 0
- count++ → now 1

Searching
- Loop runs from 0 → count-1
- If ID matches → found
- Uses boolean flag (VERY IMPORTANT pattern)
```

⚠️ IMPORTANT BREAKPOINT TEST CASES

```
| Case                   | Why                   |
| ---------------------- | --------------------- |
| View before adding     | Empty data            |
| Search wrong ID        | Not found logic       |
| Update wrong ID        | Flag logic            |
| Add > 100 students     | Array overflow        |
| Enter string after int | Scanner newline issue |

```

# 🧠 WHAT YOU LEARNED (INTERVIEW GOLD)

✔ Menu-driven programs
✔ Flag-based searching
✔ Loop + condition combo
✔ Scanner pitfalls
✔ Real-world logic flow

🚀 NEXT UPGRADE PATH (VERY IMPORTANT)

Now we LEVEL UP this SAME project:

👉 Option A: Convert this to OOP version
(classes, objects, constructors)

👉 Option B: Add grading system + pass/fail logic

👉 Option C: Another mini project

ATM System

Banking App

Library Management

👉 Option D: Start OOP from scratch
