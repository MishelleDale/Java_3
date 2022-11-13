import java.util.*;
import java.util.logging.Logger;

public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(12);
            list.add(22);
            list.add(11);
            list.add(-111);
            list.add(34);
            list.add(76);
        
        double sumOfElements = 0;
        for (int i = 0; i < list.size(); i++) {
            int temporalFigure = list.get(i);
            sumOfElements = sumOfElements + temporalFigure;
            logger.info("Складываем все элементы списка: " + sumOfElements);
            }
        
        logger.info("Выводим среднее значение списка");
        System.out.println("Среднее значение равно: " + sumOfElements/list.size());     
        logger.info("Выводим максимальное значение списка");
        System.out.println("Максимальное значение равно: " + Collections.max(list));
        logger.info("Выводим минимальное значение списка");
        System.out.println("Минимальное значение равно: " + Collections.min(list));
    }
    public static final Logger logger = Logger.getLogger("main");
}
