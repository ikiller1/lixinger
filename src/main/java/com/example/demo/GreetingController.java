/**
 * 
 */
package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author chenfeixu
 *
 */
@Controller
public class GreetingController {
	@Autowired
	ObjectMapper mapper;
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        try {
			return mapper.writeValueAsString(new Greeting(counter.incrementAndGet(),
			                    String.format(template, name)));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    @RequestMapping("/home")
    public String home(Model model) {
    	model.addAttribute("user", "cfx");
    	return "home";
    }
}
