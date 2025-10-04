/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TestSystem {
    public static void main(String[] args) {
        OnlineLearningSystem student = new StudentPortal() {};
        student.create("S123", "CSE101");
        student.viewCourse("CSE101");
        student.submitAssignment("S123", "CSE101", "A1");
        
    }
}

