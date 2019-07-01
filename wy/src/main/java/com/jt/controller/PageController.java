package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class PageController {

    @RequestMapping("/doIndexUI")
    public String doIndexUI() {
        return "starter";
    }

    @RequestMapping("/doPageUI")
    public String doPageUI(){
        return "common/page";
    }


}
	
	
	
	
	
	
	
	
	
	
	

	

