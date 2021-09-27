import java.util.*;
public class EmployeeDetails 
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<String>> employee_details_list = new ArrayList<ArrayList<String>>();
		System.out.println("Enter the details of Employees in the Organization");
		Scanner input = new Scanner(System.in);
		String Line="";
		int c=1;
		for(int i=0;c>0;i++)
		{
			employee_details_list.add(new ArrayList<String>());
			for(int j=0;c>0 && j<5;j++)
			{
				switch(j)
				{
				case 0:
				{
					System.out.print("Enter the Name of the employee :");
					break;
				}
				case 1:
				{
					System.out.print("Enter the Employee ID of the employee :");
					break;
				}
				case 2:
				{
					System.out.print("Enter the Date of Birth of the employee :");
					break;
				}
				case 3:
				{
					System.out.print("Enter the Salary of the employee :");
					break;
				}
				case 4:
				{
					System.out.print("Enter the Designation of the employee :");
					break;
				}
				}
				Line=input.nextLine();
				c=Line.length();
				employee_details_list.get(i).add(j,Line);
			}
		}
		print_employee_details(employee_details_list);
		System.out.println("Select an action\n"
				+ "[1]. Check whether an Employee exists or not\n"
				+ "[2]. Add Employee details to the Employee Details of Organization");
		Line=input.next();
		switch(Integer.parseInt(Line))
		{
		case 1 :
		{
			System.out.println("Enter the Name of the Employee to check");
			Line=input.next();
			for(ArrayList<String> list :employee_details_list)
			{
				if(list.get(0).equals(Line))
				{
					System.out.println("Given Employee exists");
					System.out.print("====================================================================\n");
					System.out.print("Name Employee , ID , Date of Birth , Salary , Designation\n");
					System.out.print("====================================================================\n");
					for(String detail : list)
					{
						System.out.print(detail+"  ");
					}
					System.out.println("\nPress Y to delete the employee details and N to exit");
					Line=input.next();
					if(Line=="Y")
					{
						employee_details_list.remove(list);
						System.out.println("Employee details removed");
					}
				}
				else
				{
					System.out.println("Given Employee does not exist");
				}
				break;
			}
			break;
		}
		case 2 :
		{
			add_employee_details(employee_details_list);
			break;
		}
		default :
		{
			System.out.println("Invalid Selection");
			break;
		}
		}
		input.close();
	}
	public static void print_employee_details(ArrayList<ArrayList<String>> employee_details_list)
	{
		System.out.println("Employee Details in the organization");
		System.out.println("===================================================================");
		System.out.println("Name Employee , ID , Date of Birth , Salary , Designation");
		System.out.println("===================================================================");
		
		//for each loop
		for(ArrayList<String> list :employee_details_list)
		{
			//Iterator
			
			Iterator<String> detail = list.iterator();
			while(detail.hasNext())
			{
				String str = detail.next();
				if(str!="")
				{
					System.out.print(str+" , ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void add_employee_details(ArrayList<ArrayList<String>> employee_details_list)
	{
		Scanner input = new Scanner(System.in);
		String Line="";
		int t=1;
		while(t==1)
		{
			ArrayList<String> list1 = new ArrayList<String>();
			System.out.println("Enter the Name of the employee :");
			Line=input.next();
			for(ArrayList<String> li : employee_details_list)
			{
				if(li.get(0).equals(Line))
				{
					System.out.println("Duplicate entry detected which is not allowed");
					input.close();
					return;
				}
			}
			list1.add(Line);
			System.out.println("Enter the Employee ID of the employee :");
			Line=input.next();
			list1.add(Line);
			System.out.println("Enter the Date of Birth of the employee :");
			Line=input.next();
			list1.add(Line);
			System.out.println("Enter the Salary of the employee :");
			Line=input.next();
			list1.add(Line);
			System.out.println("Enter the Designation of the employee :");
			Line=input.next();
			list1.add(Line);
			employee_details_list.add(list1);
			System.out.println("Employee details added successfully");
			System.out.println("Type Y to add another employee details\n"
					+ "Type V to view employee details\n"
					+ "Type E to exit");
			Line=input.next();
			if(Line.equals("V"))
			{
				print_employee_details(employee_details_list);
			}
			if(!Line.equals("Y"))
			{
				t=0;
				System.out.println("Exited");
			}
		}
		input.close();
	}
}
