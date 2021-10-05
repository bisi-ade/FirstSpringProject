package com.bi.firstspringproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	
	@RequestMapping("/whalehello")
    public String hiya() {
      return "index.jsp";
    }

}
