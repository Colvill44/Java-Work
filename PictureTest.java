import java.awt.*;
public class PictureTest{
  public static void main(String [] args){
    Picture pic = new Picture(FileChooser.pickAFile());
    pic.explore();
    pic.blurArea(35, 13, 81, 91, 7);
    pic.repaint();
  }
}