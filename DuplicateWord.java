package string;
import java.util.*;
public class DuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String str=sc.nextLine();
		String str1[]=str.split("\\s");
		int j=1;
		for(int i=0;i<=str1.length-1;i++)
		{
			
				if(str1[i]==str1[i++])
				{
					//System.out.println(str1[i]+" "+str1[i++]);
					j++;
				}
			
		}
		System.out.println("word count :"+j);

	}

}
