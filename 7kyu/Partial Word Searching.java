class WordSearch {
  static String[] findWord(String x, String[] y){
        
        String result="";

        for (int i=0; i<y.length;i++)
            if (y[i].toLowerCase().contains(x.toLowerCase()))
                result+=y[i]+",";
            

        return result.length()>0 ? result.split( ",") : new String []{"Empty"};
    }
}
