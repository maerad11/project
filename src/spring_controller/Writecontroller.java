package spring_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.repository.MemoDao;

public class Writecontroller implements Controller{
	
	private MemoDao memoDao;
	public void setMemoDao(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView();
		if(req.getMethod().equalsIgnoreCase("get")) {
			mv.setViewName("/WEB-INF/view/write.jsp");
			return mv;
		}
		else if(req.getMethod().equalsIgnoreCase("post")) {
			String content = req.getParameter("content");
			memoDao.write(content);		
			mv.setViewName("redirect:list.jsp");
			return mv;			
		}
		
		return null;
	}
}
