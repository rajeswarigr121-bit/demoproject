package singleinheritance;

public class ChildExample extends ParentExample{

	public void sub() {
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		ChildExample obj=new ChildExample();
		obj.sum();
		obj.sub();
		// TODO Auto-generated method stub

	}

}
