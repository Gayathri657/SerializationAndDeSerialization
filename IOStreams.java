//To Store objects on to the files we use this streams
//The process of converting data into bytes is called serialization
//This is for security purpose 
// Which ever class implements this process that must implement the interface Serializable
//Serializable is a marker interface (that means it doesn't have any methods to implement)
//We are just intimating compiler to take care at runtime just like Annotations

import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println("Id : " + id);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public String toString() {
        return "Employee [id=" + id + ", name= " + name + ", age= " + age + "]";
    }
}

public class IOStreams {
    public static void main(String[] args) {
        // Employee emp = new Employee(1, "Gayathri", 12);
        // emp.disp();
        try {
            // try (ObjectOutputStream oos = new ObjectOutputStream(
            // new FileOutputStream("Users\\gayathripamarthi\\IOOperations\\AboutMe.txt")))
            // {
            // oos.writeObject(emp);
            // oos.close();
            FileInputStream fis = new FileInputStream("Users\\gayathripamarthi\\IOOperations\\AboutMe.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            e.disp();

        } catch (Exception e) {
            System.out.println("caught some exeception");
        }

    }
}
