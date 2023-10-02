public class Driver{
    public static void main(String[] args){
        ColoredCircle c1 = new ColoredCircle ();

        double d = c1.getRadius();

        String s = c1.getColor();

        c1 = new ColoredCircle (12.3,"red");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());

        ColoredCircle c2 = new ColoredCircle ();
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());

        ColoredCircle c3 = new ColoredCircle (41.3);
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());

        ColoredCircle c4 = new ColoredCircle ("orange");
        System.out.println(c4.getRadius());
        System.out.println(c4.getColor());

        c1.setRadius(1.2);
        System.out.println(c1.getRadius());
        c1.setRadius(-1.2);
        System.out.println(c1.getRadius());

        c2.setColor("green");

        double area = c3.getArea();
        System.out.println(area);   
    }
}