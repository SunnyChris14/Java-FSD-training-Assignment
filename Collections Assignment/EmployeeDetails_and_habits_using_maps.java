import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails_and_habits_using_maps
{
	public static void main(String[] args) 
	{
		HashMap<String,ArrayList<String>> map = new HashMap<>();
		System.out.println("Enter Employee Details and their hobbies");
		Scanner input = new Scanner(System.in);
		String Line="";
		String ID="";
		ArrayList<String> list = new ArrayList<String>();
		while(true)
		{
			list.clear();
			System.out.print("Enter Employee ID :");
			ID=input.next();
			System.out.print("Enter Employee Name :");
			list.add(input.next());
			System.out.print("Enter Employee Date Of Birth :");
			list.add(input.next());
			System.out.print("Enter Employee Salary :");
			list.add(input.next());
			System.out.print("Enter Employee Designation :");
			list.add(input.next());
			System.out.print("Enter Employee Hobbies :");
			list.add(input.next());
			map.put(ID,list);
			System.out.print("Type Yes to add another Employee or type anything to exit\n");
			Line=input.next();
			if(!Line.equals("Yes"))
			{
				System.out.println("Details uploaded successfully");
				break;
			}
		}
		int c=0;
		while(c==0)
		{
			System.out.println("Select an action");
			System.out.println("[1]. View all Employee Details and hobbies");
			System.out.println("[2]. View only a particular Employee Details and hobbies");
			System.out.println("[3]. Delete an Employee");
			System.out.println("[4]. Exit");
			Line=input.next();
			switch(Integer.parseInt(Line))
			{
				case 1:
				{
					for(String id : map.keySet())
					{
						System.out.println(" Employee ID   : "+id);
						System.out.println(" Name          : "+map.get(id).get(0));
						System.out.println(" Date Of Birth : "+map.get(id).get(1));
						System.out.println(" Salary        : "+map.get(id).get(2));
						System.out.println(" Designation   : "+map.get(id).get(3));
						System.out.println(" Hobbies       : "+map.get(id).get(4));
						System.out.println("----------------------------------------------------");
					}
					System.out.println("Type B to get to previous menu or type any key to exit.");
					Line=input.next();
					if(!Line.equals("B"))
					{
						c=1;
						System.out.print("Exited");
					}
					break;
				}
				case 2:
				{
					System.out.println("Enter Employee ID");
					Line=input.next();
					System.out.println(" Employee ID   : "+Line);
					System.out.println(" Name          : "+map.get(Line).get(0));
					System.out.println(" Date Of Birth : "+map.get(Line).get(1));
					System.out.println(" Salary        : "+map.get(Line).get(2));
					System.out.println(" Designation   : "+map.get(Line).get(3));
					System.out.println(" Hobbies       : "+map.get(Line).get(4));
					System.out.println("----------------------------------------------------");
					System.out.println("Type B to get to previous menu or type any key to exit.");
					Line=input.next();
					if(!Line.equals("B"))
					{
						c=1;
						System.out.print("Exited");
					}
					break;
				}
				case 3:
				{
					System.out.print("Enter Employee ID : ");
					Line=input.next();
					if(map.containsKey(Line))
					{
						map.remove(Line);
						System.out.println("Deleted successfully");
					}
					else
					{
						System.out.println("Employee ID not present");
					}
					System.out.println("Type B to get to previous menu or type any key to exit.");
					Line=input.next();
					if(!Line.equals("B"))
					{
						c=1;
						System.out.print("Exited");
					}
					break;
				}
				default :
				{
					c=1;
					System.out.print("Exited");
					break;
				}
			}
		}
		input.close();
	}
}
