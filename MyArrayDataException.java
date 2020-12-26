package Java2_lesson2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String message) {
        super("Ошибка данных. Преобразование не удалось осуществить " + message);
    }
}
