package com.dimas;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер корабля");
        int s = scan.nextInt();
        while (s < 2){
            System.out.println("Введите размер канала чтобы в него помещался корабль!");
            s = scan.nextInt();
        }
        System.out.println("Введите размер корабля");
        int sShip = scan.nextInt();
        while(sShip < 1 || s > sShip){
            System.out.println("Размер корабля должен быть больше 1 клетки!");
            sShip = scan.nextInt();
        }
        Ship ship = new Ship(s, sShip);
        s++;
        Shooting(s, ship);
    }

    /* Метдо считающай кол-во выстрелов и реализующий саму стрельбу */

    public static void Shooting(int s, Ship ship) {
        int count = 0;
        do {
            System.out.println("Введите координату, куда будите стрелять!");
            int shot = scan.nextInt();
            while(shot > 0 || shot >= s) {
                System.out.println("Введите число которое, будет больше 0 и меньше или равно длинне канала!");
                shot = scan.nextInt();
            }
            ship.StatussShip(shot);
            count++;
        } while (!ship.Destroyed());
             System.out.println("Вы уничожили корабль за " + count + " попыток");
    }
}


