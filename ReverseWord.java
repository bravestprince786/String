package string;
import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String[] word=str.split("\\s");
		String rev="";
		for(String s:word)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
		}
		System.out.println(" "+rev);
	}

}
