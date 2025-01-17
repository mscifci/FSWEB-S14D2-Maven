package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 1, 1, 1);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);
        Wardrobe wardrobe = new Wardrobe(2, 2, 50.0);
        Carpet carpet = new Carpet(3, 4, PaintColor.RED);


        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);


        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();


        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
    }
}