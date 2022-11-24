package practiceCodeTT;

class A{
	static {
		System.out.println("1");
	}
	A(){
		System.out.println("2");
	}
}
class B extends A{
	static {
		System.out.println("3");
	}
	B(){
		System.out.println("4");
	}
}
public class OverR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = (B) new A();
		A a = new B();

	}

}
