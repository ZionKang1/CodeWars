public class Numbers
{
public static double twoDecimalPlaces(double number)
    {
        //Write your code here
        int temporary = (int) (number*100);
        return temporary/100.0;
    }
}
