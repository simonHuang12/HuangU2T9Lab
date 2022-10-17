public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle tringle = new RightTriangle(3,4);
        RightTriangle trangle = new RightTriangle(6.5, 10.7);
        double hypotenuse1 = tringle.hypotenuse();
        double hypotenuse2 = trangle.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
    }
}
