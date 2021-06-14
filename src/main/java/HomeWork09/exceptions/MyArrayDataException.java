package HomeWork09.exceptions;

public class MyArrayDataException extends Exception {
    public int i;
    public int k;
    public MyArrayDataException(int i, int k) {
        super("Ошибка! В строке:" + i + " колонке:" + k + " лежит неконвертируемое значение");
        this.i = i;
        this.k = k;
    }
}
