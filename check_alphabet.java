///////////////////////////////

####Java Program to Check Number using ternary operator



import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char c = scanner.next().charAt(0);


        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
        }
}
//////////////

Java Program to Check Alph using isAlphabetic() Method


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char c = scanner.next().charAt(0);


        if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an alphabet.");
    }
        }
}

