package constr;

public class Const {
	
	String address;
	int num;
	
	public Const() {
		
	}

	
	public  Const(String address) {
		
		this.address=address;
		System.out.println(address);
		
	}
	
	public Const(int num) {
		this.num=num;
		System.out.println(num);
	}
	
	public Const(String address,int num) {
		this.address=address;
		this.num=num;
		System.out.println(address+num);
		
	}
	
	public void setAddress(String address,int num) {
		this.address=address;
		this.num=num;
	}
	public void displayAddress() {
		String kk=this.address;
		int dd=this.num;
		System.out.println(kk+"    "+dd);
	}
	
	public int myTotal(int num1,int num2) {
		int total=num1+num2;
		return total;
		
		
	}
	
	

}
