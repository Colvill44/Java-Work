/* Test Program to Call the drawHexagon method   */
/* This will only work after you have added the drawHexagon method to Turtle.java
 * as specified in the lab instructions */
/* Created by Celine Latulipe */
public class Lab3PartD {   
  
  public static void main(String [] args)   
  {     
    World w = new World();
    Turtle tom = new Turtle(100, 100, w);
    
    // call the new drawHexagon method many times
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(100, 200);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(100, 300);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(100, 400);
    tom.penDown();
    tom.drawHexagon();
    
    // move back to the top, but over a bit
    tom.penUp();
    tom.moveTo(200, 100);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(200, 200);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(200, 300);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(200, 400);
    tom.penDown();
    tom.drawHexagon();
    
    // move back to the top, but over a bit more
    tom.penUp();
    tom.moveTo(300, 100);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(300, 200);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(300, 300);
    tom.penDown();
    tom.drawHexagon();
    
    tom.penUp();
    tom.moveTo(300, 400);
    tom.penDown();
    tom.drawHexagon();
  }
  
  
}  