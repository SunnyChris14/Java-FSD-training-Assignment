import java.util.*;
public class Book
{
	String Name;
	String Email;
	String Gender;
	int Age;
	public void Author(String Name,String Email,String Gender,int i)
	{
		this.Name=Name;
		this.Email=Email;
		this.Gender=Gender;
		this.Age=i;
	}
	String BookName;
	Double Price;
	ArrayList<Object> l = new ArrayList<Object>();
	public Book(String BookName,ArrayList<Object> l ,Double Price)
	{
		this.BookName=BookName;
		this.l=l;
		this.Price=Price;
	}
	public static void main(String[] args)
	{
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList<Object> list1 = new 
				ArrayList<Object>(Arrays.asList("R P N Singh","RPNSingh@gmail.com","Male",30));
		Book b1=new Book("Politics of Opportunism",list1,1000.00);
		list.add(b1);
		ArrayList<Object> list2 = new 
				ArrayList<Object>(Arrays.asList("Akkitham Achuthan Namboodri","AAM@gmail.com","Male",30));
		Book b2=new Book("Malayalam poetry",list2,1450.00);
		list.add(b2);
		ArrayList<Object> list3 = new 
				ArrayList<Object>(Arrays.asList("Margaret Atwood","Ma@gmail.com","Female",24));
		Book b3=new Book("The Testaments",list3,950.00);
		list.add(b3);
		ArrayList<Object> list4 = new 
				ArrayList<Object>(Arrays.asList("Jokha Alharthi","Ja@gmail.com","Female",23));
		Book b4=new Book("Celestial Bodies",list4,2000.00);
		list.add(b4);
		ArrayList<Object> list5 = new 
				ArrayList<Object>(Arrays.asList("Vasdev Mohi","Vm@gmail.com","Female",22));
		Book b5=new Book("Cheque book",list5,500.00);
		list.add(b5);
		ArrayList<Object> list6 = new 
				ArrayList<Object>(Arrays.asList("Richard Powers","Rp@gmail.com","Male",28));
		Book b6=new Book("The Overstory",list6,600.00);
		list.add(b6);
		ArrayList<Object> list7 = new 
				ArrayList<Object>(Arrays.asList("PM Narendra Modi","Modi@gmail.com","Male",35));
		Book b7=new Book("The Braille edition of the book Exam Warriors",list7,1200.00);
		list.add(b7);
		ArrayList<Object> list8 = new 
				ArrayList<Object>(Arrays.asList("Viswanathan Anand and Susan Ninan","vis@gmail.com","Male",54));
		Book b8=new Book("Mind-Master",list8,1000.00);
		list.add(b8);
		ArrayList<Object> list9 = new 
				ArrayList<Object>(Arrays.asList("Hemant Karkare's daughter Jui Karkare","hem@gmail.com","Female",30));
		Book b9=new Book("Hemant Karkare: A Daughter’s Memoir",list9,750.00);
		list.add(b9);
		ArrayList<Object> list10 = new 
				ArrayList<Object>(Arrays.asList("Chief Justice of India (CJI) Ranjan Gogoi","Rajan@gmail.com","Male",40));
		Book b10=new Book("Courts of India",list10,650.00);
		list.add(b10);
		ArrayList<Object> list11 = new 
				ArrayList<Object>(Arrays.asList("Shri N Chandrasekaran","chan@gmail.com","Male",22));
		Book b11=new Book("Bridgital Nation",list11,1050.00);
		list.add(b11);
		ArrayList<Object> list12 = new 
				ArrayList<Object>(Arrays.asList("Neha J Hiranandani","Neha@gmail.com","Female",29));
		Book b12=new Book("Girl Power: Indian Women Who Broke The Rules",list12,850.00);
		list.add(b12);
		ArrayList<Object> list13 = new 
				ArrayList<Object>(Arrays.asList("Ministry of fisheries","min@gmail.com","Male",36));
		Book b13=new Book("Handbook on Fisheries Statistics - 2018",list13,950.00);
		list.add(b13);
		ArrayList<Object> list14 = new 
				ArrayList<Object>(Arrays.asList("Indian Diaspora Club","dias@gmail.com","Male",26));
		Book b14=new Book("Glorious Diaspora-Pride of India",list14,1000.00);
		list.add(b14);
		ArrayList<Object> list15 = new 
				ArrayList<Object>(Arrays.asList("Peter Baker","Peter","Male",22));
		Book b15=new Book("Obama: The Call of History",list15,1150.00);
		list.add(b15);
		
		System.out.println("[1]. Unique names in upper case of the first 5 book authors that are 30 years old or older in our list are as follows ");
		list.stream().filter(x->((Integer)(x.l).get(3)>=30)).limit(5).forEach(y->System.out.println((y.l.get(0)).toString().toUpperCase()));
		
		System.out.println("\n[2]. Sum of ages of all female authors younger than 25 is ");
		Integer summ =list.stream().filter(x->(x.l).get(2).equals("Female")).map(x->(Integer)(x.l).get(3)).filter(x->x<25).reduce(0,(sum,i)->sum+i);
		System.out.println(summ);
	}

}
