public class DRoot {
  public static int digital_root(int n) {

        String digit = String.valueOf(n);
        char[] ch = digit.toCharArray();
        int suma=0;

        for (int i=0; i<=ch.length-1; i++)
            suma+= Integer.parseInt(java.lang.String.valueOf(ch[i]));
            if (suma>10)
                return digital_root(Integer.parseInt(String.valueOf(suma)));


        return suma;
    }
}
