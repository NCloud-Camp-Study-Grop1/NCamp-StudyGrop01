package basic.basic02;

public class Parent {
	// field
	String firstName;
	String bloodType;
	int height;
	String skin;
	
	// operator
	public Parent(String firstName, String bloodType, int height, String skin) {
		super();
		this.firstName = firstName;
		this.bloodType = bloodType;
		this.height = height;
		this.skin = skin;
	}
	
	// getter and setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}

	// override toString method
	@Override
	public String toString() {
		return "Parent [firstName=" + firstName + ", bloodType=" + bloodType + ", height=" + height + ", skin=" + skin
				+ "]";
	}
}
