/* Lab 1: Created by Beth Simon  * Date: Sept 29, 2008  */  
public class Lab1 {   
  public static void main(String [] args)   
  {     
    World w = new World();     
    Turtle jose = new Turtle(100,50,w); //Creates a turtle in w at (x,y) (100,50)          
    //Make a U shape   
    Turtle.forward(55);     
    Turtle.turn(90);     
    Turtle.forward(30);    
    Turtle.turn(90);    
    Turtle.forward(55);        
  }
}  