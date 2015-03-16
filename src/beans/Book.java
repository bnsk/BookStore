package beans;

public class Book extends Product
{
    public String code;
    public String author;
    public String bookname;
    public Book()
    {
		code="";
    	author="";
		bookname="";
		count++;
	
    
    }

    public void setAuthor(String author)
    {
     this.author = author;

     }
    public void setCode(String code)
    {
     this.code = code;

     }
    
    public String getCode()
    {
      return code;
     }
    public void setBookname(String bookname)
    {
     this.bookname = bookname;

     }
     public String getAuthor()
     {
       return author;
      }
     public String getBookname()
     {
       return bookname;
      }
     public String toString()
    {
       return super.toString() +"\nAuthor:      " + author + "\n" ;

    }
}