package javaTask1;
import java.util.Arrays;
public class array_program {
            public static void main(String[] args) {
	        int[] name = {62,55,23,98,46};
	        System.out.println(Arrays.toString(name));
	        System.out.println(name[0]);
	        System.out.println(name[3]);
	        name[2] = 20;
	        System.out.println(name[2]);
	        System.out.println(Arrays.toString(name));
	        int[] array = new int[3];
	        array[0] = 3;
	        array[1] = 6;
	        System.out.println(Arrays.toString(array));
	        System.out.println(array.length);
	        }
}


