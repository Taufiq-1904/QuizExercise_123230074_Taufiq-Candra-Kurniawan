/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author candr
 */

public class SmallRoom extends Room {
    public SmallRoom() {
        super("Small", 250000);
    }

    @Override
    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }
}
