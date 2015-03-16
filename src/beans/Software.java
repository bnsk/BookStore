
package beans;

public class Software extends Product
{
  public String version;
  public String name;
  public Software()
  {
	  version="";
	  name="";
  }

  public void setVersion(String version)
  {
   this.version=version;
   }

   public String getVersion()
   {
     return version;
     }

   public void setName(String name)
   {
    this.name=name;
    }

    public String getName()
    {
      return name;
      }
    public String toString()
       {
            return           super.toString() + "\n" +  "Version:     " + version + "\n" ;

}
    }