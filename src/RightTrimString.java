public class RightTrimString {
    public static void main(String[] args) {
        String inputString = "abc~~~~~pqr~~~~~~~~    ~~~~~~";
        Character toBeTrimed = '~';
        boolean trimFlag = false;
        int indexToWhichItShouldBeTrimed = 0;
    
        for(int i = inputString.length() - 1; i >= 0; i--){
            if(!trimFlag){
                if(inputString.charAt(i) != toBeTrimed){
                    indexToWhichItShouldBeTrimed = i;
                    trimFlag = true;
                }
            }
        } 
        String outputAfterTrim = inputString.substring(0, indexToWhichItShouldBeTrimed);
        System.out.println(outputAfterTrim);
    }
}
