//IMPORT PACKAGE:
import sergio_package.*;

public class SergioLopezDevMainClass {

    public static void main(String[] args) {

//CREATE PERSON OBJECT:
        Person p1 = new Person("Sergio", 41);

//OUTPUT PERSON OBJECT DATA:
        System.out.println("The person's name is "
                + p1.getName() + " and they are " + p1.getAge() + " years old.");

//CREATE WAITER OBJECTS:
        Waiter w1 = new Waiter(1800, "Elena", 39);
        Waiter w2 = new Waiter(1500, "Selena", 27);
        Waiter w3 = new Waiter(1500, "Luna", 23);
        Waiter w4 = new Waiter();
        Waiter w5 = new Waiter();

//OUTPUT WAITER OBJECT DATA:
        System.out.println();
        System.out.println("WAITERS:");
        System.out.println(w1.getName() + ": " + w1.getSalary()
                + " euros, " + w1.getAge() + " years old.");
        System.out.println(w2.getName() + ": " + w2.getSalary()
                + " euros, " + w2.getAge() + " years old.");
        System.out.println(w3.getName() + ": " + w3.getSalary()
                + " euros, " + w3.getAge() + " years old.");

//OUTPUT NUMBER OF WAITER OBJECTS CREATED:
        System.out.println();
        System.out.println("NUMBER OF WAITERS: "
                + Waiter.getWaiters());

    }

}

package sergio_package;

public class Person {

//PRIVATE ATTRIBUTES:
    private String name;
    private int age;

//DEFAULT CONSTRUCTOR:
    public Person() {
    }

//CONSTRUCTOR WITH PARAMETERS:
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//GETTER AND SETTER:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

package sergio_package;

//WAITER CLASS INHERITS FROM PERSON CLASS:
public class Waiter extends Person {

//SALARY ATTRIBUTE:
    private int salary;

//COUNTER VARIABLE:
    private static int waiters = 0;

//DEFAULT AND PARAMETERIZED CONSTRUCTORS (WITH COUNTER):
    public Waiter() {
        waiters++;
    }
    public Waiter(int salary, String name, int age) {
        super(name, age);
        this.salary = salary;
        waiters++;
    }

//GETTER AND SETTER:
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

//STATIC METHOD:
    public static int getWaiters() {
        return waiters;
    }

}