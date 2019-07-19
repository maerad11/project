package spring_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Maincontroller implements Controller{
@Override
public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("/WEB-INF/view/main.jsp");
	return mv;
}
}
