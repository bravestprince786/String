package string;
import java.util.*;
public class Consecutive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		int count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
		}
		System.out.println("number of duplicate character :"+count);
		//String str1[]=new String[str.length()];
		int flag=1;
		String str1[]=str.split("\\s");
		for(String s:str1)
		{
			char ch1[]=s.toCharArray();
			Arrays.sort(ch1);
			for(int i=0;i<ch1.length-1;i++)
			{
				if(ch1[i]==ch1[i+1] )
				{
					flag++;
				}
			}
			System.out.println("word :"+s+"duplicate consecutive count :"+flag);
		}
	}

}
