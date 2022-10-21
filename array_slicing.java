package javaTask1;
import java.util.Arrays;

public class array_slicing {
	    public static void main(String[] args) {
	        int[] originalArr = { 1, 2, 3, 4, 5 };
	        int startIndex = 2;
	        int endIndex = 4;
            int[] slicedArr = Arrays.copyOfRange(originalArr, startIndex, endIndex);

	        System.out.println(Arrays.toString(slicedArr));
	    }
}


