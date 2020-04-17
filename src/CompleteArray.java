public class CompleteArray {
    public static void main (String [] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

        //Declare sum variable, assign it initial value of zero
        int sum = 0;

        //Compute the sum of the number in the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        //Display the sum
        System.out.println("The sum is: " + sum);
    }
}
