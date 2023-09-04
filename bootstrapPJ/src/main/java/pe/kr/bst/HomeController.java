package pe.kr.bst;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet{
	
	/*
	URL 			: http://localhost:8080/Test/TestMember/MemberList.jsp
	URI 			: 		   			   /Test/TestMember/MemberList.jsp
	Context Path	:		   			   /Test
	Servlet Path	:			    			/TestMember/MemberList.jsp
	*/

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}

	
}
