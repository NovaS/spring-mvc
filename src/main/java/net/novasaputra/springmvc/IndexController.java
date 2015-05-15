package net.novasaputra.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author novas
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired private HelloService helloService;
	
	@RequestMapping(method=RequestMethod.GET)
	private String getIndex(ModelMap model) {
		model.addAttribute("message", helloService.sayHello());
		return "index";
	}
}
