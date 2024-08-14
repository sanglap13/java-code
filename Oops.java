import student.Student;


//non parameterised contructor
class Car {
    String color;
    int maxSpeed;

    public void ride() {
        System.out.println("Car is riding");
    }

    public void printColor() {
        System.out.println("Color: " + this.color);
    }

}

//parameterised constructor
class Rider {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public Rider(String name, int age) {
        this.name = name;
        this.age = age;
    }


}


//polymorphism
//overloading
class Adder {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    
    }

    public void add(double a, double b) {
      System.out.println(a + b);
    }

    public void add(double a, double b, double c) {
       System.out.println(a + b + c);
    }
}

//inheritance
class Shape {
    String color;
}

class Circle extends Shape {
    double radius;

    public void printInfo() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Color: " + this.color);
    
    }
}

//abastraction
//abstract class
abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}


//interface
interface Animals {
    public void sound();
}

class Dog1 implements Animals {
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat1 implements Animals {
    public void sound() {
        System.out.println("Meow");
    }
}

//multiple inheritance
interface Animal1 {
    public void sound();
}

interface Carnivore {
    public void sound();
}

class Dog2 implements Animal1, Carnivore {
    public void sound() {
        System.out.println("Bark");
    }
}

//encapsulation
class Result extends Student {
    int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }
}

//static keyword
class Man {
    String name;
    static int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + age);
    }


}









public class Oops {
    public static void main(String[] args) {

        System.out.println("=========non parameterised constructor=============");
        Car car1 = new Car();
        car1.color = "red";
        car1.maxSpeed = 100;
        car1.ride();
        car1.printColor();

        Car car2 = new Car();
        car2.color = "blue";
        car2.maxSpeed = 150;
        car2.ride();
        car2.printColor();

        System.out.println("==============parameterised constructor=============");
        Rider rider1 = new Rider("William", 25);
        rider1.printInfo();

        System.out.println("==============polymorphism=============");
        Adder adder1 = new Adder();
        adder1.add(10, 20);
        adder1.add(10, 20, 30);
        adder1.add(10.5, 20.5);
        adder1.add(10.5, 20.5, 30.5);

        System.out.println("==============inheritance=============");
        Circle circle1 = new Circle();
        circle1.color = "red";
        circle1.radius = 5.0;
        circle1.printInfo();

        System.out.println("==============abstraction=============");
        Dog dog1 = new Dog();
        dog1.sound();

        Cat cat1 = new Cat();
        cat1.sound();
 
        System.out.println("==============interface=============");
        Dog1 dog2 = new Dog1();
        dog2.sound();

        Cat1 cat2 = new Cat1();
        cat2.sound();

        System.out.println("==============multiple inheritance=============");
        Dog2 dog3 = new Dog2();
        dog3.sound();

        System.out.println("==============encapsulation=============");
        Result result1 = new Result();
        result1.setMarks(100);
        System.out.println("Marks: " + result1.getMarks());

        System.out.println("==============static keyword=============");
        Man.age = 25;
        Man man1 = new Man();
        man1.name = "John";
        man1.printInfo();

        

        



    }
    
}
