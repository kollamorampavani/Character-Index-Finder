package strings;
import java.util.Scanner;
public class Print_index_of_char {
  public static int find_index(String s,char c) {
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)==c) {
			 return i; 
		  }
	  }
	  return -1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		   System.out.println("enter string");
		   String s=scan.nextLine();
		   System.out.println("enter char");
		   char c=scan.next().charAt(0);
		   int res=find_index(s,c);
		   System.out.println(res);
	}

}
