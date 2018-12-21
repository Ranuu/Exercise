import java.util.regex.Pattern;

public class Exercise {

 static String ReverseWords(String str) 
	{
	 Pattern pattern = Pattern.compile("\\s");  
		String[] temp = pattern.split(str); 
		String result = "";
		for (int i = 0; i < temp.length; i++) { 
			if (i == temp.length - 1) 
				result = temp[i] + result; 
			else
				result = " " + temp[i] + result; 
		} 
		return result;                                               
		
		
	}
static String CamelCase(String builder)
 {
	
		String result = "";
	       if (builder.length() == 0) {
	           return result;
	       }
	       char firstChar = builder.charAt(0);
	       char firstCharToUpperCase = Character.toUpperCase(firstChar);
	       result = result + firstCharToUpperCase;
	       for (int i = 1; i < builder.length(); i++) {
	           char currentChar = builder.charAt(i);
	           char previousChar = builder.charAt(i - 1);
	           if (previousChar == ' ') {
	               char currentCharToUpperCase = Character.toUpperCase(currentChar);
	               result = result + currentCharToUpperCase;
	           } else {
	               char currentCharToLowerCase = Character.toLowerCase(currentChar);
	               result = result + currentCharToLowerCase;    
	           }
	       }
	       return result;
	      
	   }
static String NewLine(String input)
{
	
	input =input.replaceAll("\\,\\s?", ",\n");
	input =input.replaceAll("\\.\\s?","\\.\n");
	return input;
}
static String UpperCase(String output)
{
	
	String outputStr = "";

    String words[] = output.split(" ");

    for(int i = 0; i < words.length; i++)
    {
        String word = words[i];
        if(word.equalsIgnoreCase("downloads") || word.equalsIgnoreCase("bookmarks"))
        {
            word = word.toUpperCase();
        }
        outputStr += word;
        outputStr += " ";
    }
   
return outputStr;
}

 public static void main(String[] args)
{
	String str1=("Now you can browse privately,and other people who use this device won't see your activity.However,downloads and bookmarks will be saved."); 
	
	System.out.println("\n\n*********Reverse sentence***********\n\n"+ReverseWords(str1));
	
	System.out.println("\n\n****Camel Case:***** \n\n"+CamelCase(str1));
	
	System.out.println("\n\n****for new line :*****\n\n"+NewLine(str1));
	
	System.out.println("\n\n****For upperCase Specific Word*****\n\n" +UpperCase(str1));
}
}

	