package c231011;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDAOTestServ
 */
@WebServlet("/UserDAOTestServ")
public class UserDAOTestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDAOTestServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
//			ConnectionMaker maker = new TomcatOracleConnectionMaker();
			
			UserDAO dao = new DAOFactory().userDAO();
			
			UserBean user = new UserBean();
			user.setName("김동선");
			user.setUserId("kds");
			user.setPassword("qwer");
			dao.add(user);
			
			System.out.println("추가 성공");
			response.setContentType("text/html;charset=utf-8");
			
			response.getWriter().append("추가 성공");
			
			UserBean createdUser = dao.get("kds");
			System.out.println(createdUser.getId());
			System.out.println(createdUser.getName());
			System.out.println(createdUser.getUserId());
			System.out.println(createdUser.getPassword());
			response.getWriter().append("" + createdUser.getId());
			response.getWriter().append(createdUser.getName());
			response.getWriter().append(createdUser.getUserId());
			response.getWriter().append(createdUser.getPassword());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}