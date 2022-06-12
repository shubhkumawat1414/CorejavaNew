package Exercise_9;

public class Exercise_9_3 {
	private String Fname = null;
	private String Lname = null;
	
	public Exercise_9_3(String Fname, String Lname) //constructor
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
		Exercise_9_3 p=new Exercise_9_3("shubham","kumawat");
		Exercise_9_3 p1=new Exercise_9_3("aniket","kumawat");
		Exercise_9_3 p2=new Exercise_9_3("utkarsh","verma");
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
	}

}
