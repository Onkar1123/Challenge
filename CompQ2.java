/*The string "PAYPALISHIRING" is written in a
zigzag pattern on a given number of rows like this: (you may
want to display this pattern in a fixed font for better legibility)
P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion
given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return
"PAHNAPLSIIGYIR"
Example 2 :
ABCD, 2 can be written as
A....C
...B....D*/
import java.util.*;
import java.io.*;
class CompQ2
{String pattern="";
	
	String convert(String text,int nRows)
	{
		if(nRows==1)
		{
			for(int i=0;i<text.length();i++)
			{
				pattern=pattern+text.charAt(i);
			}
		}
		else if(nRows==2)
		{
			for(int i=0;i<text.length();i++)
			{
				if(i==0)
				{
				for(int j=0;j<text.length();j=j+nRows)
				{
				pattern=pattern+text.charAt(j);
				}
				}
				if(i==1)
				{
				for(int j=1;j<text.length();j=j+nRows)
				{
				pattern=pattern+text.charAt(j);
				}
				}
			}
		}
		else
		{
			int inc=2*(nRows-1);
			int count=1;
			int j; 
			for(int i=0;i<nRows;i++)
			{
				for(j=i;j<text.length();j=j+inc)
				{
				pattern=pattern+text.charAt(j);
				  if (i != 0 && i != nRows - 1 && (j + inc- 2 * i) < text.length()) 
				pattern=pattern+text.charAt(j + inc - 2 * i);
			
			}
		}
		}return pattern;
	}

		
	
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		int nRows=sc.nextInt();
		CompQ2 q=new CompQ2();
		System.out.print(q.convert(text,nRows));
		
		
	}
}