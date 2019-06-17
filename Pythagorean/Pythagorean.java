import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int a, int b){
        double c = (a*a) + (b*b);
        double squareroot = Math.sqrt(c);
        return squareroot;
    }
}