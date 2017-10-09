package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String nick=request.getParameter("nickname");
		System.out.printf("id : %s, pwd : %s\n",id,pwd);
			
		//id pwd 정합성 체크
		boolean result = true;
		
		if(result){
			//세션에 사용자 정브를 생성하서 담기
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setName("단경민");
			user.setNickname("학생");
			session.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
			rd.forward(request, response);
			
		}
		else{
			request.setAttribute("msg", "error");
			RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
			rd.forward(request, response);
			
		}
	}
}
