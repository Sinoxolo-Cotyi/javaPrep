public class Magic {
    // The program will return the same value of 3 whatever integer is chosen!
    public static void main(String[] args) {
        int myNumber = 5; // This is the original number from here onwards
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    }
}
