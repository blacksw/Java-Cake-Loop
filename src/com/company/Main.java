package com.company;
import static java.lang.Math.*;

public class Main {
    private static final int MIDDLE = 5;
    public static void main(String[] args) {
        int width = 1;

        while(width < MIDDLE){

            if(width < 2){
                for(int i = 0;i < 4;i++){
                    System.out.print(" ");
                }
                for(int i = 0;i < 1;i++){
                    System.out.println("^^^");
                }
                for(int i = 0;i < 4;i++){
                    System.out.print(" ");
                }
                for(int i = 0;i < 1;i++){
                    System.out.println("|||");
                }
            }
            if(width != 6){
                for (int i = 0; i < MIDDLE-width; i++) {
                    System.out.print(" ");  // поставьте здесь вместо пробела i, чтобы проверить, что середина на 20-м символе
                }
                for (int i = 0; i < width*2 + 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                width++;
            }
        }
    }
}
