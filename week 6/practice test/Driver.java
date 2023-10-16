public class Driver {
    public static void main(String[] args){
        Sign helloWorld = new Sign("Linus", "left", 19);

        System.out.println(helloWorld.getAge());
        helloWorld.grow();
        System.out.println(helloWorld.getAge());

        Sign helloWorld2 = new Sign("Livi", "right", 18);
        Sign helloWorld3 = helloWorld;
        Sign helloWorld4 = new Sign(helloWorld);

        System.out.println(helloWorld2);
        System.out.println(helloWorld3);
        System.out.println(helloWorld4);

    }
}
