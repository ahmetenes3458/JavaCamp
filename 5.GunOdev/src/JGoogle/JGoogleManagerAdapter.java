package JGoogle;

import core.abstracts.JGoogleService;
import entities.concretes.User;

public class JGoogleManagerAdapter implements JGoogleService{

	@Override
	public void loginWithGoogle(User user) {
		JGoogleManager googleManager=new JGoogleManager();
		googleManager.loginWithGoogle(user);
		
	}
}