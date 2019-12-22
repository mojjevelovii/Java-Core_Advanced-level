package HW2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {


    public MyArraySizeException(String[][] arr) {
        super(String.format("Массив имеет некорректный размер: %d", arr.length));

    }

    public MyArraySizeException(String[] arr, int x) {
        super(String.format("Массив [%d] имеет некорректный размер: %d", x, arr.length));

    }
}
