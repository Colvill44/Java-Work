/* Turtle Drawing Program Lab 4, Part D */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab4PartD {
  public static void main(String [] args) 
  {
    /* Create a world named w */
    World w = new World();
    
    /* Create a turtle, call him tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Set tom's pen color to red.  */
    tom.setPenColor(Color.red);
    
    /* Draw a hexagon using multiple parameters */
    tom.setPenColor(Color.blue);
    drawHexP(tom, 200, 300, 90, 5, 60);
    
    
  }

// define a method to draw a hexagon of variable line lengths
    public static void drawHexP(Turtle tom, int x, int y, double heading, int width, int length)
    {
    /* Make tom draw a hexagon */
      tom.penUp();
      tom.moveTo(x, y);
      tom.penDown();
      tom.setHeading(heading);
      tom.setPenWidth(width);
      tom.forward(length);
      tom.turn(60);
      tom.forward(length);
      tom.turn(60);
      tom.forward(length);
      tom.turn(60);
      tom.forward(length);
      tom.turn(60);
      tom.forward(length);
      tom.turn(60);
      tom.forward(length);
      tom.turn(30);
      tom.hide();
    }

}