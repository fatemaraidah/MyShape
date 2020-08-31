package myShape;
import java.util.*;
public class Main{
    
    public static void main(String args[]){
            Scanner obj = new Scanner(System.in);

 

            System.out.println("Enter 1 to select Square Shape. ");
            System.out.println("Enter 2 to select Circle Shape. ");
            System.out.println("Enter 3 to select Triangle Shape. ");
            System.out.print("Your chosen number is: ");
            int x = obj.nextInt();
            Square p = new Square();
            Circle q = new Circle();
            Triangle t = new Triangle();
            
            if(x==1){
        
        System.out.print("Enter the length of Square: ");
        double Square = obj.nextDouble();
        System.out.println("Area of Square shape: " +p.Area(Square));
        System.out.println("Boundary length of the square is: " +p.boundaryLength(Square));
        }

    else if(x==2){
        
        System.out.print("Enter the radius of Circle: ");
        double circle = obj.nextDouble();

        System.out.println("Area of circle is: " +q.Area(circle));
        System.out.println("Boundary length of circle is: " +q.boundaryLength(circle));
        }

    else if(x==3){
        
        System.out.print("Enter the side of Triangle: ");
        double triangle = obj.nextDouble();
                
        System.out.println("Area of the Triangle is : " +t.Area(triangle));
        System.out.println("Boundary length of the Triangle is : " +t.boundaryLength(triangle));    
        }    
    }

}