package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@Controller
public class MemberController {
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "login.do",  method = RequestMethod.GET)
	public String hello(Model model) {
		logger.info("HelloController login() " + new Date());
		
		
		return "login";
	}
	
	@RequestMapping(value = "register.do",  method = RequestMethod.GET)
	public String register(Model model) {
		logger.info("HelloController register() " + new Date());
		
		
		return "register";
	}
	
	@RequestMapping(value = "valid.do",  method = RequestMethod.POST)
	public String valid(Model model, MemberDto dto) {
		logger.info("HelloController valid() " + new Date());
		int result = service.signup(dto);
		System.out.println(result);
		model.addAttribute("result", result);	
		
		return "register";
	}
	
	@ResponseBody
	@RequestMapping(value = "valid_id.do",  method = RequestMethod.POST, produces = "application/String; charset=utf-8")
	public String valid(Model model, String id) {
		logger.info("HelloController valid_check() " + new Date());
		MemberDto dto = new MemberDto();
		dto.setId(id);
		
		String result = service.checkID(dto);
		if (result.equals("0")) {
			result = "가능한 아이디입니다.";
		}
		else {
			result = "중복된 아이디입니다.";
		}
		return result;
	}

}
