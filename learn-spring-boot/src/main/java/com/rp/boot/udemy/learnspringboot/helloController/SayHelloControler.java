package com.rp.boot.udemy.learnspringboot.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloControler {
	@RequestMapping("say-hello")
	public String sayHello()
	{
		return "Hello Controller3";
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHellohtml()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First html page change</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("first html  body");
		sb.append("</body>");
		sb.append("/html");
		return sb.toString();
	}
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}