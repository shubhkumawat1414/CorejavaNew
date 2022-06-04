package OOP;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile M = new Automobile();
		
		M.setColor("white");
		M.setSpeed(420);
		M.setMake("Rang Rover");
		
		M.getColor();
		M.getSpeed();
		M.getMake();
		
		System.out.println("Car Color= "+M.getColor());
		System.out.println("Car Speed= "+M.getSpeed());
		System.out.println("Make Name= "+M.getMake());
		
	}
}
