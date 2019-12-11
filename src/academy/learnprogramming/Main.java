package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String str="|/-\\";

        char[] newStr=str.toCharArray();

        while(true) {
            for (int i = 0; i < newStr.length; i++) {

                System.out.println(newStr[i]);


            }
        }
}
}
