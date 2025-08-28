class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int objetivo = target - nums[i]; // Almacenamos en una variable el segundo sumando que buscamos
            if (map.containsKey(objetivo)) {
                return new int[] {map.get(objetivo), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}