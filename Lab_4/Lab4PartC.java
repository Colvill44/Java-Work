/* Turtle Drawing Program Lab 4, Part C */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab4PartC {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Set pen color to red.  */
    tom.setPenColor(Color.red);
    
    /* Draw a hexagon of length 80 */
    drawHex(tom, 80);
    
    // pen up and make tom write in blue
    tom.penUp();
    tom.setPenColor(Color.blue);
    
    // move tom to 300, 150 and pen down
    tom.moveTo(300, 150);
    tom.penDown();
    
    // tom draw hexagon with 25 pixel length
    drawHex(tom, 25);

  }
// define a method to draw a hexagon of variable line lengths
    public static void drawHex(Turtle fred, int length)
    {
    /* Make tom draw a hexagon */
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(60);
    fred.forward(length);
    fred.turn(30);
    }

}