/* Turtle Drawing Program Lab 3, Part A */
/* Started by Celine Latulipe */
 
public class Lab3PartA {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x,y) (100, 200) */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Make tom draw a word */
    
    // first letter
    tom.forward(80);
    tom.penUp();
    tom.turn(225);
    tom.forward(40);
    tom.penDown();
    tom.turn(225);
    tom.forward(60);
    
    // move over
    tom.penUp();
    tom.forward(30);
    
    // second letter
    tom.penDown();
    for (int i= 0; i < 12; i++) {
      tom.turn(30);
      tom.forward(15);
    }
    
    // move over
    tom.penUp();
    tom.forward(40);
    
    // third letter
    tom.penDown();
    tom.turn(90);
    tom.forward(55);
    tom.turn(180);
    tom.forward(50);
    tom.turn(90);
    tom.forward(20);
    tom.turn(90);
    tom.forward(50);
    tom.turn(180);
    tom.forward(50);
    tom.turn(90);
    tom.forward(20);
    tom.turn(90);
    tom.forward(50);
    tom.turn(180);
    tom.forward(50);
    
    // move over
    tom.penUp();
    tom.turn(90);
    tom.forward(30);
    tom.turn(90);
    tom.forward(55);
    tom.turn(270);
    
    
    /* TODO: print out the word tom the turtle draws on screen */
    System.out.println("tom");
  }
}