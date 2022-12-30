/* Turtle Drawing Program Lab 3, Part C */
/* Started by Celine Latulipe */

public class Lab3PartC {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x,y) (100, 100) */
    Turtle tom = new Turtle(100, 100, w);
    
    /* TODO: Make tom draw three hexagons */
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    
    // pick up pen to stop drawing, move tom to new location (100, 200), put pen back down
    tom.penUp();
    tom.moveTo(100, 200);
    tom.penDown();
    
    // TODO: draw the second hexagon (you can just copy the code from above!)
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    
    // TODO: move turtle to the third location (200, 200) (how do you get the turtle there?)
    tom.penUp();
    tom.moveTo(200, 200);
    tom.penDown();
    
    // TODO: draw the third hexagon (copy again... or type it all out if you want...)
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);
    tom.forward(50);
    tom.turn(60);   

  }
}
