/* Lab 12, Part A: Originally created by Celine Latulipe  */  
public class Lab12PartA {   
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
    pic.show();

    // blur area 1 of picture
    pic.blackOut(110, 138, 182, 169);
    // blur area 2 of picture
    pic.blackOut(100, 100, 190, 130);
    // update display
    pic.repaint();
  } 
}  