
import java.util.ArrayList;
import java.util.List;

import business.concretes.UserManager;
import core.concretes.EMailCheckManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {


		List<User> users=new ArrayList<User>();
		UserManager userManager = new UserManager(new HibernateUserDao(),new EMailCheckManager()); 
		User user1 = new User(1,"Ali","Candan","ali@candan.com","ali123");	
		User user2 = new User(2,"Aslan","Akbey","aslan@akbey.com","aslan123");	

		users.add(user1);
		users.add(user2);
		userManager.register(user1);
		userManager.register(user2);

	}

}

