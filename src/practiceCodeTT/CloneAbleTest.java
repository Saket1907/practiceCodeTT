package practiceCodeTT;

import java.util.HashMap;
import java.util.Map;

public class CloneAbleTest implements Cloneable{
	int rollNumber;
	int regId;
	
	public CloneAbleTest(int rollNumber, int regId) {
		this.rollNumber = rollNumber;
		this.regId = regId;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneAbleTest cAt = new CloneAbleTest(34, 87654);
		CloneAbleTest cAt2 = (CloneAbleTest) cAt.clone();
		
		System.out.println(cAt.rollNumber+"   "+cAt.regId);
		System.out.println(cAt2.rollNumber+"   "+cAt2.regId);
		
		Map<String, String> mapwa = new HashMap<String, String>();
		mapwa.put("Saket", "Kumar");
		mapwa.put("Saket", "Ravi");
		System.out.println(mapwa.get("Saket"));
	}

}
