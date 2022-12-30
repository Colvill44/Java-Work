/* Juan makes a hexagon
 * Created by Will Colvill */

// import color
import java.awt.Color;

// define class
public class Lab4PartA{
  
  // create main method for making a hexagon
  public static void main(String[] args){
    
    // create world and juan in world
    World w = new World();
    Turtle juan = new Turtle(100, 200, w);
    
    // make juan draw a hexagon in world
    juan.turn(30);
    juan.forward(60);
    juan.turn(60);
    juan.forward(60);
    juan.turn(60);
    juan.forward(60);
    juan.turn(60);
    juan.forward(60);
    juan.turn(60);
    juan.forward(60);
    juan.turn(60);
    juan.forward(60);
    juan.turn(30);
  }
}