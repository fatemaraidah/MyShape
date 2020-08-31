package myShape;
public class Triangle implements myShape{
    double s;
        @Override
    public double Area(double a){
       s=a;
        return ((Math.sqrt(3))/2)*a*a;
    }
        @Override
    public double boundaryLength(double a){
        s=a;
        return 3*a;    
    }
}