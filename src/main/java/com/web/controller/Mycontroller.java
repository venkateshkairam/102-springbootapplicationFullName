package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller 
{
	@RequestMapping("/")
  public String Fullnameform()
  {
	  return "names";
  }
	@RequestMapping("/submit")
	public String PrintFullname(@RequestParam String fname,@RequestParam String lname,ModelMap model)
	{
		model.put("fname", fname);
		model.put("lname", lname);
		String fullname=fname+lname;
		model.put("fullname", fullname);
		return "result";
	}
}
