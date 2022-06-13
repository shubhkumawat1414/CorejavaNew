package Exercise_9_7_2;

public class Person {
	private String Fname = null;
	private String Lname = null;
	
	public Person(String Fname, String Lname) //constructor
	{
		this.Fname=Fname;
		this.Lname=Lname;
	}
	
	public String toString() //overriden toString method (its method of Object class), if we do not use this method
	{                        //then it will print hashcode values of the objects
	    return Fname+" "+Lname;
	}
	 
	public static void main(String[] args)
	{
		Person p=new Person("Shubham","Kumawat");
		Person p1=new Person("Aniket","Kumawat");
		Person p2=new Person("Utkarsh","Verma");
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
	}

}
