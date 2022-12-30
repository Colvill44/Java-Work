/* Lab 11, Part D: Originally created by Celine Latulipe  */  
public class Lab11PartD {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String filename1;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename1 = args[0];      
       System.out.println("Filename passed in: " + filename1);
       
    } else {
       // ask user for a picture
       System.out.println("Please open a file.");
       filename1 = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename1);
    }
    Picture pic = new Picture(filename1);
    // get a world the correct size for the picture
    World w = new World(pic.getWidth(), pic.getHeight());
    // put the picture in the world
    w.setPicture(pic);
    
    // wait a second
    Thread.sleep(1000);
    
    // crop the picture to a 100 by 120 area, at position 30, 50
    pic.crop(30, 50, 100, 120);
    // update display
    w.modelChanged();
  } 
}  