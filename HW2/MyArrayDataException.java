package HW2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int x, int y, String c) {
        super(String.format("В массиве [%d][%d] вместо числа лежит символ %s.", x, y, c));
    }
}
