import java.util.*;


public class Combinationsumm {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;

    }

    private static void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }

        current.add(arr[index]);
        backtrack(arr, target - arr[index], index, current, result);
        current.remove(current.size() - 1);

        backtrack(arr, target, index + 1, current, result);

    }
}