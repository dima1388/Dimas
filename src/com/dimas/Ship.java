package com.dimas;
import java.util.ArrayList;
public class Ship {
    public final String THEY_ALREADY_SHOT = "Вы уже стреляли в это место!";
    public final String GOT = "Вы попали!";
    public final String MISSED = "Вы промазали!";
    public final String SUNK = "Потоплен!";
    private ArrayList cordinateShip = new ArrayList();
    private ArrayList cordinateShot = new ArrayList();

    /* Конструктор корабля */

    Ship(int s, int sShip) {
        int a = (int) (Math.random()*(s - sShip));
        for(int i = 0; i < s; i++){
            cordinateShip.add(a);
            a++;
        }
    }

    /* Конструктор по умолчанию */
    Ship(){
        this(12,3);
    }

    /* метод сообщающай о состоянии коробля
    *@return true если уничтожен, false если нет;
     */

     public void StatussShip(int shot) {
         int x = cordinateShip.indexOf(shot);
         if (cordinateShot.contains(shot)) {
             System.out.println(THEY_ALREADY_SHOT);
         } else if (!(-1 == x)) {
             cordinateShip.remove(x);
             System.out.println(GOT);
         } else {
             System.out.println(MISSED);
         }
         cordinateShot.add(shot);

     }

     /* Метод проверающий корабль уничтожен или нет */

     boolean Destroyed() {
         return cordinateShip.isEmpty();
     }

}