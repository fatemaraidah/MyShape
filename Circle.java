package myShape;
 public class Circle implements myShape{
     
    double c;
        @Override
    public double Area(double r){
        c=r;
        return 3.142*r*r;
    }
        @Override
    public double boundaryLength(double r){
        c=r;
        return 2*3.142*r;    
    }
    }