import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
 
  public static void main(String[] args) 
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }
  public void decreaseBlue(double percent){
    if (percent <= 0.0){
      System.out.println("Error! Parameter less than or equal to zero.");
      return;
    }
    if (percent >= 1.0){
      System.out.println("Error! Parameter greater than 1");
      return;
    }
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel;
    int value = 0;
    int index = 0;
    while (index < pixelArray.length){
      pixel = pixelArray[index];
      value = pixel.getBlue();
      value = (int)(value*percent);
      pixel.setBlue(value);
      index++;
    }
        
  }
  
  public void modifyGreen(double percent, double portion){
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel;
    int value = 0;
    int index = 0;
    if (percent <= 0.0){
      System.out.println("Percent Amount change less than 0, Error.");
      return;
    }
    if (percent > 2.0){
      System.out.println("Percent Amount change larger that 2.0, Error.");
      return;
    }
    if (portion <= 0){
      System.out.println("Portion zero or less, Error.");
      return;
    }
    if (portion > 1){
      System.out.println("Portion larger than 1, Error");
      return;
    }
    while (index < (int)(pixelArray.length*portion)){
      pixel = pixelArray[index];
      value = pixel.getGreen();
      value = value - (int)(value * percent);
      pixel.setGreen(value);
      index++;
    }
  }
  
  public void modifyRed(double percent, double start, double end){
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel;
    int value = 0;
    if (percent <= 0.0){
      System.out.println("Percent Amount change less than 0, Error.");
      return;
    }
    if (percent > 2.0){
      System.out.println("Percent Amount change larger that 2.0, Error.");
      return;
    }
    if (start < 0){
      System.out.println("Start less than zero, Error.");
      return;
    }
    if (end > 1){
      System.out.println("Portion larger than 1, Error");
      return;
    }
    int startIndex = (int)(pixelArray.length * start);
    int endIndex = (int)(pixelArray.length * end);
    while (startIndex < endIndex) {
      pixel = pixelArray[startIndex];
      value = pixel.getRed();
      value = value - (int)(value * percent);
      pixel.setRed(value);
      startIndex++;
    }
  }
  
   /**
   * Method to decrease the red by half in the
   * current picture
   */
  public void decreaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int index = 0;
    
    // loop through all the pixels
    while(index < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[index];
      
      // get the value
      value = pixel.getRed();
      
      // decrease the red value by 50% (1/2)
      value = (int) (value * 0.5);
      
      // set the red value of the current pixel to the new value
      pixel.setRed(value);
      
      //increment the index
      index = index + 1;
    }
  }
  /**
   * Method to increase the amount of red by 30%
   */
  public void increaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel =  null;
    int value = 0;
    int index = 0;
    
    // loop through all the pixels
    while (index < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[index];
      
      // get the value
      value = pixel.getRed();
      
      // change the value to 1.3 times what it was
      value = (int) (value * 1.3);
      
      // set the red value to 1.3 times what it was
      pixel.setRed(value);
      
      // increment the index
      index++;
    }
  }
  /**
   * Method to clear the blue form the picture (set
   * the blue to 0 for all pixels)
   */
  public void clearBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int index = 0;
    
    // loop through all the pixels
    while (index < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[index];
      
      // set the blue on the pixel to 0
      pixel.setBlue(0);
      
      //increment index
      index++;
    }
  }
  
   /**
   * Method to decrease the green in the picture by 30%
   */
  public void decreaseGreen()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    // loop through all the pixels in the array
    while (i < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[i];
      
      // get the value
      value = pixel.getGreen();
      
      // set the green value to 70% of what it was
      pixel.setGreen((int) (value * 0.7));
      
      // increment the index
      i++;
    }
  }
  /**
   * Method to decrease the green in the picture by 30%
   */
  public void decreaseBlue()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    // loop through all the pixels in the array
    while (i < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[i];
      
      // get the value
      value = pixel.getBlue();
      
      // set the blue value to 70% of what it was
      pixel.setBlue((int) (value * 0.7));
      
    }
  }
  
  /**
   * Method to make a picture look like it was taken at sunset 
   * by reducing the blue and green to make it look more red
   */
  public void makeSunset2()
  {
    decreaseGreen();
    decreaseBlue();
  }
  
  /**
   * Method to change the color of each pixel in the picture
   * object by passed in amounts.
   * @param redAmount the aomunt to change the red value
   * @param greenAmount the amount to change the green value
   * @param blueAmount the amount to change the blue value
   */
  public void changeColors(double redAmount,
                           double greenAmount,
                           double blueAmount)
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int value = 0;
    int i = 0;
    
    // loop through all the pixels
    while( i < pixelArray.length)
    {
      // get the current pixel
      pixel = pixelArray[i];
      
      // change the red value
      value = pixel.getRed();
      pixel.setRed((int) (redAmount * value));
      
      // change the green value
      value = pixel.getGreen();
      pixel.setGreen((int) (greenAmount * value));
      
      // change the blue value
      value = pixel.getBlue();
      pixel.setBlue((int) (blueAmount * value));
      
      // increment i
      i++;
    }
  }
  
  /**
   * Method to lighten the colors in the picture
   */
  public void lighten()
  {
    Pixel[] pixelArray = this.getPixels();
    Color color = null;
    Pixel pixel = null;
    
    // loop through all the pixels
    for (int i = 0; i < pixelArray.length; i++)
    {
      // get the current pixel
      pixel = pixelArray[i];
      
      // get the current color
      color = pixel.getColor();
      
      // get a lighter color
      color = color.brighter();
      
      // set the pixel color to the lighter color
      pixel.setColor(color);
    }
  }
  
  /**
   * Method to negate the picture
   */
  public void negate()
  {
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    int redValue, blueValue, greenValue = 0;
    
    // loop through all the pixels
    for (int i = 0; i < pixelArray.length; i++)
    {
      // get the current pixel
      pixel = pixelArray[i];
      
      // get the current red, green, and blue values
      redValue = pixel.getRed();
      greenValue = pixel.getGreen();
      blueValue = pixel.getBlue();
      
      // set the pixel's color to the new color
      pixel.setColor(new Color(255 - redValue,
                               255 - greenValue,
                               255 - blueValue));
    }
  }
  
  public void fade(){
    Pixel[] pixelArray = this.getPixels();
    Pixel pixel = null;
    for (int i = 0; i < pixelArray.length; i++){
      pixel = pixelArray[i];
      pixel.setRed((int)(pixel.getRed()*0.6));
      pixel.setGreen((int)(pixel.getGreen()*0.6));
      pixel.setBlue((int)(pixel.getBlue()*0.6));
    }
  }
  
  public void copyPixelsFromSource(Picture source){
    if (this.getWidth() != source.getWidth() || this.getHeight() != source.getHeight()){
      System.out.println("Error! Source image size varies from image.");
      return;
    }
    Pixel[] targetArray = this.getPixels();
    Pixel[] sourceArray = source.getPixels();
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    Pixel pixel = null;
    Pixel pixel2 = null;
    for (int i = 0; i < sourceArray.length; i++){
      pixel = sourceArray[i];
      redValue = pixel.getRed();
      greenValue = pixel.getGreen();
      blueValue = pixel.getBlue();
      
      pixel2 = targetArray[i];
      int redValue2 = pixel2.getRed();
      int greenValue2 = pixel2.getGreen();
      int blueValue2 = pixel2.getBlue();
      
    }
  }
  
  public void averageWithSource(Picture source){
    if (this.getWidth() != source.getWidth() || this.getHeight() != source.getHeight()){
      System.out.println("Error! Source image size varies from image.");
      return;
    }
    Pixel[] targetArray = this.getPixels();
    Pixel[] sourceArray = source.getPixels();
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    for (int i = 0; i < sourceArray.length; i++){
      redValue = ((sourceArray[i].getRed() + targetArray[i].getRed())/2);
      greenValue = ((sourceArray[i].getGreen() + targetArray[i].getGreen())/2);
      blueValue = ((sourceArray[i].getBlue() + targetArray[i].getBlue())/2);
      targetArray[i].setRed((int)redValue);
      targetArray[i].setGreen((int)greenValue);
      targetArray[i].setBlue((int)blueValue);
    }
  }
  
  /**
   * Method to lighten the colors in the picture
   */
  public void lighten2()
  { 
    Color color = null;
    Pixel pixel = null;
    
    // loop through the columns (x direction)
    for (int x = 0; x < getWidth(); x++)
    {
      // loop through the rows (y direction)
      for (int y = 0; y < getHeight(); y++)
      {
        // get pixel at the x and y location
        pixel = getPixel(x,y);
        
        // get the current color
        color = pixel.getColor();
        
        // get the lighter color
        color = color.brighter();
        
        // set the pixel color to the lighter color
        pixel.setColor(color);
      }
    }
  }
  
  /**
   * Method to mirror around a vertical line in the middle
   * of the picture based on the width
   */
  public void mirrorVertical()
  {
    int width = this.getWidth();
    int mirrorPoint = width / 2;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    // loop through all the rows
    for (int y = 0; y < getHeight(); y++)
    {
      // loop from 0 to the middle (mirror point)
      for (int x = 0; x < mirrorPoint; x++)
      {
        leftPixel = getPixel(x, y);
        rightPixel = getPixel(width - 1 - x, y);
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /**
   * Method to mirror around a horizontal line in the middle
   * based on the height. It copies the top mirrored to 
   * the bottom
   */
  public void mirrorHorizontal()
  {
    int height = this.getHeight();
    int mirrorPoint = height / 2;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    // loop through the columns
    for (int x=0; x < getWidth(); x++)
    {
      // loop from 0 to just before the mirror point
      for (int y=0; y < mirrorPoint; y++)
      {
        topPixel = getPixel(x,y);
        bottomPixel = getPixel(x,height - 1 - y);
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  /**
   * Method to mirror part of the temple picture around a
   * vertical line at a mirror point
   */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    // loop through the rows
    for (int y = 27; y < 97; y++)
    {
      // loop from 13 to just before the mirror point
      for (int x = 13; x < mirrorPoint; x++)
      {
        leftPixel = getPixel(x, y);
        rightPixel = getPixel(mirrorPoint + (mirrorPoint - x), y);
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void quatrefoil(){
    this.mirrorVertical();
    this.mirrorHorizontal();
  }
  
  public void verticalShutters(){
    Pixel pixel = null;
    for (int x = 0; x < this.getWidth(); x++){
      if ((x/10)%2 == 0){
        for(int y = 0; y < this.getHeight(); y++){
          pixel = getPixel(x,y);
          pixel.setColor(Color.black);
        }
      }
    }
  }
  
  public void horizontalShutters(){
    Pixel pixel = null;
    for (int x = 0; x < this.getHeight(); x++){
      if ((x/10)%2 == 0){
        for(int y = 0; y < this.getWidth(); y++){
          pixel = getPixel(y,x);
          pixel.setColor(Color.black);
        }
      }
      else{
        for(int y = 0; y < this.getWidth(); y++){
          pixel = getPixel(y,x);
          pixel.setColor(pixel.getColor().brighter());
        }
      }
    }
      
  }
    
  
} // this } is the end of class Picture, put all new methods before this
 