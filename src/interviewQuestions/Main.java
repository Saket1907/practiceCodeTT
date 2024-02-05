import java.util.Arrays;
import java.util.stream.Stream;

/******************************************************************************
Welcome to GDB Online.
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) throws Exception{
	    Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
	    
        Integer[] flattenedArray = flatten(array);
        
        System.out.println(Arrays.toString(flattenedArray));
	}
	
	public static Integer[] flatten(Object[] inputArray) throws Exception {
	    
	    //Stream.of(inputArray).flatMap(Stream.of(inputArray));
	    Arrays.stream(inputArray).flatMap();
	    
	}
	
}

