import java.util.Arrays;
public class Solution {

 public static String meanVsMedian(int[] numbers) {

        int mean=0;
        int sum=0;
        int median=0;
        String result = null;
        Arrays.sort(numbers);
        
        for (int i=0; i<=numbers.length-1; i++){

            sum += numbers[i];
            mean = sum/numbers.length;
            

        if (numbers.length%2!=0){
            
            {median = numbers[numbers.length/2];}}
        else
        {median = (numbers[(numbers.length/2)]+numbers[(numbers.length/2)-1])/2;}}

        if (mean == median)
                result="same";
        else if (mean>median)
                result="mean";
        else if (median>mean)
                result="median";

        return result;
    }
}
