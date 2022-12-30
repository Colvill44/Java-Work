/* Lab 11, Part C: Originally created by Celine Latulipe, modified by Bruce Long  */  
public class Lab11PartC {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String tarFilename;
    String srcFilename;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code:
       tarFilename = args[0];      
       System.out.println("Target filename passed in: " + tarFilename);
    } else {
       // ask user for a picture
       System.out.println("Please open a file.");
       tarFilename = FileChooser.pickAFile();
       System.out.println("User picked target file: " + tarFilename);
    }
    Picture target_pic = new Picture(tarFilename);
    // create a world the correct size for the picture
    World w = new World(target_pic.getWidth(), target_pic.getHeight());
    // put the picture in the world
    w.setPicture(target_pic);
    
    // wait a second
    Thread.sleep(1000);
    
    // open a second picture. Make sure it is smaller than the first picture.
    if (args.length > 1) {
      srcFilename = args[1];
      System.out.println("Source filename passed in: " + srcFilename);
    } else {
      System.out.println("Please choose a second picture that is smaller than the first.");
      srcFilename = FileChooser.pickAFile();
      System.out.println("User picked a second file: " + srcFilename);
    }
    Picture newPic = new Picture(srcFilename);

    // add newPic into first picture at 50, 70
    target_pic.addPic(newPic, 50, 70);
    // update display
    w.modelChanged();
  } 
}  