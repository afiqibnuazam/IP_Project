// Part of Recycle Activity Module - Afiq

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.RecycleActivityDao;

@Controller
public class RecycleActivityController {
	
	@Autowired
	private RecycleActivityDao recActDao;
}
