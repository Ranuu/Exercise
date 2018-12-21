
public class Camel {

	
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder("Now you can browse privately,and other people who use this device won't see your activity.However,downloads and bookmarks will be saved.");
		boolean isLastSpace =true;
		for (int i = 0; i < builder.length();i++)
		{
			char ch =builder.charAt(i);
			
			if(isLastSpace && ch >='a' &&ch <='z')
			{
				//converted into camel case...
				builder.setCharAt(i,(char)(ch +('A' -'a')));
				
				isLastSpace = false;
			}
			else if (ch != ' ')
				isLastSpace =false;
			else
				isLastSpace =true;
			System.out.println(builder.toString());
		}
	}
}
	
	


