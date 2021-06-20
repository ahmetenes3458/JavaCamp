package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
	
		System.out.println("Kullanýcý Eklendi");
		System.out.println("Kullanýcý Bilgileri");
		System.out.println("Adý : " + user.getFirstName());
		System.out.println("Soyadý : "+ user.getLastName());
		System.out.println("E-posta : "+user.getEmail());
	}

	@Override
	public void delete(User user) {
		
		
		System.out.println("Kullanýcý Silindi");
		System.out.println("Kullanýcý Bilgileri");
		System.out.println("Adý : " + user.getFirstName());
		System.out.println("Soyadý : "+ user.getLastName());
		System.out.println("E-posta : "+user.getEmail());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Bilgileri  Güncellendi");
		System.out.println("Kullanýcý Bilgileri");
		System.out.println("Adý : " + user.getFirstName());
		System.out.println("Soyadý : "+ user.getLastName());
		System.out.println("E-posta : "+user.getEmail());
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
