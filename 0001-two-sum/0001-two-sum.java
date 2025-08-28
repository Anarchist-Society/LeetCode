class Solution {
    public int[] twoSum(int[] nums, int target) {
                Map<Integer, Integer> map = new HashMap<>();
        // En el primer bucle lo que hacemos es guardar los valores y los indices en el HashMap
        // Key: nums[i] i -> índice del array
        // Value: i -> índice del array
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // En el segundo bucle comprobamos si está en el HashMap el segundo sumando (target - nums[i]) de cada elemento del array nums
        for (int i = 0; i < nums.length; i++) {
            int objetivo = target - nums[i];
            // Comprobamos si está el segundo sumando (map.containsKey(objetivo)) y si ese sumando no es el mismo que el primer sumando (map.get(objetivo))
            // Si cumple las condiciones devolvemos un nuevo array con el primer sumando y el segundo sumando
            if (map.containsKey(objetivo) && map.get(objetivo) != i) {
                return new int[] {i, map.get(objetivo)};
            }
        }

        // Si no se encuentra un par válido devuelve una matriz vacía en lugar de NULL.
        return new int[] {};

    }
}