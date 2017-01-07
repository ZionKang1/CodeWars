class StringCounter {

  public static int stringCounter(String inputS, char charS){
        int count = 0;
        char[] arr = inputS.toCharArray();
        for (char c : arr){
            count += c == charS ? 1 : 0;}

        return count;
    }
}
