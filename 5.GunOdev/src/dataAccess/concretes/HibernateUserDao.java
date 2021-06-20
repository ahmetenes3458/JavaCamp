package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
	
		System.out.println("Kullan�c� Eklendi");
		System.out.println("Kullan�c� Bilgileri");
		System.out.println("Ad� : " + user.getFirstName());
		System.out.println("Soyad� : "+ user.getLastName());
		System.out.println("E-posta : "+user.getEmail());
	}

	@Override
	public void delete(User user) {
		
		
		System.out.println("Kullan�c� Silindi");
		System.out.println("Kullan�c� Bilgileri");
		System.out.println("Ad� : " + user.getFirstName());
		System.out.println("Soyad� : "+ user.getLastName());
		System.out.println("E-posta : "+user.getEmail());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� Bilgileri  G�ncellendi");
		System.out.println("Kullan�c� Bilgileri");
		System.out.println("Ad� : " + user.getFirstName());
		System.out.println("Soyad� : "+ user.getLastName());
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
