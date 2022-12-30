public class Shapes{ // save file as Shapes.java
  
  public static void main(String[] args){
    // Declare an instance of Circle class called c1
    // Construct the instance c1 by invoking the "default" constructor
    // which sets its radius and color to their default value
    Circle c1 = new Circle();
    
    // Invoke (call) methods on instance c1, via dot operator
    double radius = c1.getRadius();
    double area = c1.getArea();
    
    // Display (print) information on the screen
    System.out.println("The circle has a radius of "
                        + radius + " and area of " + area);
    
    // Declare an instance of class circle called c2
    // Construct the instance c2 by invoking the second constructor
    // with the given radius and default color
    Circle c2 = new Circle(2.0);
    
    // Invoke (call) methods on intance c1, via dot operator
    double radius2 = c2.getRadius();
    double area2 = c2.getArea();
    
    // Invoke public methods on instance c2, via dot operator
    // Display (print) information on the screen
    System.out.println("The circle has a radius of " + radius2 + " and area of " + area2);
  }
}
