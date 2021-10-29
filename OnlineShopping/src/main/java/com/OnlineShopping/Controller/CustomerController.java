package com.OnlineShopping.Controller;

import java.util.List;
import com.OnlineShopping.Service.CustomerService;
import com.OnlineShopping.Entities.Customer; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@Autowired
    private CustomerService service;
     
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Customer> listCustomer = service.listAll();
        model.addAttribute("listCustomer", listCustomer);
         
        return "Customerindex";
    }
     
    @RequestMapping("/new")
     public String newCustomer(Model model)
     {
    Customer customer = new Customer();
    	 model.addAttribute("customer",customer);
         
         return "newcustomer";
     }
    
    
    @RequestMapping(value="/save" ,method=RequestMethod.POST) 
    public String saveCustomer(@ModelAttribute("customer") Customer customer) 
     {
    	 service.save(customer);
    	 
    	return "save";
     }
     
    @RequestMapping("/edit/{custid}")
    public ModelAndView showEditCustomerPage(@PathVariable(name = "custid") Long custid) {
        ModelAndView mav = new ModelAndView("Edit");
       Customer customer = service.get(custid);
        mav.addObject("customer", customer);
         
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(name = "custid") Long custid) {
        service.delete(custid);
        return "redirect:/";       
    }
	

}
