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
  
  /**
   * Method to copy the picture of Katie to the 
   * upper left corner of the current picture
   */
  public void copyKatie()
  {
    String sourceFile = 
      FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

    // loop through the columns
    for (int sourceX = 0, targetX=0;
         sourceX < sourcePicture.getWidth();
         sourceX++, targetX++)
    {
      // loop through the rows 
      for (int sourceY = 0, targetY =0;
           sourceY < sourcePicture.getHeight();
           sourceY++, targetY++)
      {
        // set the target pixel color to the source pixel color
        sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }

  /**
   * Method to copy the picture of Katie (100,100) in the
   * current picture
   */
  public void copyKatiesFace()
  {
    String sourceFile =
      FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

    // loop through the columns
    for (int sourceX = 70, targetX = 100;
         sourceX < 135; sourceX++, targetX++)
    {
      // loop through the rows 
      for (int sourceY = 3, targetY = 100;
           sourceY < 80; sourceY++, targetY++)
      {
        // set the target pixel color to the source pixel color
        sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  } 

  /**
   * Method that will copy all of the passed source picture into
   * the current picture object starting with the left corner 
   * given by xStart. It will put the sourcePicture at 5 pixels
   * from the bottom of this picture
   * @param sourcePicture the picture object to copy
   * @param xStart the x position to start the copy in the target
   */
  public void copyPictureTo(Picture sourcePicture, int xStart)
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

    // loop through the columns
    for (int sourceX = 0, targetX = xStart;
         sourceX < sourcePicture.getWidth();
         sourceX++, targetX++)
    {
      // loop through the rows 
      for (int sourceY = 0, 
           targetY = this.getHeight() -
                     sourcePicture.getHeight() - 5;
           sourceY < sourcePicture.getHeight();
           sourceY++, targetY++)
      {
        sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }

  }

  /**
   * Method to copy two flowers in a parttern to the 
   * bottom (5 pixels from bottom) of the current picture
   */
  public void copyFlowersBetter()
  {

    // create the flower pictures
    Picture flower1Picture =
      new Picture(FileChooser.getMediaPath("flower1.jpg"));
    Picture flower2Picture =
      new Picture(FileChooser.getMediaPath("flower2.jpg"));

    // copy the first flower picture to near the
    // bottom left corner of the canvas
    this.copyPictureTo(flower1Picture,0);

    /* copy the flower2 picture starting with
     * x = 100 in the canvas
     */
    this.copyPictureTo(flower2Picture,100);

    //copy the flower 1 negated to x = 200 in the canvas
    flower1Picture.negate();
    this.copyPictureTo(flower1Picture,200);

    /* clear the blue in flower 2 picture and
     * add at x=300 in the canvas
     */
    flower2Picture.clearBlue();
    this.copyPictureTo(flower2Picture,300);

    // copy the negated flower 1 to x=400
    this.copyPictureTo(flower1Picture,400);
  }

   /**
   * Method to blend two sisters together onto the current
   * picture
   */
  public void blendPictures()
  {

    // create the sisters pictures
    Picture katiePicture =
      new Picture(FileChooser.getMediaPath("KatieFancy.jpg"));
    Picture jennyPicture =
      new Picture(FileChooser.getMediaPath("JenParty.jpg"));

    // declare the source and target pixel variables
    Pixel katiePixel = null;
    Pixel jennyPixel = null;
    Pixel targetPixel = null;

    /* declare the target x and source x since we will need
     * the values after the for loop
     */
    int sourceX = 0;
    int targetX = 0;

    // copy the first 150 pixels of katie to the canvas
    for (; sourceX < 150; sourceX++, targetX++)
    {
      for (int sourceY=0, targetY=0;
           sourceY < katiePicture.getHeight();
           sourceY++, targetY++)
      {
        katiePixel = katiePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(katiePixel.getColor());
      }
    }

    /* copy 50% of katie and 50% of jenny till
     * the end of katie's width
     */
    for (; sourceX < katiePicture.getWidth();
         sourceX++, targetX++)
    {
      for (int sourceY=0,targetY=0;
           sourceY < katiePicture.getHeight();
           sourceY++, targetY++)
      {
        katiePixel = katiePicture.getPixel(sourceX,sourceY);
        jennyPixel = 
           jennyPicture.getPixel(sourceX - 150,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(
              new Color((int) (katiePixel.getRed() * 0.5 +
                               jennyPixel.getRed() * 0.5),
                        (int) (katiePixel.getGreen() * 0.5 +
                               jennyPixel.getGreen() * 0.5),
                        (int) (katiePixel.getBlue() * 0.5 +
                               jennyPixel.getBlue() * 0.5)));
      }
    }

    // copy the rest of Jenny
    sourceX = sourceX - 150;
    for (; sourceX < jennyPicture.getWidth();
         sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = 0;
           sourceY < jennyPicture.getHeight();
           sourceY++, targetY++)
      {
        jennyPixel = jennyPicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(jennyPixel.getColor());
      }
    }
  }

  /**
   * Method to copy the picture of Katie but rotate
   * her left 90 degrees on the current picture
   */
  public void copyKatieLeftRotation()
  {
    String sourceFile =
      FileChooser.getMediaPath("KatieFancy.jpg");
    Picture sourcePicture = new Picture(sourceFile);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

    // loop through the columns
    for (int sourceX = 0;
         sourceX < sourcePicture.getWidth();
         sourceX++)
    {
      // loop through the rows 
      for (int sourceY = 0;
           sourceY < sourcePicture.getHeight();
           sourceY++)
      {
        // set the target pixel color to the source pixel color
        sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(sourceY,
                    sourcePicture.getWidth() - 1 - sourceX);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }

  /**
   * Method to copy a flower but scaled to 2x normal size 
   * onto the current picture
   */
  public void copyFlowersLarger()
  {
    Picture flowerPicture =
      new Picture(FileChooser.getMediaPath("rose.jpg"));
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

    // loop through the columns
    for (double sourceX = 0, targetX=0;
         sourceX < flowerPicture.getWidth();
         sourceX = sourceX + 0.5, targetX++)
    {
      // loop through the rows
      for (double sourceY = 0, targetY=0;
           sourceY < flowerPicture.getHeight();
           sourceY = sourceY + 0.5, targetY++)
      {
        sourcePixel =
          flowerPicture.getPixel((int) sourceX,(int) sourceY);
        targetPixel = this.getPixel((int) targetX,(int) targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  private boolean isSameSize(Picture source){
    if (source.getWidth() == this.getWidth()){
      if (source.getHeight() == this.getHeight()){
        return true;
      }
    }
    return false;
  }
  
  private void copyPixel(Picture srcPic, int srcX, int srcY, Picture dstPic, int dstX, int dstY){
    Pixel srcPixel = srcPic.getPixel(srcX, srcY);
    Pixel dstPixel = dstPic.getPixel(dstX, dstY);
    Color sourceColor = srcPixel.getColor();
    dstPixel.setColor(sourceColor);
    
  }
  
  public void simpleCopyFromSource(Picture source){
    if (!this.isSameSize(source)){
      System.out.println("Error! The source and target images are not the same size.");
      return;
    }
    for (int x = 0;  x < this.getWidth(); x++){
      for ( int y = 0; y < this.getHeight(); y++){
        copyPixel(source, x, y, this, x, y);
      }
    }
  }
  
  public void addPic(Picture newPic, int xPos, int yPos){
    if (newPic.getWidth() > this.getWidth() || newPic.getHeight() > this.getHeight()){
      System.out.println("Error! Passed Picture Larger than this Picture.");
      return;
    }
    
    int newWidth = newPic.getWidth();
    int newHeight = newPic.getHeight();
    
    for (int x = 0; x < newWidth; x++){
      for (int y = 0; y < newHeight; y++){
        if ( ((x + xPos) < getWidth()) && ((y + yPos) < getHeight())){
          copyPixel(newPic, x, y, this, (x + xPos), (y + yPos));
        }
      }
    }
  }
  
  public void crop(int xPos, int yPos, int width, int height){
    int xLB = xPos;
    int xRB = xPos + width;
    int yUB = yPos;
    int yLB = yPos + height;
    Pixel changingPixel = null;
    for (int x = 0; x < this.getWidth(); x++){
      for (int y = 0; y < this.getHeight(); y++){
        if ( x < xLB || x > xRB || y < yUB || y > yLB){
          changingPixel = getPixel(x, y);
          changingPixel.setColor(Color.white);
        }
      }
    }
  }
  
  public void crop(int xPos, int yPos, int width, int height, Picture newPic){
    Pixel newPixel = null;
    Pixel targetPixel = null;
    for (int x = 0; x < newPic.getWidth(); x++){
      for (int y = 0; y < newPic.getHeight(); y++){
        newPixel = this.getPixel((x + xPos), (y + yPos));
        targetPixel = newPic.getPixel(x, y);
        targetPixel.setColor(newPixel.getColor());
      }
    }
  }
  
  public void segment(int xPos, int yPos, int sWidth){
    Pixel pixel = null;
    // Check to make sure the parameters meet the requirements
    if (sWidth < 0){
      System.out.println("Error: inner square width should not be negative" + sWidth);
      return;
    }
    else if (sWidth >= this.getWidth() / 2){
      System.out.println("Error: inner square width must be less than half the width and height.");
      return;
    }
    else if (sWidth >= this.getHeight() / 2){
      System.out.println("Error: inner square top left should be within the picture limits");
      return;
    }
    else if ((xPos + sWidth) >= this.getWidth()){
      System.out.println("Error! inner square out of bounds!");
      return;
    }
    else if ((yPos + sWidth) >= this.getHeight()){
      System.out.println("Error! inner square out of bounds!");
      return;
    }
    else {
      // loop through all the pixels
      for (int x = xPos; x < (xPos + sWidth); x++){
        for (int y = yPos; y < (yPos + sWidth); y++){
          pixel = getPixel(x, y);
          // decipher which pixel is the dominant pixel and adjust the colors accordingly
          if (pixel.getRed() > pixel.getBlue() && pixel.getRed() > pixel.getGreen()){
            pixel.setBlue(0);
            pixel.setGreen(0);
          }
          if (pixel.getGreen() > pixel.getBlue() && pixel.getGreen() > pixel.getRed()){
            pixel.setBlue(0);
            pixel.setRed(0);
          }
          if (pixel.getBlue() > pixel.getRed() && pixel.getBlue() > pixel.getGreen()){
            pixel.setRed(0);
            pixel.setGreen(0);
          }
        }
      }
    }
  }
  
  public void segment(Color bColor, int bWidth, double percentage){
    // initialize variables
    Pixel pixel = null;
    int blueChange;
    int redChange;
    int greenChange;
    // make sure the parameters meet proper requirements
    if (bWidth >= (this.getHeight() / 2)){
      System.out.println("Error: Border too large!");
      return;
    }
    if (bWidth >= (this.getWidth() / 2)){
      System.out.println("Error: Border too Large!");
      return;
    }
    if (bWidth < 0){
      System.out.println("Error: Border size negative! ");
      return;
    }
    if (percentage < 30 || percentage > 90){
      System.out.println("Error: Percentage out of the limits of 30-90%");
      return;
    }
    // loop through all pixels
    for (int x = 0; x < this.getWidth(); x++){
      for (int y = 0; y < this.getHeight(); y++){
        pixel = getPixel(x, y);
        // determine if it is a border pixel
        if (x <= bWidth || x >= (this.getWidth() - bWidth)){
          // calculate change and apply the color changes
          greenChange = (int)((bColor.getGreen() - pixel.getGreen()) * (percentage / 100));
          pixel.setGreen(pixel.getGreen() + greenChange);
          redChange = (int)((bColor.getRed() - pixel.getRed()) * (percentage / 100));
          pixel.setRed(pixel.getRed() + redChange);
          blueChange = (int)((bColor.getBlue() - pixel.getBlue()) * (percentage / 100));
          pixel.setBlue(pixel.getBlue() + blueChange);
        }
        // determine if it is a border pixel
        else if (y <= bWidth || y >= (this.getHeight() - bWidth)){
          // calculate the change and apply the color changes
          greenChange = (int)((bColor.getGreen() - pixel.getGreen()) * (percentage / 100));
          pixel.setGreen(pixel.getGreen() + greenChange);
          redChange = (int)((bColor.getRed() - pixel.getRed()) * (percentage / 100));
          pixel.setRed(pixel.getRed() + redChange);
          blueChange = (int)((bColor.getBlue() - pixel.getBlue()) * (percentage / 100));
          pixel.setBlue(pixel.getBlue() + blueChange);
        }  
      }
    }
  }




    
  
} // this } is the end of class Picture, put all new methods before this
 