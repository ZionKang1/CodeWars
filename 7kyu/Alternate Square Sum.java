public class Kata {

  public static int alternateSqSum(int[] arr) {
        int suma = 0;
        for (int i = 0; i<arr.length; i++)
            suma = (i % 2 != 0) ? (int) (suma + Math.pow(arr[i], 2)) : suma+ arr[i];
        
        return suma;
    }
  
} 
