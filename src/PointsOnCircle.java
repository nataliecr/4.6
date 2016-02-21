import java.util.Scanner;

public class PointsOnCircle {
  public static void main(String[] args){
      final int RAD = 40;
      
      double a1 = Math.random() * 2 * Math.PI;
      double x1 = RAD * Math.cos(a1);
      double y1 = RAD * Math.sin(a1);
      
      double a2 = Math.random() * 2 * Math.PI;
      double x2 = RAD * Math.cos(a2);
      double y2 = RAD * Math.sin(a2);
      
      double a3 = Math.random() * 2 * Math.PI;
      double x3 = RAD * Math.cos(a3);
      double y3 = RAD * Math.sin(a3);
      
      //distance from point 1 to point 2:
      double side1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
      double side2 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
      double side3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
      
      double angle1 = Math.acos((side2*side2 + side3*side3 - side1*side1)
              / (2*side2*side3));
      double angle2 = Math.acos((side1*side1 + side3*side3 - side2*side2)
              / (2*side1*side3));
      double angle3 = Math.acos((side1*side1 + side2*side2 - side3*side3)
              / (2*side1*side2));
      
      System.out.println("angle 1: " + angle1 + " radians");
      System.out.println("angle 2: " + angle2 + " radians");
      System.out.println("angle 3: " + angle3 + " radians");
      
    }  // main
} // PointsOnCircle
