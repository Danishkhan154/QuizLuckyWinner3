package luckywin;
import java.util.*;
public class user 
{
	String name;char ans;
	Scanner sc=new Scanner(System.in);
	
	public void input(){
	System.out.println("Enter name\n");
	name=sc.nextLine();
	System.out.println("Command used to view os name\n");
	System.out.println("a : os\n");
	System.out.println("b : uname\n");
	System.out.println("c : who\n");
	System.out.println("d : osname\n");
	ans= sc.next().charAt(0);
	}
	
}
