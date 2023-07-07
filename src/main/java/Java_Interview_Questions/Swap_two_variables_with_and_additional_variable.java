package Java_Interview_Questions;

public class Swap_two_variables_with_and_additional_variable {

    public static void main(String[] args) {
        int first=1;
        int second =2;
        int empty;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

        empty=first;
        first=second;
        second=empty;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

    }
}
