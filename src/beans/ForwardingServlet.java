package beans;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForwardingServlet
 */
//@WebServlet("/ForwardingServlet")
public class ForwardingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//processRequest(request, response);
		//System.out.println("hello");
	HttpSession session=request.getSession(true);
	SimpleBean sb=new SimpleBean();
	sb.setfName(request.getParameter("Input Name"));
	sb.setlName(request.getParameter("Last Name"));
	sb.seteMail(request.getParameter("Email"));
	sb.setHeardBy(request.getParameter("radiobutton"));
	sb.setContactMe(request.getParameter("select"));
	
	sb.setClassicalCb((request.getParameter("selection1")!= null) ? true:false);
	sb.setDevotionalCb((request.getParameter("selection2")!= null) ? true:false);
	sb.setMetallicCb((request.getParameter("selection3")!= null) ? true:false);
	sb.setRockCb((request.getParameter("selection4")!= null) ? true:false);	
	session.setAttribute("bean", sb);
	request.getRequestDispatcher("result1.jsp").forward(request, response);
	}

/**	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	SimpleBean sb=new SimpleBean();
	sb.setfName(request.getParameter("Input Name"));
	sb.setlName(request.getParameter("Last Name"));
	sb.seteMail(request.getParameter("Email"));
	sb.setHeardBy(request.getParameter("radio button"));
	sb.setContactMe(request.getParameter("select"));
	
	sb.setClassicalCb((request.getParameter("selection1")!= null) ? true:false);
	sb.setDevotionalCb((request.getParameter("selection2")!= null) ? true:false);
	sb.setMetallicCb((request.getParameter("selection3")!= null) ? true:false);
	sb.setRockCb((request.getParameter("selection4")!= null) ? true:false);	
	request.setAttribute("bean", sb);
	RequestDispatcher enter=request.getRequestDispatcher("/result.jsp");
	enter.forward(request, response);
	
	}*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
