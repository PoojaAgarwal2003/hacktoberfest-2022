// Write a program that prompts the user to enter two strings and reports whether the second string is
// a substring of the first string.
// Enter string s1: ABCD
// Enter string s2: BC
// BC is a substring of ABCD
// Enter string s1: ABCD
// Enter string s2: BDC
// BDC is not a substring of ABCD



import java.util.*;
public class q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = sc.nextLine();
        
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s", s2, s1);
        }
        else{
            System.out.printf("%s is not a substring of %s", s2, s1);
        }   
    }
}
        