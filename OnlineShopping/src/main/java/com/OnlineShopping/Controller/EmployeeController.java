package com.OnlineShopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.OnlineShopping.Entities.Employee; 
import com.OnlineShopping.Service.EmployeeService;

@Controller
public class EmployeeController {
	 @Autowired
	    private EmployeeService service;
	     
	    @RequestMapping("/")
	    public String viewHomePage(Model model) {
	        List<Employee> listEmployee = service.listAll();
	        model.addAttribute("listEmployee", listEmployee);
	         
	        return "index";
	    }
	     
	    @RequestMapping("/new")
	     public String newemployee(Model model)
	     {
	    	 Employee employee = new Employee();
	    	 model.addAttribute("employee",employee);
	         
	         return "newemployee";
	     }
	    
	    
	    @RequestMapping(value="/save" ,method=RequestMethod.POST) 
	    public String saveEmployee(@ModelAttribute("employee") Employee employee) 
	     {
	    	 service.save(employee);
	    	 
	    	return "save";
	     }
	     
	    @RequestMapping("/edit/{empid}")
	    public ModelAndView showEditEmployeePage(@PathVariable(name = "empid") Long empid) {
	        ModelAndView mav = new ModelAndView("Edit");
	       Employee employee = service.get(empid);
	        mav.addObject("employee", employee);
	         
	        return mav;
	    }
	    
	    @RequestMapping("/delete/{empid}")
	    public String deleteEmployee(@PathVariable(name = "empid") Long empid) {
	        service.delete(empid);
	        return "redirect:/";       
	    }
	    
	      

}
