package CollectionHashcode;

public class Marksheet_1 {

	private String RollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public Marksheet_1(String rollNo, String name, int physics, int chemistry, int maths) {
		RollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	public String getName() {
		return name;
	}

	public String getRollNo() {
		return RollNo;
	}

	public int getPhysics() {
		return physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public int getMaths() {
		return maths;
	}
}