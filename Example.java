package string;
import java.util.*;	
public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String str1[]=new String[count];
		int j=0;
		String s="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				str1[j]=s;
				j++;
				s="";
			}
			else {
				s=s+str.charAt(i);
			}
			str1[j]=s;
		}
		System.out.println("===========Displaying the Array without Split function============");
		for(int i=0;i<=str1.length-1;i++)
		{
			System.out.println(str1[i]+" ");
		}
		int dp=1;;
		for(int i=0;i<=str1.length-1;i++)
		{ 
			for(int k=i+1;k<=str1.length-1;k++)
			{
				if(str1[i].equals(str1[k]))
				{	dp++;
				
				}
			}
				System.out.println(" dupllicate word count ");
				System.out.println(str1[i]+"--"+dp);	//Printing the word along with count
				dp=1;
		}
		
		
	}

}
