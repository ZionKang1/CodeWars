public class DnaStrand {
  public static String makeComplement(String dna) {

        char[] ch = dna.toCharArray();
        String result="";
        for (int i=0; i<=ch.length-1; i++)
            switch (ch[i]){
                case 'A':  result+=(ch[i]='T'); break;
                case 'T':  result+=ch[i]='A'; break;
                case 'G':  result+=ch[i]='C'; break;
                case 'C':  result+=ch[i]='G'; break;
            }
        return result;
    }
}
