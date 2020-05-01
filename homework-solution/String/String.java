package com.example.as;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class String {

    public static void main(java.lang.String[] args) {
        java.lang.String s = "Algorithms";

        //Topic String Q1:
        java.lang.String sub1 = s.substring(2,4);
        java.lang.String sub2 = s.substring(0,4);
        System.out.println("substring 1: " + sub1);
        System.out.println("substring 2:" + sub2);

        //Topic String Q2:
        java.lang.String s1 = "what";
        java.lang.String s2 = "What";
        System.out.println("Comparing : " + compareTwoString(s1,s2));

        //Topic String Q3:
        java.lang.String url ="https://www.amazon.com/demo?test=abc";
        System.out.println(token(url));

        //Topic String Q4:
        ArrayList<java.lang.String> a = new ArrayList<java.lang.String>();
        a.add("face");
        a.add("book");
        System.out.println("combine string: " + combine(a));

    }

    public static boolean compareTwoString(java.lang.String s1, java.lang.String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        int minLength = Math.min(length1,length2);
        for(int i = 0; i< minLength; i++)
        {
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static List<java.lang.String> token(java.lang.String s){
        List<java.lang.String> tokens = new ArrayList<java.lang.String>();
        StringTokenizer stringTokenizer = new StringTokenizer(s,": // / ? . =");
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }

    public static java.lang.String combine(ArrayList<java.lang.String> arr){
        StringBuffer sb = new StringBuffer();
        for(java.lang.String a : arr){
            sb.append(a);
        }
        java.lang.String str = sb.toString();
        return str;
    }

}
