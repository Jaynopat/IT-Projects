/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */


public abstract class StudentPortal implements OnlineLearningSystem {

    public void create(String studentId, String courseId) {
       System.out.println("Student " + studentId + " enrolled in course " + courseId);
    }

    public void viewCourse(String courseId) {
        System.out.println("Accessing content for course " + courseId);
    }

   
    public void submitAssignment(String studentId, String courseId, String assignmentId) {
        System.out.println("Student " + studentId + " submitted assignment " + assignmentId + " for course " + courseId);
    }

    
}
