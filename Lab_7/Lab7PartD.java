import java.awt.Color;

public class Lab7PartD 
{   
  public static void main(String [] args) throws InterruptedException // you can ignore this throws InterruptedException thing for now
  {
    // create a world
    World w = new World();
    
    /* Create two turtles, a ghost and a pacman, in the middle of the world */
    Turtle ghost = new Turtle(w.getWidth()/2, w.getHeight()/2, w);
    // make pacman be a little bit to the right so we can see her 
    Turtle pacman = new Turtle(w.getWidth()/2, w.getHeight()/2, w); 
    
    Turtle ed = new Turtle(w.getWidth()/2, w.getHeight()/3, w);
    
    /* make ghost turtle cyan */
    ghost.setColor(Color.cyan);
    ghost.setName("Ghost");
    /* make pacman turtle yellow */
    pacman.setColor(Color.yellow);
    pacman.setName("Pacman");
    
    ed.setColor(Color.blue);
    ed.setName("Ed");

    // This integer variable will determine a travel distance for ghost. 
    int distance = 50;
    
    // This double (decimal) variable is the angle ghost should turn 
    double heading = 35.0;
    
    /* these variables keep track of ghost's last position in the world,
     * pacman will follow ghost by moving to these coordinates*/
    int ghostsLastXPos = ghost.getXPos();
    int ghostsLastYPos = ghost.getYPos();
    
    int pacmansLastXPos = pacman.getXPos();
    int pacmansLastYPos = pacman.getYPos();
    
    // make ghost wonder around randomly
    // this uses a FOR loop which we will talk about later
    // just know that the code inside the FOR loop below is executed 50 times
    for (int i = 0; i< 50; i++) {
      // get a random angle to move the ghost around
      heading = 90* (int)(Math.random()*4.0); // heading will be 0, 90, 180, 270
    
      // move ghost using the above
      ghost.setHeading(heading);
      ghost.forward(distance);   
      
      // check if ghost has accidentally backed up into pacman, if so, reverse and move away
      if ((ghost.getXPos() == pacman.getXPos()) && (ghost.getYPos() == pacman.getYPos())) {
        ghost.turn(180);
        ghost.forward(100);
      }
      
      if ((pacman.getXPos() == ed.getXPos()) && (pacman.getYPos() == ed.getYPos())) {
        pacman.turn(180);
        pacman.forward(100);
      }
      
      // this line just causes Java to wait a little bit, which
      // allows us to see what's happening
      // to understand, just comment it out and see what happens
      // you can also play with the number to make things go slower or faster
      Thread.sleep(500);
      
      // pacman goes to ghost's last position 
      pacman.setHeading(ghost.getHeading());
      pacman.moveTo(ghostsLastXPos, ghostsLastYPos);
      
      ed.setHeading(pacman.getHeading());
      ed.moveTo(pacmansLastXPos, pacmansLastYPos);
      
      // let's record on the console where the two turles are
      System.out.println(ghost);
      System.out.println(pacman);
      System.out.println(ed);
      
      // now save ghost's current position as last position
      ghostsLastXPos = ghost.getXPos();
      ghostsLastYPos = ghost.getYPos();
      pacmansLastXPos = pacman.getXPos();
      pacmansLastYPos = pacman.getYPos();

      // this line just causes Java to wait a little bit, which
      // allows us to see what's happening
      // to understand, just comment it out and see what happens
      // you can also play with the number to make things go slower or faster
      Thread.sleep(500);
      
    } // end for loop
    
  } // end main()
  
  
} // end Lab4PartD class


