class Solution {
    public int romanToInt(String s) {
        int resultado = 0;
        int numero = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    numero = 1;
                    break;
                case 'V':
                    numero = 5;
                    break;
                case 'X':
                    numero = 10;
                    break;
                case 'L':
                    numero = 50;
                    break;
                case 'C':
                    numero = 100;
                    break;
                case 'D':
                    numero = 500;
                    break;
                case 'M':
                    numero = 1000;
                    break;
                default:
                    break;
            }

            if (4 * numero < resultado) {
                resultado -= numero; 
            } else {
                resultado += numero;
            }
        }

        return resultado;
    }
}