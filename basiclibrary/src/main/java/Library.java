/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
//    method
    public static int[] roll(int numRolls) {
        int[] rollsArray = new int[numRolls];
        int maxValue = 6;
        int minValue = 1;

        for(int i = 0; i < rollsArray.length; i++) {
            int randomNum = Math.random(maxValue - minValue) + 1;
            rollsArray[i] = randomNum;
        }
        return rollsArray;
    }

//    public boolean containsDuplicates() {
//        for(int i = 0; i > rollsArray.length; i++){
//            if(rollsArray[i] == rollsArray[i]) {
//                return true;
//        } else {
//                return false;
//            }
//
//        }
    }
}