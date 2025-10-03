/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public interface OnlineLearningSystem {
    
    // Enroll a student into a course
    void create(String studentId, String courseId);

    // Access course content
    void viewCourse(String courseId);

    // Submit an assignment
    void submitAssignment(String studentId, String courseId, String assignmentId);

}