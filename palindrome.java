
public class palindrome{
  
  public int isPalindromic(char[] text, int startIndex, int endIndex){
    int pali = 0;
    if (text == null){
      pali = -1;
      return pali;
    }
    if (startIndex < 0){
      pali = -2;
      return pali;
    }
    if (endIndex > text.length){
      pali = -3;
      return pali;
    }
    int j = endIndex;
    for (int i = startIndex; i < text.length / 2; i++, j--){
      char oneUpper = Character.toUpperCase(text[i]);
      char twoUpper = Character.toUpperCase(text[j]);
      if (oneUpper == twoUpper){
        pali = 1;
        return pali;
      }
      else{
        pali = 0;
        return pali;
    }
  }
}