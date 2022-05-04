public class Dnk {
    public static String dnaToRna(String dnk) {
        String rnk = "";
        for (int counter = 0; counter < dnk.length(); counter = counter + 1) {
            if (dnk.charAt(counter) == 'G') {
                rnk = rnk + 'C';
            } else if (dnk.charAt(counter) == 'C') {
                rnk = rnk + 'G';
            } else if (dnk.charAt(counter) == 'T') {
                rnk = rnk + 'A';
            } else if (dnk.charAt(counter) == 'A') {
                rnk = rnk + 'U';
            } else if (dnk == "") {
                return rnk;
            } else {
                return null;
            }
        }
        return rnk;
    }

}