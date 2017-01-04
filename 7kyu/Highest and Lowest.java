import java.util.Arrays;
public class Kata {
  public static String HighAndLow(String numbers) {

        String [] sArray = numbers.split(" ");
        int [] intArray = new int[sArray.length];
        for (int i = 0; i<sArray.length;i++) {
            intArray[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(intArray);
        return String.valueOf(intArray[intArray.length-1]+" "+intArray[0]);
    }
}
