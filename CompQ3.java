/*Question 3: Given a string s consists of upper/lower-case
alphabets and empty space characters ' ', return the length of the
last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consisting of
non-space characters only.
Example:
Given s = "Hello World",
return 5 as length("World") = 5.*/
import java.util.*;
import java.io.*;
class CompQ3
{int len;
	int valueOfLastWord(String s)
	{
		String[] arr=s.split("\\s");
	for(int i=0;i<arr.length;i++)
	{
		
	
		if(i==arr.length-1)
		{
		 len=arr[i].length();
		
		
		}
		
	}
		if(arr.length==0)
			return 0;
			return len;
	}
public static void main(String args[])throws IOException
{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//Scanner sc=new Scanner(System.in);
	CompQ3 q=new CompQ3();
	String s=br.readLine();
	System.out.print(q.valueOfLastWord(s));
	
    
}
}