package seleniumproject;

public class Derived extends Base {

	protected final void getInfo() {
		System.out.println("method of Derived  class");
	}
	public static void main(String[] args) {
		Base b=new Base();
		b.getInfo();
	}

}
