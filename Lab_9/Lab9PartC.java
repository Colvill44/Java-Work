/* Lab 9, Part C: Created by Celine Latulipe. modified by Bruce Long  */  
public class Lab9PartC {   
  public static void main(String [] args) throws InterruptedException  
  {     
    String targetFile;
    String sourceFile;
    
    if (args.length > 0) {
      // got a filename passed into program as a parameter
      // don't change this part of the code: needed by the Autograder.
      targetFile = args[0];      
      System.out.println("Target filename passed in: " + targetFile);
      
    } else {
      // ask user for a picture
      targetFile = FileChooser.pickAFile();
      System.out.println("User picked target file: " + targetFile);
    }
    Picture target = new Picture(targetFile);
    // get a world the correct size for the picture
    World w = new World(target.getWidth(), target.getHeight());
    // put the picture in the world
    w.setPicture(target);
    
    Thread.sleep(500); // pause so you can see the first image appear in the world
    
    // open a second picture. Make sure it is the EXACT same dimensions
    if (args.length > 1) {
      sourceFile = args[1];
      System.out.println("Source filename passed in: " + sourceFile);
    } else {
      sourceFile = FileChooser.pickAFile();
      System.out.println("User picked source file: " + sourceFile);
    }
    
    Picture source = new Picture(sourceFile);
    // call average pixels method
    target.averageWithSource(source);
    // update display
    w.modelChanged();
    
  } 
}