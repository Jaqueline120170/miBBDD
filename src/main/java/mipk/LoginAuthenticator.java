package mipk;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAuthenticator
 */
public class LoginAuthenticator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String usuvalido1 = "user1";
	private String pwdvalida1 = "jaquito";
	private String usuvalido2 = "alumno";
	private String pwdvalida2 = "1234";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAuthenticator() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("./index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		if (usuario == null) usuario = "";
		if (pass == null) pass = "";
		boolean ok = false;
		
		if ((usuario.equals(usuvalido1) && pass.equals(pwdvalida1)) || 
			(usuario.equals(usuvalido2) && pass.equals(pwdvalida2))) {
			session.setAttribute("attributo2", usuario);
			session.setAttribute("attributo1", "1");
			ok = true;
		}
				
		if (ok) response.sendRedirect("bienvenido.jsp");
		else response.sendRedirect("index.jsp");
	}
}
