/* Lab 5, Part D */
/* Testing program for class methods */
/* by Celine Latulipe */

public class Lab5PartD {
  public static void main(String [] args) 
  {
    // create string variables to hold help info
    String s, g, d;
    
    // call class methods on class directly
    s = Turtle.helpSetters();
    g = Turtle.helpGetters();
    d = Turtle.helpDrawing();
    
    // print out each of the three individual help strings
    System.out.println(s);
    System.out.println(g);
    System.out.println(d);
    
    // print all three strings again by calling class method help()
    Turtle.help();
    
  }
}