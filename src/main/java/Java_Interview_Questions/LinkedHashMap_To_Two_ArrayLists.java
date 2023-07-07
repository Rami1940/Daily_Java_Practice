package Java_Interview_Questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LinkedHashMap_To_Two_ArrayLists {
    /* given the following LinkedHashMap of usernames and passwords
    //create tow ArrayLists, one  for the keys and one for the values
    LinkedHashMap<String, String> gmailCredentials = new LinkedHashMap<>();

        gmailCredentials.put("username1", null);
        gmailCredentials.put("username2", null);
        gmailCredentials.put(null, "password3");
        gmailCredentials.put(null, "password4");
        gmailCredentials.put(null, null);
        gmailCredentials.put("username6", "password6");
        gmailCredentials.put("username7", "password6");
        gmailCredentials.put("username8", "password8");
        gmailCredentials.put("username8", "password9");






















     */
    /* first solution by passing the keyset and values as parameters inside the new ArrayLists
    public static void main(String[] args) {

        LinkedHashMap<String, String> gmailCredentials = new LinkedHashMap<>();

        gmailCredentials.put("username1", "password1");
        gmailCredentials.put("username2", null);
        gmailCredentials.put(null, "password3");
        gmailCredentials.put("username4", "password4");
        gmailCredentials.put(null, "password66");
        gmailCredentials.put("username6", "password6");

        ArrayList<String> usernames = new ArrayList<>(gmailCredentials.keySet());
        ArrayList<String> passwords= new ArrayList<>(gmailCredentials.values());
        System.out.println(usernames);
        System.out.println(passwords);

     */

    // by creating a foreach loop to get inside each key and use add() method
    // and then get inside each value and add to the other array
    /* public static void main(String[] args) {
        LinkedHashMap<String, String> gmailCredentials = new LinkedHashMap<>();

        gmailCredentials.put("username1", null);
        gmailCredentials.put("username2", null);
        gmailCredentials.put(null, "password3");
        gmailCredentials.put(null, "password4");
        gmailCredentials.put(null, null);
        gmailCredentials.put("username6", "password6");
        gmailCredentials.put("username7", "password6");
        gmailCredentials.put("username8", "password8");
        gmailCredentials.put("username8", "password9");

        ArrayList<String> username = new ArrayList<>();

        for (String each:gmailCredentials.keySet()
             ) {
            username.add(each);
        }
        ArrayList<String> passwords = new ArrayList<>();
        for (String each:gmailCredentials.values()
        ) {
            passwords.add(each);
        }
        System.out.println(gmailCredentials);
        System.out.println(username);
        System.out.println(passwords);
    }





     */

}







