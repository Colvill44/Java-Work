/* Lab 9, Part B: Created by Celine Latulipe, modified by Bruce Long  */  
public class Lab9PartB {   
  public static void main(String [] args) throws InterruptedException  
  {     
    String targetFile;
    String sourceFile;
    
    if (args.length > 0) {
      // got a filename passed into program as a parameter
      targetFile = args[0];      
      System.out.println("Target filename passed in: " + targetFile);
      
    } else {
      // ask user for a picture
      targetFile = FileChooser.pickAFile();
      System.out.println("User picked target file: " + targetFile);
    }
    
    Picture target = new Picture(targetFile);
    // create a world the correct size for the picture
    World w = new World(target.getWidth(), target.getHeight());
    // put the target picture in the world
    w.setPicture(target);
    
    Thread.sleep(500); // pause so you can see the first image appear in the world
    
    // open a second (source) picture. Make sure it is the EXACT same dimensions
    if (args.length > 1) {
      sourceFile = args[1];
      System.out.println("Source filename passed in: " + sourceFile);
    } else {
      sourceFile = FileChooser.pickAFile();
      System.out.println("User picked source file: " + sourceFile);
    }
    
    Picture source = new Picture(sourceFile);
    // call copy method to copy pixels from source into target
    target.copyPixelsFromSource(source);
    // update the world so we see the change
    w.modelChanged();
    
  } 
}  