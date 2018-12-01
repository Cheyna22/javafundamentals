public class Main{
    public static String pluralize(String petName, int num) {
        if(num == 0 ||  num > 1){
            petName = petName + 's';
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


        flipNHeads(7);
    }

    public static void flipNHeads(int numHeadsFlipped) {
        // variables to help generate random number between 1 and 0
        int min = 0;
        int max = 1;
        int randomNum = (int) (Math.random() * (max - min)); // generate random number

        int heads = 0;
        int tails = 0;
        // if random number is less than .5 = tails
        // if random number is greater than or equal to .5 = heads
        while(heads < numHeadsFlipped) {
            if(randomNum <= .5) {
                heads++;
                System.out.println("Heads");
            } else if (randomNum > .5) {
                tails++;
                System.out.println("Tails");
            }
        }
    }

    public static int clock(){
        LocalDateTime now = new LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
    }



}
