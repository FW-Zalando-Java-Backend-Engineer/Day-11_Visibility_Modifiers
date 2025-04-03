# **📘 Day-11: Java Classes, Objects, Modifiers & Type Casting**  
Welcome to **Day-11** of our Java learning journey! Today, we delve into the foundational pillars of **Object-Oriented Programming in Java**, covering classes, objects, constructors, memory management, method overloading, and **type casting**, alongside **access control** via visibility modifiers.

---

## **📌 Lesson Structure**

### **1️⃣ Java Class Basics**
- What is a **Class** and how is it a **template** for objects?
- **Object** creation and usage using the `new` operator.
- Java compilation & execution involving multiple classes.

### **2️⃣ Instance Variables and Memory Behavior**
- Each object maintains its **own copy** of instance variables.
- **Reference Assignment** vs. new memory allocation.
- How **Java manages memory** for objects and primitives.

### **3️⃣ Constructors & finalize()**
- Constructors vs. Methods: Purpose and syntax.
- **Constructor overloading** for flexibility.
- The `finalize()` method and its role before **Garbage Collection**.

### **4️⃣ The `this` Keyword**
- How `this` helps resolve **variable shadowing**.
- Common use cases and best practices.

### **5️⃣ Method and Constructor Overloading**
- **Polymorphism** through overloading.
- Differentiating methods by **number or type of arguments**.

### **6️⃣ Argument Passing**
- **Pass-by-value** vs **Pass-by-reference** behavior in Java.
- How primitives and object references differ in method calls.

### **7️⃣ Static Members**
- **Static variables**: shared across instances.
- **Static methods**: access restrictions.
- **Static blocks**: one-time initialization.

### **8️⃣ Nested Classes**
- **Static vs Non-static (Inner) Classes**.
- Scope, access rights, and use cases.

### **9️⃣ Access Modifiers in Java**
- Public, Private, Protected, Default: who can access what?
- Packages, classes, and inheritance implications.  
🔗 [Baeldung: Java Access Modifiers](https://www.baeldung.com/java-access-modifiers)  
🔗 [Medium: Access Modifiers Explained](https://medium.com/@nikhilsalvi011/access-modifiers-in-java-5c2db6d71142)

### **🔟 Type Casting in Java**
- **Widening Casting (Upcasting)**: safe and implicit.
- **Narrowing Casting (Downcasting)**: explicit and risky.
- Importance of `instanceof` and ClassCastException.  
🔗 [Baeldung: Object Type Casting in Java](https://www.baeldung.com/java-type-casting)

---

## **📜 Live Coding Examples**

### **🖥️ Class Definition and Object Creation**
```java
class Box {
    double width, height, depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        double volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is: " + volume);
    }
}
```

---

### **🖥️ Constructor Overloading Example**
```java
class Box {
    double width, height, depth;

    // Constructor with parameters
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Default constructor
    Box() {
        this.width = this.height = this.depth = 0;
    }

    double volume() {
        return width * height * depth;
    }
}
```

---

### **🖥️ Static Variable and Static Method**
```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }

    static void printCount() {
        System.out.println("Total objects: " + count);
    }
}
```

---

### **🖥️ Type Casting Example**
```java
class Animal {
    void speak() { System.out.println("Animal speaks"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}

public class CastingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.speak();

        if (a instanceof Dog) {
            Dog d = (Dog) a;   // Downcasting
            d.bark();
        }
    }
}
```

---

## **🎯 Hands-on Exercises**
✅ Create a class `Rectangle` with two constructors: one default and one parameterized.  
✅ Implement a `Student` class with `name`, `id`, and a static counter to track created students.  
✅ Write a program with a nested class to model `University -> Department`.  
✅ Simulate garbage collection by removing all references to an object and observing `finalize()` execution.  
✅ Use all four access modifiers in different classes and try accessing them from another package.

---

## **📚 Additional Resources**
- [Java Constructors – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)  
- [Java this Keyword – GeeksForGeeks](https://www.geeksforgeeks.org/this-reference-in-java/)  
- [Static Keyword in Java](https://www.baeldung.com/java-static)  
- [Java Nested Classes – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)  
- [Lesson Slides: Java Classes](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-11_Visibility_Modifiers/blob/main/_Java%20-%20Classes.pdf)
- [Video Lesson Recording](https://us06web.zoom.us/rec/share/UmkpV6tRK2eT4mIeEYSU6iBl8ZEzftkuZ_m4k5bFtznessO1gTWmEW6Q419-5w8T.PcnmnoWIDcdLFAVW?startTime=1743406592000)
- [Lesson Live Coding](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-11_Visibility_Modifiers/tree/main/Day_11)

---

🚀 **Amazing progress today! You're getting closer to building real-world Java apps. Let’s keep going strong!** 💪
