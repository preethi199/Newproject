package com.fitness.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fitness.model.FitnessModel;
import com.fitness.service.FitnessService;

@Controller
public class FitnessController {
	@Autowired
	private FitnessService fService;
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main(@ModelAttribute("userDetails") FitnessModel userDetails ) {
		return "details";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String save(@ModelAttribute("userDetails")  FitnessModel userDetails,BindingResult br,ModelMap m){
		if(br.hasErrors()) {
			return "details";
		}
		else {
				 boolean flag = fService.addUserData(userDetails);
	        if(flag==true) {
	        	double bmi= fService.calculatebmi(userDetails);
	        	m.addAttribute("bmi", bmi);
	        	if(bmi>0) {
	        		if(userDetails.getWeight()>80) {
	        			List<FitnessModel> lf=fService.bmiG80(userDetails.getWeight());
	        			m.addAttribute("lp", lf);
	        			return "bmiG80";
	        		}
	        		else {
	        			List<FitnessModel> lf=fService.bmiL80(userDetails.getWeight());
	        			m.addAttribute("lp", lf);
	        			return "bmiL80";
	        		}
	        	
	        	}else {
	        		return "inValid";
	        	}
	        }
	        else {
	        	return "notinserted";
	        }  
      
    }
	
}
}
