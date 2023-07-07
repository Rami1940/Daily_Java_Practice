package Java_Interview_Questions;

public class Reverse_String2 {
    public static void main(String[] args) {

       String word = "CustomerId";

        char [] inputArray = word.toCharArray();
        char [] outputArray = new char[inputArray.length]; // { , , , }

        int count = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[count] = inputArray[i];
            count++;
        }
        String input = new String(inputArray);
        String output = new String(outputArray);
        System.out.println("input = " + input);
        System.out.println("output = " + output);


    }

}
