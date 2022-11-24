package practiceCodeTT;

class CreateSingletonClass {
	static CreateSingletonClass csc = new CreateSingletonClass();
	private CreateSingletonClass() {	
	}
	public static CreateSingletonClass getInstance() {
		return csc;
	}
}
public class CreateSingletonDriverClass{
	public static void main(String args[]) {
		CreateSingletonClass objCSC = CreateSingletonClass.getInstance();	
	}
}
