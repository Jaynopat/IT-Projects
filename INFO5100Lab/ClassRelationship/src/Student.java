/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        System.out.println("Student name: " + s1.getName());
    }
}
