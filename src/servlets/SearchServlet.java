package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Book;
/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String,Book> bookCollect = (HashMap<String,Book>)getServletContext().getAttribute("prodHashmap");
		ArrayList<String> productCodes = (ArrayList<String>)getServletContext().getAttribute("productcodes");
		
		ArrayList<String> productLines = (ArrayList<String>)getServletContext().getAttribute("plines");
		//System.out.println(productLines.get(0));
		String searchInput=request.getParameter("Search");
		//System.out.println(searchInput);
		HashMap<String,Book> searchMatchColl =new HashMap<String,Book>();
		ArrayList<String> searchMatchCodes =new ArrayList<String>();
	
	      if(searchInput!=null)
	      {
	    	  for(int i=0;i<productCodes.size();i++)
	    	  {
	    		  if((productLines.get(i)).toLowerCase().contains(searchInput.toLowerCase()))
	    	      {
					searchMatchColl.put(productCodes.get(i),bookCollect.get(productCodes.get(i)));
					searchMatchCodes.add(productCodes.get(i));
				   }
	    	  }
	    	  
	      System.out.println(searchMatchCodes);
	      HttpSession session = request.getSession(true);
			session.setAttribute("searchmatchcoll",searchMatchColl);
			session.setAttribute("searchmatchcodes",searchMatchCodes);
			RequestDispatcher view=request.getRequestDispatcher("/Searchresult.jsp");
			
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
		else
		{
		RequestDispatcher dispatcher = request.getRequestDispatcher("ForwardBook?target=do");
		try {
			dispatcher.forward(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
