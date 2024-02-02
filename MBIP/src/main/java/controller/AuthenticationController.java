package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {
	
	@GetMapping("/")
    public String showLoginPage() {
        return "login";
    }
	
	@PostMapping("/login")
    public String authenticateUser(@RequestParam("email") String email,
                                   @RequestParam("password") String password,
                                   HttpSession session) {
        // Authenticate user logic
    }
	
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        // Logout logic
    }
}
