package hust.soict.dsai.Lab01;

import java.util.*;
public class Section63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j<i; j++){
                System.out.print("**");
            }
            System.out.print("\n");
        }
    }
}
