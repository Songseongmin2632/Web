package c231012.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231012.Factory.*;

public class Test {
	public static void main(String[] args) throws Exception {
		
//		UserDAO dao = new DAOFactory().userDAO();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
		UserDAO dao = context.getBean("UserDAO", UserDAO.class);
		
//		UserDAO dao1 = context.getBean("UserDAO", UserDAO.class);
//		UserDAO dao2 = context.getBean("UserDAO", UserDAO.class);
//		System.out.println(dao1);
//		System.out.println(dao2);
//		
//		UserDAO dao3 = new DAOFactory().userDAO(); 
//		UserDAO dao4 = new DAOFactory().userDAO();
//		System.out.println(dao3);
//		System.out.println(dao4);
		
		UserBean user = new UserBean();
		user.setName("홍길동");
		user.setUserId("ssm");
		user.setPassword("2632");
		dao.add(user);
		
		System.out.println("추가 성공");
		
		UserBean createdUser = dao.get("ssm");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassword());
	}
}

