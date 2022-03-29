package DiamonShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	//@Autowired
	//HomeServiceImpl homeService;
	
	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		//ModelAndView mv = new ModelAndView("user/index");
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("categories", _homeService.GetDatacategory());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		_mvShare.setViewName("user/index");
		return mv;
	}
}