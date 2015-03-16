package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Book;
import beans.Software;

/**
 * Servlet implementation class BookForward
 */
public class BookForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request , response);// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	processRequest(request , response);
	}
	 
	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
			{
         ReadFile rfil= new ReadFile(getServletContext().getRealPath("/WEB-INF/products.txt"));
         HashMap<String,Book> prodcollect=new HashMap<String,Book>();
         ArrayList<String> prodnames=new ArrayList<String>();
         ArrayList<String> prodcodes=new ArrayList<String>();
         ArrayList<String> lines=new ArrayList<String>();
         String line=rfil.readline();
         //StringTokenizer st=new StringTokenizer(line," ");
         //int prodnum=1;
         // Object StringTokenizer st= 
        while(line!=null)
        {
         // if(st.nextToken()=="book")
          //{ 	  
        	lines.add(line);
        	Book book= new Book(); 
        	  StringTokenizer st=new StringTokenizer(line,",");
           	String code=st.nextToken();
            
            book.setCode(code);
          	prodcodes.add(code);
           	String bookname=st.nextToken();
           	
           	book.setBookname(bookname);
            prodnames.add(bookname);
       
          String author=st.nextToken();
          
         
          book.setAuthor(author);
          Double price=Double.valueOf(st.nextToken());
          
         
          book.setPrice(price);
        
          prodcollect.put(code,book);
         // System.out.println(prodcollect);
          line=rfil.readline();
        } 
        HttpSession session = request.getSession(true);
          getServletContext().setAttribute("prodHashmap", prodcollect);
         // System.out.println(prodcollect);
          getServletContext().setAttribute("productcodes", prodcodes);
          getServletContext().setAttribute("plines", lines);
          request.getRequestDispatcher("display.jsp").forward(request, response);
        }}
