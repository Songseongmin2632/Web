package c231012.singleton;

import c231012.user.*;
import c231012.connection.*;
import c231012.connection.ConnectionMaker;

public class Test {
	public static void main(String[] args) {
		ConnectionMaker maker = new OracleCM();
		SingletonDAO dao = SingletonDAO.getInstance(maker);
		SingletonDAO dao1 = SingletonDAO.getInstance();
		SingletonDAO dao2 = SingletonDAO.getInstance();
		System.out.println(dao);
		System.out.println(dao1);
		System.out.println(dao2);
//		UserBean user = new UserBean();
//		user.setName("홍길동");
//		user.setUserId("ssm");
//		user.setPassword("2632");
//		dao.add(user);
	}
}

