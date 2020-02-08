public class Overloading {
    public static void main(String[] args) {

//        int initialScore = calcScore("Amit",4500);
//        System.out.println("Initial Score : "+initialScore);
//        System.out.println("Total Score =>  "+calcScore(6675));
//        System.out.println("level => " + calcScore("",0,76) );


        //Exercise outPut
        double calculatedCentimeters = calcFeetAndInchesToCentimeters(1545);
        if (calculatedCentimeters == -1) {
            System.out.println("Provided Input is not as per requirement");
        } else {
            System.out.println("Centimeters Calculated From the input: " + calculatedCentimeters);
        }

    }

    public static int calcScore(String playerName, int initialScore) {
        return initialScore;
    }

    public static int calcScore(int initialScore) {
        return initialScore * 1000;
    }

    public static int calcScore(String playerName, int initialScore, int level) {
        return level;
    }


    //Exercise --> Method Overloading
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0) {
            if (inches >= 0 && inches <= 12) {
                double centimeterFromFeet = feet * 12 * 2.54;
                double centimeterFromInches = inches * 2.54;
                return centimeterFromFeet + centimeterFromInches;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }


    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feetFromInches = inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("UserInput " + inches + "inches " + "  cal : " + feetFromInches + " feet and " + remainingInches + " Remaining inches");
            return calcFeetAndInchesToCentimeters(feetFromInches, remainingInches);
        } else {
            return -1;
        }
    }

}
