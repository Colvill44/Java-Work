/* Turtle Drawing Program Lab 6, Part C */
/* Started by Celine Latulipe */

import java.util.Scanner;                       // Include this line to import the Scanner utility

public class Lab6PartC
{
  public static void main(String [] args) 
  {
    // Part 1
    Scanner keyboard = new Scanner(System.in);  // Include these two
    int x = keyboard.nextInt();                 // lines for integers
    World w = new World();
    Turtle tom = new Turtle(100, 200, w);
    tom.drawHexagon(x);
  }
  public static void drawHexagon(){
  }
}