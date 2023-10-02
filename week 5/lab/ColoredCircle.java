import java.util.*;

public class ColoredCircle {
    private double radius;
    private String color;

    public ColoredCircle(){
        radius = 1.0;
        color = "blue";
    }

    public ColoredCircle(double r){
        this.radius = r;
        this.color = "blue";
    }

    public ColoredCircle(String c){
        this.radius = 1.0;
        this.color = c;
    }

    public ColoredCircle(double r, String c){
        this.radius = r;
        this.color = c;
    }
    
     /**
     * method getRadius grabs obj radius and returns it
     * @return radius in double format
     */

    public double getRadius(){
        return radius;

    }

     /**
     * method setFirstName obj color and returns it.
     * @return color in string format
     */
    public String getColor(){
        return color;
    }

     /**
     * method getArea computes area and then returns it.
     * @return returns area in double format.
     */
    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

     /**
     * method setRadius sets the radius of the obj
     * @param r input radius in double format.
     */

    public void setRadius(double r){
        this.radius = r;
    }

     /**
     * method setColor sets the color of the obj
     * @param c input color in string format
     */
    public void setColor(String c){
        this.color = c;

    }
}