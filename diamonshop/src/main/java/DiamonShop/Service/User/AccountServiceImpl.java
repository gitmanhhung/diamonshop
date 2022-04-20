package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.UserDao;
import DiamonShop.Entity.Users;
@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	UserDao userdao;
	public int AddAccount(Users user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		
		return userdao.AddAccount(user);
	}
	public boolean CheckAccount(Users user) {
		String pass=user.getPassword();
		user=userdao.GetUserByAcc(user);
		if(user!=null) {
			if(BCrypt.checkpw(pass, user.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	

}
