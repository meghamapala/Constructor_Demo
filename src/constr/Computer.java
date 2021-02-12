package constr;

public class Computer {
	
	int ramSize;
	
	public Computer() {}
	
	public Computer(int ramSize) {
		this.ramSize=ramSize;
		System.out.println(ramSize);
	}
	
	public void assembleComputer() {
		System.out.println("Computer was assembled in USA");
	}
	
	public void assembleMoniter() {
		System.out.println("Computer Moniter has Retina Screen");
	}

}
