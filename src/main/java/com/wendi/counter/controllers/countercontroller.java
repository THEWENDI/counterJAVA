package com.wendi.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class countercontroller {
	
	@GetMapping("/your_server")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 1);
		}else {
			Integer temCount = (Integer) session.getAttribute("count");
			session.setAttribute("count", temCount+1);
		}
		return "index.jsp";
	}
	
	
	
	@GetMapping("/your_server/counter")
	public String count() {
		return "counterpage.jsp";
	}
	
	@GetMapping("/reset")
	public String rest(HttpSession session) {
		session.invalidate();
		return "counterpage.jsp";
	}

}
