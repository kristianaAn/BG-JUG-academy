import data_structures_exam_14.Multiset;
import data_structures_exam_14.MultisetUtils;

public class Main {
    public static void main(String[] args) {

    }

    //Task 8
    public static int[] findSum(int[] numbers, int n) {
        int[] resultArr = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    resultArr[0] = numbers[i];
                    resultArr[1] = numbers[j];
                    break;
                }
            }
        }
        if (resultArr[0] == 0 && resultArr[1] == 0) {
            return new int[0];
        } else {
            return resultArr;
        }
    }

    //Task 7
    public static java.util.List<Integer> removeNegatives(java.util.List<Integer> numbers) {
        return numbers.stream().filter(num -> num >= 0).toList();
    }

    //Task 6
    public static <T extends Comparable<T>> T findMax(T... elements) {
        int maxElIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].compareTo(elements[maxElIndex]) > 0) {
                maxElIndex = i;
            }
        }
        return elements[maxElIndex];
    }

    //Task 5
    public static void isEven(int number){
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        }

        System.out.println(result);
    }

    //Task 4
    public static void isPower(int number){
        boolean isPower = false;
        for (int i = number; i >= 0; i-=2) {
            if (i == 0 || number == 1) {
                isPower = true;
            }
        }
        System.out.println(isPower);
    }

    //Task 3
    public static void isPalindrome(String text){
        boolean isPalindrome = false;
        String trimmed = text.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(trimmed);
        String forwards = sb.toString();
        String reverse = sb.reverse().toString();

        if (forwards.equals(reverse)) {
            isPalindrome = true;
        }

        System.out.println(isPalindrome);
    }

    //Task 2
    public static void isAnagram(String first, String second) {
        boolean isAnagram = false;
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        java.util.Arrays.sort(firstCharArray);
        java.util.Arrays.sort(secondCharArray);

        if (java.util.Arrays.equals(firstCharArray, secondCharArray)) {
            isAnagram = true;
        }

        System.out.println(isAnagram);
    }

    //Task 1
    public static void binary (int n) {
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);
    }

}
