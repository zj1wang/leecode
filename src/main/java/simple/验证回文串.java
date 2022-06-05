package simple;
/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。
* */
//双指针
//前，后，相遇终止
public class 验证回文串 {

    public boolean isPalindrome(String s) {
        int front =0;
        int end = s.length()-1;
        while (front<end){
            char frontChar = s.charAt(front);
            char endChar = s.charAt(end);
            if (!Character.isLetterOrDigit(frontChar)){
                front++;
            }else if (!Character.isLetterOrDigit(endChar)){
                end--;
            }else if(Character.toLowerCase(frontChar)!=Character.toLowerCase(endChar)){
                return false;
            }else {
                front++;
                end--;
            }



        }
        return true;

    }
}
