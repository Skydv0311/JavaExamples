package commondemos;

import java.util.Scanner;

public class RomanToInteger {
    static int value(char character){
        if(character=='i' || character=='I')
            return 1;
        if(character=='v' || character=='V')
            return 5;
        if(character=='x' || character=='X')
            return 10;
        if(character=='l' || character=='L')
            return 50;
        if(character=='m' || character=='M')
            return 100;
        if(character=='d' || character=='D')
            return 500;
        return -1;
    }

    static int romanToInteger(String str){
        int integerValue=0;
        for (int i=0;i<str.length();i++){
            int s1=value(str.charAt(i));
            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                if(s1>=s2){
                    integerValue+=s1;
                }else{
                    integerValue-=s1;
                }
            }else{
                integerValue+=s1;
            }
        }
        return integerValue;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(romanToInteger(str));
    }
}
