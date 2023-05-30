package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        int j;
        int i;
        char[][] arr = new char[size][size];
        for (i = 0, j = size - 1; i < size && j >= 0; i++, j--) {
            arr[i][i] = 'X';
            arr[j][i] = 'X';
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (arr[i][j] != 'X') {
                    arr[i][j] = ' ';
                }
            }
        }
        return arr;
    }}
