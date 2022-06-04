package OOP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class person {
	
	private String name;
	private Date Date;
	private String Address;
	SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getDate() {
		
	String s1 =	s.format(Date);
		return s1;
	}
	public void setDate(String s2) throws ParseException {
		Date = s.parse(s2);
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}