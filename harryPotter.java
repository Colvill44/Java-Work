public class harryPotter{
  public static void main(String[] args){
    String[] wizards = new String[]{"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"};
    System.out.println("Before reverse:");
    for (int i = 0; i < wizards.length; i++){
      System.out.println(wizards[i]);
      reverse(wizards);
    }
    System.out.println("After reverse:");
    for (int i = 0; i < wizards.length; i++){
      System.out.println(wizards[i]);
    }
  }
  
  public static String[] reverse(String[] wizards){
    int j = wizards.length - 1;
    for (int i = 0; i < wizards.length / 2; i++, j--){
      String name = wizards[i];
      wizards[i] = wizards[j];
      wizards[j] = name;
    }
    return wizards;
  }

}
  
    