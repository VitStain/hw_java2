package Java2_lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] validArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] wrongSizeArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2"},
                {"1"},
        };
        String[][] wrongDataArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2look", "3", "4"},
                {"1", "2", "3", "4"},
        };

        int calcResult1 = 0;
        int calcResult2 = 0;
        int calcResult3 = 0;

        try {
            calcResult1 = checkArrAndSum(validArr);
        } catch (MyArraySizeException a) {
            a.printStackTrace();
        } catch (MyArrayDataException b) {
            b.printStackTrace();
        } finally {
            printCalcResult(calcResult1);
        }

        try {
            calcResult2 = checkArrAndSum(wrongSizeArr);
        } catch (MyArraySizeException a) {
            a.printStackTrace();
        } catch (MyArrayDataException b) {
            b.printStackTrace();
        } finally {
            printCalcResult(calcResult2);
        }

        try {
            calcResult3 = checkArrAndSum(wrongDataArr);
        } catch (MyArraySizeException a) {
            a.printStackTrace();
        } catch (MyArrayDataException b) {
            b.printStackTrace();
        } finally {
            printCalcResult(calcResult3);
        }

    }

    public static int checkArrAndSum(String[][] array) {
        int xRow = array.length;
        int yPost;
        int parseElement;
        int sumParseElements = 0;


        for (int i = 0; i < array.length; i++) {
            yPost = array[i].length;

            if (xRow != 4 || yPost != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    parseElement = Integer.parseInt(array[i][j]);
                    sumParseElements += parseElement;
                } catch (NumberFormatException e) {
                    String message = "в элементе массива строка:(index[" + (i) + "])" + " столбец:(index[" + (j) + "])";
                    throw new MyArrayDataException(message);

                }
//                return sumParseElements; - возврат суммы элементов массива с пошаговым суммированием.
            }
//           return sumParseElements; возврат суммы элементов массива в каждой строке вместе с прибавлением суммы элементов массива предыдущей строки
        }
        return sumParseElements; /* возврат итоговой суммы всех элементов массива */
    }

    private static void printCalcResult(int calcResult) {
        System.out.println("Результат расчета суммы всех элементов массива: " + calcResult);
    }

}


