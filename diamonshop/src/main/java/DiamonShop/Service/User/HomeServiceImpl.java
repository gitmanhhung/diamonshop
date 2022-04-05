package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategoriesDao;
import DiamonShop.Dao.MenusDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categories;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slideDao;
	@Autowired
	private CategoriesDao categoriesDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> GetDataSlide() {
		
		return slideDao.GetDataSlide();
	}
	public List<Categories> GetDatacategory() {
		
		return categoriesDao.GetDataCategory();
		
	}
	public List<Menus> GetDataMenus() {
		
		return menusDao.GetDataMenus();
	}
	public List<ProductsDto> GetDataProducts() {
		return productsDao.GetDataProducts();
		
	}

}
