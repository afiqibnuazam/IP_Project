package Controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserController {
	//final private PersonDao_usingJdbcTemplate personDao;
		//@Autowired
		//public UserController(PersonDao_usingJdbcTemplate userDao){
			//this.customerDao = customerDao;
		
		@RequestMapping("/signup")
		public String signup() {
			return "signup";
		}
		
		@RequestMapping("/login")
		public String login() {
			return "login";
		}
		
		@GetMapping("/home")
		public String home() {
			return "home";
		}
}
