package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
	
	@GetMapping("/signup")
    public String showRegistrationPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String processRegistration(@ModelAttribute User newUser, Model model) {
        // Logic to handle user registration
        // Validate and save the new user to the database
        // Redirect to the login page after successful registration
        // If registration fails, return to the registration page with an error message
    }
    
}
