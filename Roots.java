import java.util.Scanner;
import java.lang.*;
public class Roots {
   public static void main(String args[]){
      double secondRoot = 0, firstRoot = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextDouble();

      System.out.println("Enter the value of b ::");
      double b = sc.nextDouble();

      System.out.println("Enter the value of c ::");
      double c = sc.nextDouble();

      double determinant = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(determinant);

      if(determinant>0){
         firstRoot = (-b + Math.sqrt(determinant))/(2*a);
         secondRoot = (-b - Math.sqrt(determinant))/(2*a);
         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
      }else if(determinant == 0){
         System.out.println("Root is :: "+(-b + sqrt)/(2*a));}
         else if(determinant<0) { System.out.println("REAL ROOTS DO NOT EXIST");}
      }
   }