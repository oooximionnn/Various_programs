public class Fib {
    public static int fibbonachi(int fibbo){
        int[] arr;
        arr = new int[fibbo + 1];
        for(int counter = 0; counter <= fibbo; counter = counter + 1) {
            if (counter == 0) {
                arr[counter] = 0;
            } else if (counter == 1) {
                arr[counter] = 1;
            } else {
                arr[counter] = arr[counter - 1] + arr[counter - 2];
            }
        }
        return arr[fibbo];
    }
}
