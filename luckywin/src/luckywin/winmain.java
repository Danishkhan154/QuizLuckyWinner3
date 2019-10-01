package luckywin;
import java.util.*;
public class winmain 
{

	public static void main(String[] args) 
	{
	
		ArrayList arl=new ArrayList();
		int count=0;
		
				
		for(int i=0;i<4;i++)
		{
		 user ob =new user();
		 ob.input();
		
		  if(ob.ans=='b')
		    {
			  arl.add(ob);
			 
	     	}else
	     	{
	     		
	     	}
		}
		 
		Collections.shuffle(arl);
		Iterator itr=arl.iterator();
		
		while(count<3 && itr.hasNext())
		{ 
			System.out.println(itr.next());
			count++;
		}
			
		
		
	}

}
