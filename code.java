class Solution {
    public String intToRoman(int num) {
     if(num < 0 && num > 3999) return "";
        
        StringBuilder result = new StringBuilder();
        
        int[] value = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = new String[] {"I", "IV", "V", "IX", "X",
                                       "XL", "L", "XC", "C", "CD",
                                       "D", "CM", "M"};
        
        for(int i = value.length - 1; i >= 0; i--) {
            if(num == 0) break;
            while(num >= value[i]){
                num -= value[i];
                result.append(roman[i]);
            }
        }
        
        return result.toString();
        
        
        
        
    }
}
