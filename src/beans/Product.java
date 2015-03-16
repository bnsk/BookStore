package beans;

import java.text.NumberFormat;
//import main.products.interfaces.*;
import java.util.*;

public class Product implements Comparable,java.io.Serializable
{
    private String code;
    private String description;
    private double price;
    private String tag;
    protected static int count = 0;


   public int compareTo(Object p)
   {
	  Product pro=(Product) p;
	     return (this.code.compareTo(pro.code));
   }

   public void setTags(String tag)
   {
	   if(tag=="")
	     this.tag = tag;
       else this.tag=this.tag+","+tag;


   }

   public String getTags() {
      return tag;
   }
   public Product()
    {
        code = "";
        description = "";
        price = 0;
        tag = "";
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(Double price2)
    {
        this.price = price2;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n" +
               "Tags:        " + this.getTags() + "\n";

    }

    public static int getCount()
    {
        return count;
    }

     public class Compclass implements Comparator
     {
		 public int compare(Object p,Object q)
		    {
				Product p1=(Product) p;
				Product p2=(Product) q;
				 return p1.getCode().compareTo(p2.getCode());
		}
      }


     public Comparator getCodeComparator()
	      {
			  return new Compclass();
	      }


    public Comparator<Product> getPriceComparator()
     {
		 return new Comparator<Product>  () {
			  public int compare(Product p1,Product p2)
	          {
				  return (int)(p1.getPrice() - p2.getPrice());
		      }

		      };
      }



      public Comparator<Product>  getPriceComparatorDescending()
      {

		  class ComparatorDesc implements Comparator<Product>
		       {
		         public int compare(Product p1,Product p2)
		         {
		  		   return (int) (p2.getPrice()-p1.getPrice());
		  	   }
	        }



		  return new ComparatorDesc();
       }

}