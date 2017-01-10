public static int[] squareOrSquareRoot(int[] array)
    {
        for (int i=0; i<=array.length-1; i++ ) {
            array[i] = Math.pow((int)Math.sqrt(array[i]),2)  == array[i] ? (int) Math.sqrt(array[i]) : (int) Math.pow(array[i],2);}

        return array;
    }
