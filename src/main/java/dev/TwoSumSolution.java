package dev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    // Method principal com complexidade O(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Verifica se o número atual é o complemento de algum já armazenado
            if (complementMap.containsKey(num)) {
                return new int[] { complementMap.get(num), i };
            }
            // Armazena o complemento necessário e o índice atual
            complementMap.put(target - num, i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    // Method main para testar os casos de exemplo
    public static void main(String[] args) {
        // Caso de Teste 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Teste 1: " + Arrays.toString(twoSum(nums1, target1))); // [0, 1]

        // Caso de Teste 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Teste 2: " + Arrays.toString(twoSum(nums2, target2))); // [1, 2]

        // Caso de Teste 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Teste 3: " + Arrays.toString(twoSum(nums3, target3))); // [0, 1]
    }
}
