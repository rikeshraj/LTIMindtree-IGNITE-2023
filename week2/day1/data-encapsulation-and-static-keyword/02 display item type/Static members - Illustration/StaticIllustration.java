public class StaticIllustration {
	private int i1;
	private static int i2;
	
	void setI1(int i1) {
		this.i1 = i1;
	}
	int getI1() {
		return i1;
	}

	void setI2(int i2) {
		this.i2 = i2;
	}
	int getI2(){
		return i2;
	}

	void displayDetails() {
		System.out.println("Details : i1 = " + i1 + ",i2 = " + i2);
	}
}
