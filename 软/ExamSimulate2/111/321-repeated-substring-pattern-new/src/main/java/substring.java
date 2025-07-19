public class substring {

  public boolean repeatedSubstringPattern(String s) {
    int len = s.length();
    if (len == 1) return false;
    int[] subs = new int[len / 2 + 1];
    for (int i = 1; i <= len / 2; i++) {
      if(len % i == 0) {
        subs[i] = i;
      }
    }
    for (int i = 1; i <= len / 2; i++) {
      if(subs[i] == 0) {
        continue;
      }
      String substring =s.substring(0, i);
      StringBuilder answer = new StringBuilder();
      for (int j = 1; j <= len / i; j++) {
        answer.append(substring);
      }
      if (answer.toString().equals(s)) {
        return true;
      }
    }
    return false;
  }
}