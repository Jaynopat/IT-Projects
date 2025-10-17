/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Registration;

/**
 * FXML Controller Class
 * Handles user input and validation
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private TextField nameTextField;
    
    @FXML
    private TextField ageTextField;
    
    @FXML
    private TextField emailTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Controller initialized successfully");
    }
    
    /**
     * Submit button handler
     * Validates input and displays registration details
     */
    @FXML
    public void submit(ActionEvent event) {
        System.out.println("Submit button clicked!");
        
        try {
            
            String name;
            int age;
            String email;
            
            // Get input values
           name = this.nameTextField.getText();
            age = Integer.parseInt(this.ageTextField.getText());
            email = this.emailTextField.getText();
            
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            
            // Validate name
            if (name.isEmpty()) {
                showErrorAlert("Name cannot be empty!");
                return;
            }
            
            // Validate age
   
            if (age < 16) {
                showErrorAlert("Age must be 16 or above!");
                return;
            }
            
            if (age > 120) {
                showErrorAlert("Please enter a valid age!");
                return;
            }
            
            
            // Validate email
            if (email.isEmpty()) {
                showErrorAlert("Email cannot be empty!");
                return;
            }
            
            if (!email.contains("@") || !email.contains(".")) {
                showErrorAlert("Please enter a valid email address!");
                return;
            }
            
            // Email must have characters before and after @
            if (email.indexOf("@") == 0 || email.indexOf("@") == email.length() - 1) {
                showErrorAlert("Please enter a valid email address!");
                return;
            }
            
            // Create registration object
            Registration registration = new Registration(name, email, age);
            
            // Show success message with details
            showSuccessAlert(registration.toString());
            
            // Clear form after successful submission
            clearForm();
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            showErrorAlert("An error occurred: " + e.getMessage());
        }
    }
    
    /**
     * Clear all input fields
     */
    private void clearForm() {
        nameTextField.clear();
        ageTextField.clear();
        emailTextField.clear();
    }
    
    /**
     * Show error alert
     */
    private void showErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Invalid Input");
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    /**
     * Show success alert
     */
    private void showSuccessAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Registration Successful!");
        alert.setContentText(message);
        alert.showAndWait();
    }
}