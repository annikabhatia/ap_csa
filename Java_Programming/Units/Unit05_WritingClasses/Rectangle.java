package Units.Unit05_WritingClasses;

public class Rectangle {
      double length;
      double width;
      
      public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
      }

      public void calcArea() {
        double area = length * width;
        System.out.println("The area of the rectangle is" + area);
      }

      public void calcPer() {
        double per = (2 * length) + (2 * width);
        System.out.println("The perimeter of the rectangle is" + per);
      }
    
}
