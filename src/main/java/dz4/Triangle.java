package dz4;

import static java.lang.Math.sqrt;

public class Triangle {

    public int area(int a, int b, int c) throws OtrizatStoronaException,NullStoronaException,NotTriangleException{
        if (a < 0 || b < 0 || c < 0 ){
            throw new OtrizatStoronaException("Storona otrizatelna");
        }
        if(a == 0 || b==0 || c==0){
            throw new NullStoronaException("Storona ravna 0");
        }
        if(a + b <= c || a + c <= b || b + c <= a){
            throw new NotTriangleException("It isn't a triangle");
        }
        int S = (a + b + c) / 2;
        return (int) sqrt(S * (S - a) * (S - b) * (S - c));
    }
}
