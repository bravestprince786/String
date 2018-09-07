package string;
import java.util.*;
public class NoWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=1;
		int j=0;
		String arr[]=new String[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("no. of words ="+count);
	}

}
