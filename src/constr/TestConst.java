package constr;

public class TestConst {
	
public static void main(String[] args) {
		
		Const dd = new Const("HillSide");
		Const dd1=new Const(25);
		Const dd2=new Const("LittleNeck",8456);
		
		Const bb=new Const();
		bb.setAddress("BaySide", 7689);;
		bb.displayAddress();
		int ff=bb.myTotal(56, 122);
		System.out.println(ff);
		System.out.println("**************");
		
		Computer ll=new Computer();
		ll.assembleComputer();
		ll.assembleMoniter();
		
		Laptop vv=new Laptop();
		vv.assembleComputer();
		vv.assembleMoniter();
		vv.displaySize();
		
		
		
		
		


	}
	

}
