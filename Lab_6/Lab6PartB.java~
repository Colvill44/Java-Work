import java.awt.Color;
public class Lab6PartB
{
  public static void main(String [] args)
  {
    Picture pic = new Picture(FileChooser.pickAFile());
    Turtle tom = new Turtle(pic);
    tom.penUp();
    tom.moveTo(300, 50);
    tom.turn(90);
    tom.penDown();
    tom.setPenColor(Color.white);
    tom.setPenWidth(5);
    int turns = 1;
    while (turns <= 4){
      tom.forward(100);
      tom.turn(90);
      turns ++;
    }
    tom.hide();
    pic.show();
    

  }
}