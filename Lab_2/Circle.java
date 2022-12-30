/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class

    private double radius;
    private String color;
    private double area;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A private method for computing the area of circle
    private double calculateArea() {
        return radius * radius * Math.PI;
    }

    // A public method for retrieving the area of circle
    public double getArea() {
        area = calculateArea();
        return area;
    }
    public static void main(String[] args){
      // Declare an instance of Circle class called c1
      // Construct the intance c1 by invoking the 'default' constructor
      // which sets its raidus and color to their default value
      Circle c1 = new Circle();
      
      // Invoke (call) methods on instance c1, via dot operator
      double radius = c1.getRadius();
      double area = c1.calculateArea();
      
      // Display (print) information on the screen
      System.out.println("The circle has radius of " + radius + " and area of " + area);
      
      // Declare an instance of class circle called c2
      // Construct the instance c2 by invoking the second constructor
      // with the given radius and default color
      Circle c2 = new Circle(2.0);
      
      // Invoke (call) methods on instance c2, via dot operator
      double radius2 = c2.getRadius();
      double area2 = c2.calculateArea();
      
      // Display (print) information on the screen
      System.out.println("The circle has a radius of " + radius2 + " and area of " + area2);
    }

}
