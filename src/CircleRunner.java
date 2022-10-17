public class CircleRunner {
    public static void main(String[] args){
        Circle corcle = new Circle(5.0);
        System.out.println(corcle.getInfo());
        corcle.setRadius(9.2);
        System.out.println(corcle.getInfo());
    }
}
