package DiamonShop.Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Users;
import DiamonShop.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController{
	@Autowired
	AccountServiceImpl accountservice;
	@RequestMapping(value="/dang-ki", method = RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.addObject("user", new Users());
		
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
	
	@RequestMapping(value="/Register", method = RequestMethod.POST)
	public ModelAndView CreateAccount(@ModelAttribute("user") Users user) {
		int count=accountservice.AddAccount(user);
		if(count>0) {
			_mvShare.addObject("status", "đăng kí thành công");
		}
		else {
			_mvShare.addObject("status", "đăng kí thất bại");
		}
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
	
	@RequestMapping(value="/dang-nhap", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session,@ModelAttribute("user") Users user) {
		boolean check=accountservice.CheckAccount(user);
		if(check) {
			_mvShare.setViewName("redirect:trang-chu");
			_mvShare.addObject("statuslogin", "đăng nhập thành công");
			session.setAttribute("loginInfor", user);
		}
		else {
			_mvShare.addObject("statuslogin", "đăng nhập thất bại");
		}
				
		return _mvShare;
	}
}
