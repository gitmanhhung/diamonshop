package DiamonShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Users;

@Controller
public class UserController extends BaseController{
	@RequestMapping(value="/dang-ki", method = RequestMethod.GET)
	public ModelAndView DangKi() {
		_mvShare.addObject("user", new Users());
		
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
}
