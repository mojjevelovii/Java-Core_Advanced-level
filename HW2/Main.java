package HW2;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый
массив размером 4х4. При подаче массива другого размера необходимо
бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать
в int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения
MySizeArrayException и MyArrayDataException и вывести результат расчета.
*/


public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            handleTwoSizeArray(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void handleTwoSizeArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException(arr);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException(arr[i], i);
                }
                sum = getSum(sum, arr[i], i);
            }
        }
        System.out.println(sum);
    }

    private static int getSum(int sum, String[] array, int masterArray) throws MyArrayDataException {
        for (int i = 0; i < array.length; i++) {
            try {
                sum += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(masterArray, i, array[i]);
            }
        }
        return sum;
    }
}
