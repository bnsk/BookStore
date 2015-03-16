package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.awt.RequestFocusController;

import beans.Book;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
/**
 * Servlet implementation class ProductServlet
 */


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   
	//Enumeration<String> em =request.getParameterNames();
	//HashMap<String,Book> book_collection = new HashMap<String,Book>();
	//book_collection=session.getAttribute("prodHashmap");
	
	//String cd=null;
	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}
		private void processRequest(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	
		HttpSession session = request.getSession(true);
		Enumeration<String> em =request.getParameterNames();
		 HashMap<String,String> book_Quant =(HashMap<String,String>)(session.getAttribute("bookqty"));
		if(book_Quant==null)
		{
			 book_Quant =new HashMap<String,String>();
		}
		 
			String cd=null;
			Double total=0.0;
			HashMap<String,Book> book_collec=(HashMap<String, Book>) getServletContext().getAttribute("prodHashmap");
			while(em.hasMoreElements())
		{
			String parameterName = (String)em.nextElement();
			if(parameterName.startsWith("book-"))
			{
				cd = request.getParameter(parameterName);
				
				//selectCodes.add(cd);
				String quant = request.getParameter("qty-"+parameterName.substring(5));
				//System.out.println(quant);
			
				book_Quant.put(cd,quant);
			 total+=Double.valueOf(quant)*book_collec.get(cd).getPrice();
			 
			}
			
		}
			System.out.println(total);
			session.setAttribute("Grandtotal1",total);
			//HttpSession ses=request.getSession();
		session.setAttribute("selectcodes",book_Quant.keySet());
		session.setAttribute("bookqty",book_Quant);
		
		
		RequestDispatcher view = request.getRequestDispatcher("/Cart.jsp");
		try {
			view.forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
