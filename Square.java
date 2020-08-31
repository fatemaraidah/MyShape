package myShape;
    public class Square implements myShape{
        double l;
        @Override
        public double Area(double l){
            
            this.l=l;
            return l*l;
        }   
        @Override
        public double boundaryLength(double l){
            this.l=l;
            return 4*l;
        }
    }