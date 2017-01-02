public class Vowels {

  public static int getCount(String str) {
        int vowelsCount = 0;
        char[] ch = str.toCharArray();
        for (int i=0; i<=ch.length-1; i++ )
            if (ch[i]=='a' || ch[i]=='o' || ch[i]=='e' || ch[i]=='i' || ch[i]=='u')
                vowelsCount++;
        return vowelsCount;
    }

}
