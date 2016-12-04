//im getting an error everytime it runs 
/*

*/
package countvowels;

import java.util.Scanner;


public class CountVowels {

    public static void main(String[] args) {
        
    char[] vowels = {'a','e','i','o','u'};
    int counter = 0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a phrase");
    
    String userInput = scan.nextLine();
    
    char[] charArray = userInput.toCharArray();
   
    for (int i = 0; i <= charArray.length; i++){
        
      System.out.print(charArray[i]);
        for (int j = 0; j <=vowels.length; j++) {
        if (charArray[i] == vowels[j]) {
            counter++;
        }
        }
    }
    System.out.println("There were " + counter + " vowels in your string");
    }
    
}
