package com.web.sweetel;


import java.io.Console;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MemberService;
import vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;

	@RequestMapping(value = "/login")
	public ModelAndView loginf(ModelAndView mv , HttpServletRequest request,MemberVO vo, HttpServletResponse response) {
		response.setContentType("text/html; charset=UTF-8");
		String pw = vo.getPw();
		vo = service.selectOne(vo);
		if(vo != null) {
			if(vo.getPw().equals(pw)) {
				mv.addObject("loginCheck","T");
				request.getSession().setAttribute("loginID",vo.getId());
				request.getSession().setAttribute("loginName",vo.getName());
			} else {
				mv.addObject("loginCheck","F");
			}
		} else {
			mv.addObject("loginCheck", "idError");
		}
		mv.setViewName("jsonView");
		return mv;
	}
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(ModelAndView mv,HttpServletRequest request) {
		if(request.getSession() != null) {
			request.getSession().invalidate();			
		}
		mv.setViewName("/home");
		return mv;
	}
	
	@RequestMapping(value = "/join")
	public ModelAndView join(ModelAndView mv,MemberVO vo,HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		if(service.insert(vo) > 0) {
			mv.addObject("joinCheck","T");
		} else {
			mv.addObject("joinCheck","F");
		}
		mv.setViewName("jsonView");
		return mv;
	}
}
