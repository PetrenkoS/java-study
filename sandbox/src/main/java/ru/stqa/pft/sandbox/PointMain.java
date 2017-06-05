package ru.stqa.pft.sandbox;

/**
 * Created by Admin on 04.06.2017.
 */

    public class PointMain {

        public static void main(String[] args) {

            Point p1 = new Point(6, 4);
            Point p2 = new Point(8, 3);

            System.out.println("Расстояние между двумя точками" + " = " + p1.distance(p2));

        }


    }



