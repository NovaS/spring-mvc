package net.novasaputra.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author novas
 */
@Controller
@RequestMapping("/rest")
public class RestController {
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public String getMessage(@PathVariable String name,ModelMap model) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(name).append("!");
		model.addAttribute("message",sb.toString());
		return "rest";
	}
}
