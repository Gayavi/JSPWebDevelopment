package validate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age=Integer.parseInt(request.getParameter("age"));
		String citizen=request.getParameter("citizen");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		
		if((age>=18) && (citizen.equals("Srilanka"))&& (request.getParameter("multi")==null))
		{
			request.setAttribute("F_name", fname);
			request.setAttribute("L_name", lname);
		request.getRequestDispatcher("Valid.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("F_name", fname);
			request.setAttribute("L_name", lname);
		request.getRequestDispatcher("Invalid.jsp").forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
	}

}
