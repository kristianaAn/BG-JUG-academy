package data_structures_exam_14;

import java.util.*;
import java.util.stream.Collectors;

public class MultisetUtils{
    public MultisetUtils() {
    }

    public static int min(Multiset<Integer> mset) {
        int min = 1000000000;
        for (Map.Entry<Integer, Integer> integerEntry : mset.getMultiset().entrySet()) {
            if (integerEntry.getKey() < min) {
                min = integerEntry.getKey();
            }
        }
        return min;
    }

    public static int minWeighted(Multiset<Integer> mset) {
        List<Integer> weightedNums = getWeightedNums(mset);

        return Collections.min(weightedNums);
    }

    private static List<Integer> getWeightedNums(Multiset<Integer> mset) {
        List<Integer> weightedNums = new ArrayList<>();

        mset.getMultiset().forEach((key, value) -> weightedNums.add(key * value));

        return weightedNums;
    }

    public static int sum(Multiset<Integer> mset) {
        Set<Map.Entry<Integer, Integer>> entries = mset.getMultiset().entrySet();
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : entries) {
            sum += entry.getKey();
        }

        return sum;
    }

    public static int sumWeighted(Multiset<Integer> mset) {
        int weightedSum = 0;

        for (Integer weightedNum : getWeightedNums(mset)) {
            weightedSum += weightedNum;
        }

        return weightedSum;
    }

    public static java.util.List<Integer> toList(Multiset<Integer> mset) {
        List<Integer> resultList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mset.getMultiset().entrySet()) {
            for (int i = 1; i <= entry.getValue(); i++) {
                resultList.add(entry.getKey());
            }
        }

        return resultList.stream().sorted().collect(Collectors.toList());

    }
}
