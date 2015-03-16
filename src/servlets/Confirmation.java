package servlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Book;
import beans.SimpleBean;
import beans.WriteFile;

/**
 * Servlet implementation class Confirmation
 */
public class Confirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmation() {
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
		// TODO Auto-generated method stub
		
	
		HttpSession session = request.getSession(true);
		SimpleBean sb1=(SimpleBean)session.getAttribute("bean");	
		Double total_price=(Double)session.getAttribute("Grandtotal1");
		//File file=new File(getServletContext().getInitParameter("fileloc"));
		//PrintWriter out1 = new PrintWriter(new FileWriter(file));
		//out1.write("sairam");
		//System.out.println(sb1.getaddress());
		//@SuppressWarnings("unchecked")
		HashMap<String,String> bookcode_qty =(HashMap<String,String>)(session.getAttribute("bookqty"));
		//@SuppressWarnings("unchecked")
		HashMap<String,Book> book_collec=(HashMap<String, Book>) getServletContext().getAttribute("prodHashmap");	
		//System.out.println(book_collec.toString());
		//@SuppressWarnings("unchecked")
		Set<String> arr=(Set<String>)(session.getAttribute("selectcodes"));
		Object[] arr1=arr.toArray();
		//System.out.println(arr1);
		//System.out.println("File Location:::"+getServletContext().getInitParameter("fileloc"));
		WriteFile wf =WriteFile.getInstance(getServletContext().getInitParameter("fileloc"));
			
			wf.write("First-name:"+sb1.getfName()+",Last-name:"+sb1.getlName()+",Address:"+sb1.getaddress());
			for(int i=0;i<bookcode_qty.size();i++)
			{
				
				//wf.write(book_collec.get( arr1[i]).toString());//+" "+book_collec.get(((Book) arr1[i]).getBookname()+" ");
				wf.write("CODE:"+(book_collec.get(arr1[i]).getCode())+" Bookname"+(book_collec.get(arr1[i]).getBookname())+" Authors:"+(book_collec.get(arr1[i]).getAuthor()));
			 
				//println("\n");
				//wf.write("\nSAIRAM\n");
			}
		    wf.write("TOTAL-PRICE:"+total_price);
		    
	    	try {
				request.getRequestDispatcher("Confirmation.jsp").forward(request, response);
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
