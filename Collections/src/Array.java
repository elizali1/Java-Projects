import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int) ((Math.random()*49)+1);
        }
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}