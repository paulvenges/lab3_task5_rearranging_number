import java.util.Random;

public class numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        int largestValue = Integer.MIN_VALUE;
        int smallestValue = Integer.MAX_VALUE;

        System.out.print("Randomly generated numbers: ");

        int i = 0;
        while (i < count) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.print(randomNumber + " ");

            if (randomNumber > largestValue) {
                largestValue = randomNumber;
            }
            if (randomNumber < smallestValue) {
                smallestValue = randomNumber;
            }

            i++;
        }

        System.out.println();
        System.out.println("Smallest number: " + smallestValue);
        System.out.println("Largest number: " + largestValue);
    }
}
