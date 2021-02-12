package constr;

public class Laptop extends Computer{
	
	public Laptop() {
		super(8);
		System.out.println(ramSize);
	}
	
	public void displaySize() {
		super.assembleComputer();
		super.assembleMoniter();
	}

}
