
import java.util.logging.Logger;

public class arraySort{
        
    public static void main(String[] params) {
        int[] array = new int[] {15,7,89,9,1678982,12546,8,879,86,54,1};
        System.out.println(arrayToString(array));
        array = mergeSort(array);
        logger.info("Получаем итоговый массив: ");
        System.out.println(arrayToString(array));
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] currentArray = array;
        int[] endArray = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentArray, i, currentArray, i + size, endArray, i, size);
            }

            logger.info("Сравниваем попарно массивы:");
            tmp = currentArray;
            currentArray = endArray;
            endArray = tmp;

            size = size * 2;
            System.out.println(arrayToString(currentArray));
        }
        return currentArray;
    }

    private static void merge(int[] array1, int array1Start, int[] array2, int array2Start, int[] finalArray,
                              int finalArrayStart, int size) {
        int index1 = array1Start;
        int index2 = array2Start;

        int array1End = Math.min(array1Start + size, array1.length);
        int array2End = Math.min(array2Start + size, array2.length);

        if (array1Start + size > array1.length) {
            for (int i = array1Start; i < array1End; i++) {
                finalArray[i] = array1[i];
            }
            return;
        }

        int iterationCount = array1End - array1Start + array2End - array2Start;

        for (int i = finalArrayStart; i < finalArrayStart + iterationCount; i++) {
            if (index1 < array1End && (index2 >= array2End || array1[index1] < array2[index2])) {
                finalArray[i] = array1[index1];
                index1++;
            } else {
                finalArray[i] = array2[index2];
                index2++;
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static final Logger logger = Logger.getLogger("main");
}