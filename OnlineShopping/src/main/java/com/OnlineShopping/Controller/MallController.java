package com.OnlineShopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineShopping.Entities.Employee;
import com.OnlineShopping.Entities.Mall;
import com.OnlineShopping.Service.MallService;


@Controller
public class MallController {
	
	 @Autowired
	    private MallService service;
	     
	    @RequestMapping("/")
	    public String viewHomePage(Model model) {
	        List<Mall> listMall = service.listAll();
	        model.addAttribute("listMall", listMall);
	         
	        return "index";
	    }
	     
	  
}
