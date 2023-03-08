public class SnakeLadder {

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;

    }
        public static void main (String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");

        int startPosition = 0;
        int dice = getRandomInteger(7,1);
    }
}
