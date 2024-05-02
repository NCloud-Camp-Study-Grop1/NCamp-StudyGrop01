package basic.basic02;

public class ChildB extends Parent {
	String fingerPrint;

	public ChildB(String firstName, String bloodType, int height, String skin, String fingerprint) {
		super(firstName, bloodType, height, skin);
		this.fingerPrint = fingerprint;
	}
}
