import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int tmp = 0;
        int head = 0;
        int tail = k - 1;
        int length = s.length();
        if(head == tail){
            for(int i = head; i < length; i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') return 1;
            }
        }
        else{
            for(int i = head; i <= tail; i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')tmp++;
            }
            ans = tmp;
            head++;
            tail++;
            while(tail != length){
                if(s.charAt(head - 1) == 'a' || s.charAt(head - 1) == 'e' || s.charAt(head - 1) == 'i' || s.charAt(head - 1) == 'o' || s.charAt(head - 1) == 'u') tmp--;
                if(s.charAt(tail) == 'a' || s.charAt(tail) == 'e' || s.charAt(tail) == 'i' || s.charAt(tail) == 'o' || s.charAt(tail) == 'u') tmp++;
                ans = Math.max(ans,tmp);
                head++;
                tail++;
            }
        }

        return ans;
    }
}
//my code

//class Solution {
//    public int maxVowels(String s, int k) {
//        int n = s.length();
//        int vowel_count = 0;
//        for (int i = 0; i < k; ++i) {
//            vowel_count += isVowel(s.charAt(i));
//        }
//        int ans = vowel_count;
//        for (int i = k; i < n; ++i) {
//            vowel_count += isVowel(s.charAt(i)) - isVowel(s.charAt(i - k));
//            ans = Math.max(ans, vowel_count);
//        }
//        return ans;
//    }
//
//    public int isVowel(char ch) {
//        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
//    }
//}

//leetcode better faster clearer
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/solutions/518995/ding-chang-zi-chuan-zhong-yuan-yin-de-zu-4ka7/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。