public class Main {
    public static String pluralize(String petName, int num) {
        if(num == 0 ||  num > 1){
            petName = petName + "s";
            return petName;
        } else {
            return petName;
        }

    }

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount));

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount));

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("dog", turtleCount));
    }
}
