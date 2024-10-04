package com.sample.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.spring.dao.ISimpleBbsDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	// 부모자를 가져오면 자식들도 모두 딸려오기 때문에 이렇게 가져옴
	@Autowired
	ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("lists", dao.listDao());
		model.addAttribute("count", dao.countDao());
		return "list";
	}
	
	// view?id=1
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto", dao.viewDao(sId));
		
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writer() {
		return "writeForm";
	}
	
	@RequestMapping("write")
	public String write(HttpServletRequest request) {
		dao.writeDao(
				request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content")
				);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		dao.deleteDao(request.getParameter("id"));
		
		return "redirect:list";
	}
}
