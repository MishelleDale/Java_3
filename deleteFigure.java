import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static java.util.stream.Collectors.*;

public class deleteFigure {
    static List<Integer> get(List<Integer> integers){
        Map<Boolean, List<Integer>> map = integers.stream()
             .collect(partitioningBy(x -> x % 2 != 0, toList()));
        return map.get(map.get(false).size() % 2 == 0);
    }

    public static void main(String[] args) {
        logger.info("Получаем итоговый лист без четных чисел: " + (get(Arrays.asList(1, 6, 3, 2, 5, -5, 3, 0, 11, 4, 7)))); 
    }

    public static final Logger logger = Logger.getLogger("main");
}
