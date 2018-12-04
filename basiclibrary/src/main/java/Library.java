public class Library {
    public static int[] roll(int numRolls) {
        int[] rollsArray = new int[numRolls];
        int maxValue = 6;
        int minValue = 1;

        for(int i = 0; i < rollsArray.length; i++) {
            int randomNum = (int)Math.random() * (maxValue - minValue + 1);
            rollsArray[i] = randomNum;
        }
        return rollsArray;
    }

    public static int calcAverage(int[] numArray) {
        int sum = 0;
        for(int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        return sum / numArray.length;
    }

    public static boolean containsDuplicates(int[] numbersToCheck) {
        for (int i = 0; i < numbersToCheck.length; i++) {
            int indexValues = numbersToCheck[i];
            for(int indexTracker = i + 1; indexTracker < numbersToCheck.length; indexTracker++) {
                if (indexValues == numbersToCheck[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int lowestArrayAverage(int[][] arrays) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        // iterate through the weeklyMonthTemperatures array
        // for every array in weeklyMonthTemperatures
        // calculate the average of that array - used calcAverage Method
        // store that value in a new array (int[] valuesOfEachArray = new int[])
        // iterate through the new array
        // find the lowest value
        // return array with lowest average

        int avgSingleArray = Integer.MAX_VALUE;
        int lowestAverageSoFar = avgSingleArray;

        for(int row = 0; row < weeklyMonthTemperatures.length; row++) {
            avgSingleArray = (calcAverage(weeklyMonthTemperatures[row]));

            if(avgSingleArray < lowestAverageSoFar) {
                lowestAverageSoFar = avgSingleArray;
            }
        }
        return lowestAverageSoFar;
    }
}
