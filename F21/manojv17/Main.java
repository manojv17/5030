package Codenew;
import java.util.Scanner;
import java.util.Locale;
import java.io.DataInputStream;
import java.io.IOException;

import java.util.Locale;

public class review
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		for( int i = 1; i <= 5; i++ ) {
            System.out.println("Select a Language:\n1.ENGLISH\n2.TURKISH\n3.GREEK\n4.IRISH\n5.Exit");
            DataInputStream in = new DataInputStream(System.in);
            int ch = Integer.parseInt(in.readLine());
            switch(ch) {
            case 1:
            
	    //English language
	            String Upper, Lower;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter one word in Uppercase : ");
        Upper = scan.nextLine();
        
        Lower = Upper.toLowerCase();
        System.out.println("Equivalent Word in Lowercase : " + Lower);
        break;
        
            case 2:

        // Turkish Language
        Locale.setDefault(new Locale("tr")); 
        var str = "\u0131";
		   String toUpperCase, toLowerCase;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter one word in Uppercase : ");
        toUpperCase = s.nextLine();
        
        toLowerCase = toUpperCase.toLowerCase();
        System.out.println("Equivalent Word in Lowercase : " + toLowerCase);
        
        break;
        
            case 3: 
        //Greek Language
        Locale.setDefault(new Locale("el")); //setting greek as locale
        var st = "\u03c2";
		   String toUpper, toLower;
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Enter one word in Uppercase : ");
        toUpper = sca.nextLine();
        
        toLower = toUpper.toLowerCase();
        System.out.println("Equivalent Word in Lowercase : " + toLower);

            break;
            case 4:

        //Irish Language
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
         char[] ss = sc.next().toCharArray();
            String str1 = new String(ss);
        int n = str1.length();
        char c = str1.charAt(0);
        char sech = str1.charAt(1);
        if(c == 't' || c == 'n'|| c== 'N' || c=='T')
        {
         if(sech == 'A' || sech == 'E' || sech == 'I' || sech == 'O' || sech == 'U'){
        
               char ssech = Character.toLowerCase(sech);
                 System.out.print(c+ "-" +ssech);
                 for(int i1=2; i1<ss.length; i1++){
                    System.out.print(ss[i1]);
                            
                }
         break;
        }
            	}
	}
		}
	}
}
