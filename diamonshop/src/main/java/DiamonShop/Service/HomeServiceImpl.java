package DiamonShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategoriesDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Entity.Categories;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slideDao;
	@Autowired
	private CategoriesDao categoriesDao;
	public List<Slides> GetDataSlide() {
		
		return slideDao.GetDataSlide();
	}
	public List<Categories> GetDatacategory() {
		
		return categoriesDao.GetDataCategory();
		
	}

}
