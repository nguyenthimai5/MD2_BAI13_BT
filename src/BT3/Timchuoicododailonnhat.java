package BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Timchuoicododailonnhat {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String inputString = sc.nextLine();
        String[] strings=inputString.split("a");
        int maxInputString=strings[0].length();
        String longStringMax ="";
        for (int i = 1; i < strings.length; i++) {
            if (maxInputString < strings[i].length()){
                maxInputString=strings[i].length();
                longStringMax=strings[i];

            }else {
                continue;
            }
        }
        System.out.println("Chuoi co do dai lon nhat la ");

            System.out.println("a"+longStringMax);


    }
}