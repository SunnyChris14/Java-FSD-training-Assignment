import java.util.Scanner;

public class Toydemo
{
	public static void main(String[] args)
	{
		Toy Toy1 = new Toy("Apple","fruits",100,5);
		Toy Toy2 = new Toy("Orange","fruits",110,10);
		Toy Toy3 = new Toy("Lion","animal",170,10);
		Toy Toy4 = new Toy("Tiger","animal",150,5);

		leastpricetoyname(Toy1,Toy2,Toy3,Toy4);
	}
	
	public static void leastpricetoyname(Toy Toy1,Toy Toy2,Toy Toy3,Toy Toy4)
	{
		Toy ref[]=new Toy[4];
		ref[0]=Toy1;
		ref[1]=Toy2;
		ref[2]=Toy3;
		ref[3]=Toy4;
		String check_category;
		System.out.print("Type a toy category : ");
		try{
			Scanner input = new Scanner(System.in);
			check_category = input.next();
			input.close();
		}finally {
		}

		int count=0; 
		String temp="hloF";
		double leastprice=999999999;
		double costofthis;
		int i;
		
		for(i=0;i<4;i++)
		{
			if(ref[i].category.equals(check_category))
			{
				count=1;
				costofthis=ref[i].price-(ref[i].price*ref[i].discount/100);
				if(costofthis<leastprice)
				{
					leastprice=costofthis;
					temp=ref[i].Name;
				}
			}
		}
		if(count==0)
		{
			System.out.println("no category found");
		}
		else
		{
			System.out.println("Least priced Toy Name : "+temp);
		}
	}
	
}
