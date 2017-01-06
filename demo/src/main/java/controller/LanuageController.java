package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Language;
import service.LanuageService;


@Controller
public class LanuageController {
	
	@Autowired
	private LanuageService lanuageService;
	
	@RequestMapping(value="/getAllLanguages.do")
	@ResponseBody
	public List<Language> getAllLanguages(){
		return lanuageService.find();
	}
}
