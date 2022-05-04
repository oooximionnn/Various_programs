import static java.lang.Integer.parseInt;

public class AmountMoney {
    public static int getTotalAmount(String[] currencies, String cash) {
        int sum = 0;
        for (String value : currencies) {
            if (value.substring(0, 3).equals(cash)) {
                sum = sum + parseInt(value.substring(4));
            }
        }
        return sum;
    }
}
