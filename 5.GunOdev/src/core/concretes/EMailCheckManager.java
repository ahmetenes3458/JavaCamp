package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.EMailCheckService;
import entities.concretes.User;

public class EMailCheckManager implements EMailCheckService {

	@Override
	public boolean emailRegexCheck(User user) {
		
		String emailRegex = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(user.getEmail());
			
		return matcher.matches();
	}

}
