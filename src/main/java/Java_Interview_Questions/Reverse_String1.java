package Java_Interview_Questions;

public class Reverse_String1 {
    // reverse the word "Hello"
    public static void main(String[] args) {

        String input = "customerId";
        char [] charArray = input.toCharArray(); // {H,e,l,lo)
        int first = 0; // first index of the array
        int last  = charArray.length-1; // the index of the last letter
        while(first <last){
            char temp = charArray[first]; // temp has the value of first
            charArray[first] = charArray[last]; // last value has last value
            charArray[last] = temp; // last value has first vale
            first++;
            last--;
        }
        // {o,l,l,H}
        String output = new String(charArray);
        System.out.println("input is: "+input+", and output is: "+output);

    }

}
