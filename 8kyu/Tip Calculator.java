public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {

        rating = rating.toLowerCase();

        switch (rating){
            case "terrible":
                return 0;
            case "poor":
                return Integer.valueOf(Math.toIntExact((long) Math.ceil(amount * 0.05)));
            case "good":
                return Integer.valueOf(Math.toIntExact((long) Math.ceil(amount * 0.10)));
            case "great":
                return Integer.valueOf(Math.toIntExact((long) Math.ceil(amount * 0.15)));
            case "excellent":
                return Integer.valueOf(Math.toIntExact((long) Math.ceil(amount * 0.2)));
            default:
                return null;
        }
    }
}
