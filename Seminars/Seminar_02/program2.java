package Seminars.Seminar_02;

public class program2 {
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "белхлеб";
        System.out.println(isPalindrome(str));
    }
    
}
