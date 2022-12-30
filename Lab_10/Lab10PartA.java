/* Lab 10, Part A: Created by Celine Latulipe, modified by Bruce Long  */  
public class Lab10PartA {   
  public static void main(String [] args)  
  {   
    String filename;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename = args[0];
       System.out.println("Filename passed in: " + filename);
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    
    Picture pic = new Picture(filename);
    
    // now make the picture so that the top-left quadrant is mirrored in 
    // the other three quadrants by calling the quadrefoil() method
    pic.quatrefoil();
    pic.show();

  } 
}  