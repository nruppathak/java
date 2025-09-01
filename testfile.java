public class testfile {

public static void main(String[] args) {

String str1 = "string Examples";

int length =  str1.length();

char ch =  str1.charAt(5);

int Indf = str1.indexOf("s");

int Indf1 = str1.lastIndexOf("s");

String str2 = str1.toUpperCase();

String str3 = str1.toLowerCase();

String str4 = str1.replace("g", "h");

System.out.println("Total length of String Stri=" + length);

System.out.println("character at the index of 5 in String Strl =" +ch);

System.out.println("Printing the first index of 5 from Strl =" +  Indf );

System.out.println("Printing the last Index of 5 from Stri = " + Indf1);

System.out.println("Printing the uppercase of Stri  = " + str2);

System.out.println("Printing the lowercase of Stri = " +  str3);

System.out.println("Replacing the character and printing of Stri = " + str4); }
}

