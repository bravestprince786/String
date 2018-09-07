package string;
import java.util.*;
public class WordCount {


 public static void split1(String arr[])
{
	String temp[]=new String[50];
	 
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]==" ")
		{
		temp[i]=arr[i];	
		}
	}
	for(int i=0;i<=temp.length-1;i++)
	{
		System.out.println(""+temp[i]);
	}
}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[50];
		System.out.println(" Enter the Sentence :");
		arr[50]=sc.nextLine();
		split1(arr);
		
	}

}
