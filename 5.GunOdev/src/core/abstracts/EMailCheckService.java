package core.abstracts;
import entities.concretes.User;

public interface EMailCheckService {

	boolean emailRegexCheck(User user);
}