class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int numero = 0;
        for (int i = 0; i < s.length(); i++) {
            int actual = map.get(s.charAt(i));

            int siguiente = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (actual < siguiente) {
                numero -= actual;
            } else {
                numero += actual;
            }
        }
        return numero;

    }
}