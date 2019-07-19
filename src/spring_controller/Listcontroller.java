package spring_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.repository.MemoDao;

public class Listcontroller implements Controller{
	
	private MemoDao memoDao;
	
	public void setMemoDao(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/list.jsp");
		mv.addObject("list", memoDao.list());
		return mv;
	}

}
