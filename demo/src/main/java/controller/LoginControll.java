package controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Customer;
import pojo.ResultData;
import service.CustomerService;


@Controller
public class LoginControll {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	@ResponseBody
	public	ResultData login(@Valid Customer customer, BindingResult br, HttpSession session){
		ResultData result=new ResultData();
		if(br.hasErrors()){
			result.setResult(false);
			return result;
		}
		Customer c=customerService.findCustomerByName(customer);
		if(c==null){
			result.setResult(false);
			return result;
		}
		result.setResult(true);
		return result;
	}



	
}
