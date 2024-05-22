package unit_testing_exam_9;

public class CollectionUtils {
    public static boolean search(java.util.List<Integer> numbers, Integer number) {
        try {

            if (number != null) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == number) {
                        return true;
                    }
                }
            } else {
                throw new RuntimeException();
            }

        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
        return false;
    }
}
