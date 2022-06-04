package OOP;

public class Automobile {

	private String color;
	private int Speed;
	private String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void breck(int b){
		Speed = Speed-Speed;
	}
	public void ChangerGear(int cg){
		Speed = cg;
	}
	public void Accelerator(int ac){
		Speed = Speed+ac;
	}
}