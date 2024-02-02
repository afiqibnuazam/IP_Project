// Part of Recycle Activity Module - Afiq

package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.RecycleActivity;
import service.RecycleActivityDao;

@Controller
@RequestMapping("/recycle-activity")
public class RecycleActivityController {
	
	@Autowired
	private RecycleActivityDao recActDao;
	
	// Display a listing of the resource
	
	
	
	
	// Show the form for creating a new resource
	@GetMapping("/add-bill")
	public String createRecycleActivity() {
	    return "recycle-activity/addRecycleActivity";
	}
	
	// Store a newly created resource in storage
	@PostMapping("/add-bill")
	@ResponseBody
	public String storeRecycleActivity(@ModelAttribute RecycleActivity recycleActivity) {
		recActDao.save(recycleActivity);
		return "redirect:/all-bills" +recycleActivity.toString();
	}
	
	
	
	// Display the specified resource
	
	
	
	
	// Show the form for editing the specified resource
	@GetMapping("/edit-bill/{id}")
	public String editRecycleActivity(@PathVariable int id, Model model) {
		RecycleActivity recycleActivity = recActDao.findById(id);
	    model.addAttribute("recycleActivity", recycleActivity);
		return "recycle-activity/editRecycleActivity";
	}
	
	// Update the specified resource in storage
	@PostMapping("/edit-bill/{id}")
	public String updateRecycleActivity(@PathVariable int id, @ModelAttribute("recycleActivity") RecycleActivity recycleActivity) {
	    recActDao.update(id, recycleActivity);
	    return "redirect:/recycle-activity/list-bills";
	}
	
	
	// Remove the specified resource from storage
	@GetMapping("/delete-bill/{id}")
	public String destroyRecycleActivity(@PathVariable int id) {
	    recActDao.delete(id);
	    return "redirect:/recycle-activity/list-bills";
	}
	
}
