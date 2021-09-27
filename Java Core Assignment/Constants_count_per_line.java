import java.util.Scanner;
import java.util.HashMap;
public class Constants_count_per_line
{
	public static void main(String[] args) 
	{
		HashMap<Character , Integer> map= new HashMap<Character , Integer>();
		System.out.println("Enter Lines");
		Scanner input = new Scanner(System.in);
		String Line=input.nextLine();
		while(! Line.equals(""))
		{
			for(char i=65 ; i<91 ;i++)
			{
				map.put(i,0);
			}
			for(char c : Line.toCharArray())
			{
				c=Character.toUpperCase(c);
				if((c>64 && c<91))
				{
					if(c!='A' &&  c!='E' && c!='I'
							&& c!='O' && c!='U')
					{
						map.put(c, map.get(c)+1);
					}
				}
			
			}
			int temp=0;
			for(int k : map.values())
			{
				if(k>0)
				{
					temp=1;
					System.out.print("Consonants count: ");
					break;
				}
			}
			if(temp==0)
			{
				System.out.println("Consonants not present");
			}
			else
			{
				for(char ch : map.keySet())
				{
					if(map.get(ch)>0)
					{
						System.out.print(ch+" : "+map.get(ch)+"  ");
					}
				}
				System.out.println("");
			}

			Line=input.nextLine();
		}
		System.out.println("Exited");
		input.close();
	}
}
