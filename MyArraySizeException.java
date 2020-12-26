package Java2_lesson2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("В метод можно подать только двумерный строковый массив с размерами 4х4 !\nПодача массива с другими размерами не предусмотрена !");
    }

}
