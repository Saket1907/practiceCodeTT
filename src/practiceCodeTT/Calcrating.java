package practiceCodeTT;

public class Calcrating {

	int var[] = { 450, 75, 2, 4, 55 }; // in the order from rating 5 to 1

	public Calcrating() {
	}

	void calculateRating() {
	    float rating = 0f;
	    int sumIntial = 0;
	    int ratingStar = 0;
	    

	     for(int j = 5; j >=1; j-- ) {
	    	// ratingStar = j;
	    	 ratingStar = ratingStar + (var[6-j-1])*j;
	     }
         for(int i = 0; i < var.length; i++) {
        	 sumIntial =  sumIntial + var[i];  // till loop it will calulate the value
         }
         
          rating = ratingStar / sumIntial;        ///var.length;

	    System.out.println("overall rating of the product is: " + rating);
	  }



	public static void main(String[] args) {
		Calcrating cal = new Calcrating();
		cal.calculateRating();

	}

}
