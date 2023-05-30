package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        String variable;
        int i;
        if (strings.length == 2) {
            variable = strings[0];
            strings[0] = strings[1];
            strings[1] = variable;
        } else {
            for (i = 0; i < (strings.length - 1) / 2; i++) {
                variable = strings[i];
                strings[i] = strings[strings.length - 1 - i];
                strings[strings.length - 1 - i] = variable;
            }
        }

        return strings;
    }
}