import java.util.*;
import bank;


// class Pen {
//     String color; //Properties
//     String type;
//     // functions defined in a class are called methods
//     public void write() {
//         System.out.println("Writing something");
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }
//     public void printType() {
//         System.out.println(this.type);
//     }
// }
// public class OOPS {
    // public static void main(String[] args){
    //     Pen pen1 = new Pen(); // defining the object
    //     pen1.color = "Blue";  // defining object's properties
    //     pen1.type = "Gel";
    //     Pen pen2 = new Pen();
    //     pen2.color = "Black";
    //     pen2.type = "Ballpoint";

    //     pen1.printColor();
    //     pen2.printColor();
    //     pen1.printType();
    //     pen2.printType();
    // }


// CLASSES, OBJECTS AND CONSTRUCTORS ---------------------------------
// class Student {
//     String name;
//     int age;    
//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

    // // 1)Non parameterized constructor
    // Student() {
    //     System.out.println("constructor called");
    // }
    

    // // 2)Parameterized constructor
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    // // 3)Copy constructor
    // Student(Student s2) {
    //     this.name = name;
    //     this.age = age;
    // }

    // Student() {

    // }

// }
 
// public class OOPS {
    // public static void main(String[] args) {
        // // 1)in case of non parameterized contructor
        // Student s1 = new Student();  //here, new allocates the object in memory heap and Student() is the constructor here
        // s1.name = "Arsh";
        // s1.age = 21;

        // // 2)in case of parameterized constructor
        // Student s1 = new Student("Arsh", 21);

        // // 3)in case of copy constructor
        // Student s1 = new Student();
        // s1.name = "Arsh";
        // s1.age = 21;

        // Student s2 = new Student(s1);
        // s2.printInfo();

    //     s1.printInfo();
    // }
// }

// // POLYMORPHISM-------------------------------------------------------------
// class Student {
//     String name;
//     int age;

//     // using same function for different purposes
//     public void printInfo(String name) {
//         System.out.println(name);
//     }
//     public void printInfo(int age) {
//         System.out.println(age);
//     }
//     public void printInfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }
//     // creating many functions with the same name is known as FUNCTION OVERLOADING
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Arsh";
//         s1.age = 21;

//         s1.printInfo(s1.name, s1.age);
//     }
// }

// INHERITANCE -----------------------------------------------------------
// class Shape {
//     String color;
// }
// // now many shapes have distinct properties(perimeter, area etc), so all cant be defined with one class so we make another class
// class Triangle extends Shape {         //extends - takes properties of shape class
    
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "red";             //now we didnt define any property named 'color' in triangle class, still it will show
        
//     }
// }

// // single level inheritance
// class Shape {
//     public void area() {
//         System.out.println("displays area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(1/2 * l * h);
//     }
// }

// // for multilevel inheritance - add another derived class under first derived class
// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1/2 * l * h);
//     }
// }

// // for hierarchial inheritance - add another derived class under base class
// class circle extends Shape {
//     public void area(int r) {
//         System.out.println((3.14)*r*r);
//     }
// }

// // for Hybrid inheritance - add all above types of inheritance, i.e - single, multi level and hierarchial
// public class OOPS {
//     public static void main(String[] args) {
        
//     }
// }

// // ENCPSULATION PART IN Bank.java FILE
// public class OOPS {
//     public static void main(String[] args) {
//         bank.Account account1 = new bank.Account();
//         account1.name = "Customer1";
//     }
// }

// // ABSTRACTION
// // abstract class - the base class which doesnt involve any specific function after derived classes are made
// abstract class Animal {
//     abstract void walk();                          //abstract method
//     public void eats() {                           //non abstract method
//         System.out.println("yes animal eats");
//     }
// }

// class Horse extends Animal {
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Horse horse1 = new Horse();
//         horse1.walk();
//         horse1.eats();
//         // lets see for animal class
//         Animal animal1 = new Animal();
//         animal1.walk();   //this will not instantiate in output
//     }
// }

// // INTERFACES
// interface Animal {
//     public void walk();
// }

// class Horse implements Animal{
//     public void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
        
//     }
// }

// STATIC KEYWORD - serves common features in a class, 
class Student {
    String name;
    static String school;  // static as in 1 school, all students will have the common school name 
}

public class OOPS{
    public static void main(String[] args) {
        // now school being a static property, it can be called directly and will serve as a common property for all properties in class
        Student.school = "RIS";
        // whereas name not being static, cannot be declared without a new object
        Student student1 = new Student();
        student1.name = "Arsh";
        System.out.println(student1.school);
    }

}