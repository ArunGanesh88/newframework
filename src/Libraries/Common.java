package Libraries;


public class Common extends Driver 
{
	public static void openbw()
	{
		try
		{
			
			Browser.OpenBrowser("chrome", "https://www.google.co.in/");
			Result.takescreenshot("check");
			System.out.print("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
	
}
