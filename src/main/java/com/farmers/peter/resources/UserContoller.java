package com.farmers.peter.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="v1/user")
public class UserContoller {
	
	@RequestMapping({"/test"})
	public String test() {
		return "Test successfull";
	}

}
