package com.niit.ShoppingCart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class IndexController {
@RequestMapping("/")
public String getpage()
{

	return "index";
}
@RequestMapping("/page1")
public String getpage1()
{
	return "page1";
}

}
