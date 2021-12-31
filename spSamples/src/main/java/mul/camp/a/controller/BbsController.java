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

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;
import mul.camp.a.service.BbsService;

@Controller
public class BbsController {

	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	@Autowired
	BbsService service;
	
	@RequestMapping(value = "bbslist.do", method = RequestMethod.GET)
	public String bbslist(Model model, BbsParam param){ 
		logger.info("BbsController bbslist() " + new Date());
		List<BbsDto> list = service.bbslist(param);
		model.addAttribute("bbslist", list);
		return "bbslist";
	}
	
	@RequestMapping(value = "bbswrite.do", method = RequestMethod.GET)
	public String bbswrite() {
		logger.info("BbsController bbswrite() " + new Date());
		
		return "bbswrite";
	}
	
	@RequestMapping(value = "bbswriteAf.do", method = RequestMethod.POST)
	public String bbswriteAf(Model model, BbsDto bbs) {
		logger.info("BbsController bbswriteAf() " + new Date());
		int result = service.bbswrite(bbs);
		
		model.addAttribute("result", result);
		return "redirect:/bbslist.do";
	}
	
	@RequestMapping(value = "bbsdetail.do", method = RequestMethod.GET)
	public String bbsdetail(Model model, int seq) {
		logger.info("BbsController bbsdetail() " + new Date());
		int readup = service.bbscountUp(seq);
		BbsDto bbs = service.getBbs(seq);
		model.addAttribute("bbs", bbs);
		return "bbsdetail";
	}
	
	@RequestMapping(value = "answer.do", method = RequestMethod.GET)
	public String answer(Model model, int seq) {
		logger.info("BbsController answer() " + new Date());
		BbsDto bbs = service.getBbs(seq);
		model.addAttribute("bbs", bbs);
		
		return "bbsanswer";
	}
	
	@RequestMapping(value = "answerAf.do", method = RequestMethod.GET)
	public String answerAf(BbsDto dto) {
		logger.info("BbsController answerAf() " + new Date());
		
		// System.out.println(dto.toString());
		service.reply(dto);
		return "redirect:/bbslist.do";
		// DB -> update, insert

	}
	
	@RequestMapping(value = "updatebbs.do", method = RequestMethod.GET)
	public String updatebbs(Model model, int seq) {
		logger.info("BbsController updatebbs() " + new Date());
		BbsDto bbs = service.getBbs(seq);
		model.addAttribute("bbs", bbs);
		return "updatebbs";
	}
	
	@RequestMapping(value = "updatebbsAf.do", method = RequestMethod.POST)
	public String updatebbsAf(Model model, BbsDto bbs) {
		logger.info("BbsController updatebbsAf() " + new Date());
		int result = service.bbsupdate(bbs);
		
		model.addAttribute("result", result);
		return "redirect:/bbslist.do";
	}
	
	@RequestMapping(value = "deletebbs.do", method = RequestMethod.GET)
	public String deletebbs(Model model, int seq) {
		logger.info("BbsController deletebbs() " + new Date());
		int result = service.bbsdelete(seq);
		
		model.addAttribute("result", result);
		return "redirect:/bbslist.do";
	}
	
	/*
	@RequestMapping(value = "bbswrite.do", method = RequestMethod.GET)
	public String bbswrite() {
		logger.info("BbsController bbswrite() " + new Date());
		
		return "bbswrite";
	}
	
	@RequestMapping(value = "bbswriteAf.do", method = RequestMethod.POST)
	public String bbswriteAf(Model model, BbsDto bbs) {
		logger.info("BbsController bbswriteAf() " + new Date());
		int result = service.bbswrite(bbs);
		
		model.addAttribute("result", result);
		return "redirect:/bbslist.do";
	}
	*/
}
