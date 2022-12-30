/* Turtle Drawing Program Lab 4, Part B */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab4PartB {
//  public static void main(String [] args)
  public Lab4PartB()
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Make tom draw a hexagon */
    tom.turn(30);
    tom.forward(60);
    tom.turn(60);
    tom.forward(60);
    tom.turn(60);
    tom.forward(60);
    tom.turn(60);
    tom.forward(60);
    tom.turn(60);
    tom.forward(60);
    tom.turn(60);
    tom.forward(60);
    tom.turn(30);

  }
}