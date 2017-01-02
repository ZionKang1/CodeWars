public class Calculator
{
   public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        Double result = null;
        //String result;
        switch (operation){
            case "+":
                result=numberOne+numberTwo;
                break;
            case "-":
                result=numberOne-numberTwo;
                break;
            case "/":
                if (numberOne<0 && numberTwo!=numberOne)
                    result=null;
                else
                    result=numberOne/numberTwo;
                break;
            case "*":
                result=numberOne*numberTwo;
                if (Result==-0.0)
                    Result=0.0;
                break;
            default:
                result=null;
                break;

        }

        return result;
    }
}
