import org.apache.commons.lang3.ArrayUtils;

public class Balanced {
    public static Boolean isBalanced(String str) {
        // BEGIN (write your solution here)
        int countLeft = 0;
        int countRight = 0;
        boolean lawyer = true;
        char[] characterArray = str.toCharArray();
        for (char element : str.toCharArray()) {
            if (Character.toString(element).equals(")")) {
                countRight++;
            }
            if (Character.toString(element).equals("(")) {
                countLeft++;
            }
        }
        if (countLeft == countRight) { // если число скобок четное - значит подходит
            if (str.length() > 0) {
                if (Character.toString(str.replaceAll(" ", "").charAt(0)).equals(")")) {
                    lawyer = false; // если строка начинается с закрывающейся скобки - false
                } else if (Character.toString(str.replaceAll(" ", "").charAt(str.length() - 1)).equals("(")) {
                    lawyer = false; // если строка заканчивается с открывающейся скобки - false
                }
            }
            while (characterArray.length > 0 && lawyer == true) { // каждая итерация удалит пару скобок сначала
                characterArray = ArrayUtils.removeElement(characterArray, '(');
                characterArray = ArrayUtils.removeElement(characterArray, ')');
                String strr = String.valueOf(characterArray);
                if (str.length() > 0) {
                    if (str.charAt(0) == ')') {
                        lawyer = false;
                    }
                }
            }
            return lawyer;
        } else {
            return false;
            // END
        }
    }
}
