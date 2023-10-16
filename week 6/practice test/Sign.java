
public class Sign {
    private String name;
    private String orientation;
    private int age;

    public Sign(String name, String orientation, int age){
        this.name = name;
        this.orientation = orientation;
        this.age = age;
    }

    public Sign(Sign sign){
        this.name = sign.name;
        this.orientation = sign.orientation;
        this.age = sign.age;
    }

    @Override
    public boolean equals(Object s){
        Sign sign = (Sign)s;
        return this.name.equals(sign.name) &&
        this.orientation.equals(sign.orientation)&&
        this.age == sign.age;
    }

    @Override
    public String toString(){
        return String.format("This sign is called %s and is %s facing. It's age is %d.", name, orientation, age);
    }

    public void grow(){
        this.age++;
    }

    public String getName(){
        return this.name;
    }

    public String getOrienation(){
        return this.orientation;

    }

    public int getAge(){
        return this.age;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setOrienation(String o){
        this.orientation = o;

    }

    public void setAge(int a){
         this.age = a;
    }


}
