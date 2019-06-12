package homework11;

import java.util.Scanner;

public class Homework11{

    public static void main(String[] args) {

           String ans = null;
        int charone = 0;
        int chartwo = 0;
        int charthree = 0;
        int charfour = 0;
        int charfive = 0;
        char rechar1 = 0;
        char rechar2 = 0;
        char rechar3 = 0;
        char rechar4 = 0;
        char rechar5 = 0;
        String password;
        StringBuilder fans = new StringBuilder();
        Scanner scanvar = new Scanner(System.in);
        System.out.println("type in your password and see how fast the code runs");
        password= scanvar.next();
        for(charone=48;charone<=57;charone++){
        rechar1 = ((char)charone);
        for (chartwo=48;chartwo<=57;chartwo++){
        rechar2 = ((char)chartwo);
        for(charfour=48;charfour<=57;charfour++){
        rechar3 = ((char)charfour);
        for(charthree=48;charthree<=57;charthree++)
        rechar4 = ((char)charthree);
        rechar5 = ((char)charfive);
        fans.setLength(0);
        fans.append(rechar1);
        fans.append(rechar2);
        fans.append(rechar3);
        fans.append(rechar4);
        ans = fans.toString();
        if (ans.equals(password)) 
        {
         System.exit(0);
        }
        }
        }
        }
        System.out.print("your password is " + password);
   }
}
