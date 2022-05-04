import org.apache.commons.lang3.StringUtils;
public class Convert {
    public static String answer;
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 0: answer = "Общепринятая классификация связывает ноль \n" +
                    "с абсолютным небытием и неопределенностью всего сущего \n" +
                    "(по Пифагору – идеальная характеристика, показывающая отсутствие \n" +
                    "плохого или хорошего. Планета к нулю не привязана, что вполне логично, \n" +
                    "учитывается значение цифры).";
                    break;
            case 1: answer = "Символ могущества, власти, \n" +
                    "отваги и жизненной стойкости \n" +
                    "(по Пифагору – безграничный и ограниченный, \n" +
                    "в индийской нумерологии – Солнце).\n";
                    break;
            case 2: answer = "Деликатность, партнерство, женственность \n" +
                    "(показатель четности, как противоположность \n" +
                    "нечетности, и Луна).\n";
                    break;
            default: answer = null;
                    break;
        }
        return answer;
    }
}
