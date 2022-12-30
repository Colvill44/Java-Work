/* Lab 11, Part B: Originally created by Celine Latulipe, modified by Bruce Long  */  
public class Lab11PartB {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String tarFilename;
    String srcFilename;
    
    // open first picture, the target.  This is the one that will be replaced.
    if (args.length > 0) {
      // if a filename was passed into program as a parameter
      tarFilename = args[0];      
      System.out.println("Target filename passed in: " + tarFilename);
    } else {
      // ask user for a picture
      tarFilename = FileChooser.pickAFile();
      System.out.println("User picked target file: " + tarFilename);
    }
    // create a picture object using the target filename
    Picture target_pic = new Picture(tarFilename);
    // create a world the correct size for the picture
    World w = new World(target_pic.getWidth(), target_pic.getHeight());
    // put the picture in the world
    w.setPicture(target_pic);
    
    // pause a second
    Thread.sleep(1000);
    
    // open a second picture. Make sure it is the EXACT same dimensions
    if (args.length > 1) {
      srcFilename = args[1];
      System.out.println("Source filename passed in: " + srcFilename);
    } else {
      srcFilename = FileChooser.pickAFile();
      System.out.println("User picked source file: " + srcFilename);
    }
    Picture source_pic = new Picture(srcFilename);
    
    // copy source picture into target picture
    target_pic.simpleCopyFromSource(source_pic);
    // update display, should show source picture instead of target picture
    w.modelChanged();
  } 
}  