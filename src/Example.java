public class Example {
    public static String example(String sale) {
        char[] c = sale.toCharArray();
        if (sale.length() % 2 == 0) {
            for (int counter = 0; counter < sale.length(); counter = counter + 2) {
                char timy = c[counter];
                c[counter] = c[counter + 1];
                c[counter + 1] = timy;
                String swappedString = new String(c);
                sale = swappedString;
            }
        } else {
            for (int counter = 0; counter < sale.length() - 1; counter = counter + 2) {
                char timy = c[counter];
                c[counter] = c[counter + 1];
                c[counter + 1] = timy;
                String swappedString = new String(c);
                sale = swappedString;
            }
        } return sale;
    }
}