public class ConnectionDemo
{

	public static void main(String[] args)
	{
		Connection ref[]=new Connection[3];
		ref[0]=new Connection("1265","abcd124","abcd@gmail.com",10000);
		ref[1]=new Connection("4564","efgh456","efgh1@gmail.com",9000);
		ref[2]=new Connection("1745","efgh456","efgh2@gmail.com",11000);
		String check_customer="efgh456";
		System.out.println(getAverageBalance(ref,check_customer));
	}
	public static double getAverageBalance(Connection ref[], String check_customer)
	{
		int i;
		double average=0;
		int count=0;
		for(i=0;i<3;i++)
		{
			if(ref[i].customerid.equals(check_customer))
			{
				count=count+1;
				average=average+ref[i].balance;
			}
		}
		System.out.print("Average Balance of customer with customerid :"+check_customer+" is ");
		return average/count;
	}
}
