package practiceCodeTT;

public class Singleton {

	public static void main(String[] args) {
		// TODO : make singleton class
		MakeMeSingleton mmS = MakeMeSingleton.getInstance();
     
	}

}
class MakeMeSingleton {
	static MakeMeSingleton mms = new MakeMeSingleton();
	private MakeMeSingleton() {
		
	}
	public static MakeMeSingleton getInstance() {
		return mms;
	}
}