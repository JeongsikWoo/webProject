package com.almom.controller;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import com.almom.domain.TutorVO;
import com.almom.domain.UserVO;
import com.almom.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	  @Inject
	  private UserService service;
	  /*
	  @RequestMapping(value = "/register", method = RequestMethod.POST)
	  public String RegisterPost(UserVO user, Model model)throws Exception{
		  logger.info("ȸ������...");
		  logger.info(user.toString());
		  service.regist(user);
//		  model.addAttribute("result","success");
		  return "home";
	  }
	  
	  @RequestMapping(value = "/registerTutor", method = RequestMethod.POST)
	  public String RegisterTutorPost(TutorVO tutor, CertificateVO certificate, Model model)throws Exception{
		  logger.info("Ʃ�͵��...");
//		  logger.info(user.toString());
		  logger.info(tutor.toString());
		  service.registTutor(tutor, certificate);  
//		  model.addAttribute("result","success");
		  return "home";
	  }
	  
	  @RequestMapping(value = "/goTutorRegister", method = RequestMethod.GET)
	  public String goTutorRegister(Model model)throws Exception{
		  return "user/tutorRegister";
	  }
	  
	  @RequestMapping(value = "/login" , method = RequestMethod.GET)
	  public void loginGET(@ModelAttribute("dto") LoginDTO dto) {
		  
	  }
	  
	  @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	  public void loginPOST(LoginDTO dto , HttpSession session, Model model)throws Exception{
		  
		  UserVO vo = service.login(dto);
		  
		  System.out.println("      "+service.login(dto));
//		  System.out.println(vo);
		  logger.info("-----------------------------------");
		  logger.info(dto.toString());
		 System.out.println(vo);
		  if(vo ==null) {
	
			  return;
		  }
		  model.addAttribute("userVO", vo);
		  
	  }
	  
	  @RequestMapping(value = "/goMyPage" , method = RequestMethod.GET)
	  public String goMyPageGet(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) throws Exception {
		  System.out.println("get���");
		  String str = (String) session.getAttribute("login");
		  logger.info(str);
		  UserVO vo = service.getProfile(str);
		  
		  logger.info(vo.toString());
		  request.setAttribute("profile", vo);
		  
		  return "user/myPage";
		  
	  }
	  @RequestMapping(value = "/goMyPage" , method = RequestMethod.POST)
	  public String goUpdateInfo(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)throws Exception{
		  String str = (String) session.getAttribute("login");
		  logger.info(str);
		  UserVO vo = service.getProfile(str);
		  
		  logger.info(vo.toString());
		  request.setAttribute("profile", vo);
//		  model.addAttribute("profile", vo);
		  
		  return "user/myPage";
	  }
	  
	  
	  @RequestMapping(value = "/logout", method = RequestMethod.POST)
	  public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session)throws Exception{
		  
		  String str = (String)session.getAttribute("login");
		  
		  if(str != null) {
			  
			  String vo = str;
			  session.removeAttribute("login");
			  session.invalidate();
			  
			  Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
			  
			  if(loginCookie != null) {
				  loginCookie.setPath("/");
				  loginCookie.setMaxAge(0);
				  response.addCookie(loginCookie);
				  
			  }
		  }
		  return "user/logout";
	  }
	  
	  @RequestMapping(value = "/addRegister", method = RequestMethod.POST)
	  public String addRegister(UserVO user , HttpSession session, Model model)throws Exception{
		  logger.info("���� �߰� ��"+user.toString());
		  String str = (String)session.getAttribute("login");
		  logger.info(str);
		  service.addRegistUser(user);
		  
		  return "redirect:/user/goMyPage";
	  }
	  */
}
