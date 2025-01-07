package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        // Geçersiz saat değerleri için kontrol
        if (clock < 0 || clock > 23) {
            return false;  // Saat geçersizse false dönüyoruz
        }

        // Köpek havlıyorsa
        if (isBarking) {
            // Gece saatleri: 0-7 ve 20-23 arasında havlıyorsa
            if (clock >= 0 && clock < 8 || clock >= 20 && clock <= 23) {
                return true;
            }
        }

        // Köpek havlamıyorsa veya saat geçerli değilse
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return temp >= 25 && temp <=45;
        }else{
            return temp >= 25 && temp <=35;
        }
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0){
           return -1;
       }
       return width*height;
    }

    public static double area(double radius) {
       if(radius < 0){
           return -1;
       }

       return radius*radius*Math.PI;
    }
}
