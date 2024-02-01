public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));    
        System.out.println(sameStarChar("xy*zzz"));    
        System.out.println(sameStarChar("*xa*az"));  
        System.out.println(sameStarChar("*12*2*2"));
        System.out.println(sameStarChar("12*2*3*")); 
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
