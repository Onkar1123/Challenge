
/*Example 1:
Input: arr = [1,2,3,10,4,2,3,5]
Output: 3
Explanation: The shortest subarray we can remove is [10,4,2]
of length 3. The remaining elements after that will be
[1,2,3,3,5] which are sorted.
Another correct solution is to remove the subarray [3,10,4].
Example 2:
Input: arr = [5,4,3,2,1]
Output: 4
Explanation: Since the array is strictly decreasing, we can
only keep a single element. Therefore we need to remove a
subarray of length 4, either [5,4,3,2] or [4,3,2,1].
Example 3:
Input: arr = [1,2,3]
Output: 0
Explanation: The array is already non-decreasing. We do not
need to remove any elements.
Example 4:
Input: arr = [1]
Output: 0
Constraints:
 1 <= arr.length <= 10^5
 0 <= arr[i] <= 10^9*/
import java.util.*;
import java.io.*;
class CompQ1
{
public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,count=1,negativecount=0;
		//System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		a[i]=sc.nextInt();
		//int a[]={1,2,3,10,4,2,3,5};
		//int size=a.length;
		/*if(size==1)
			System.out.print("0");*/
		for(i=size-1;i>0;i--)
		{
			for(j=i-1;j>=0;)
			{
				int val=a[i]-a[j];
				
				//System.out.println("val= "+val);
				if(val>=0)
				{
					
				count++;
				//System.out.print("count= "+count);
				i=j;
				j--;
				
				}
				else
				{
				negativecount++;
				//System.out.print("nc= "+negativecount);
				j--;
				}
			}
			//System.out.print("size="+size+"\ncount="+count+"\nncount="+negativecount);
			
		}
		System.out.print(size-count);
		
	}
}