/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author candr
 */

public class LargeRoom extends Room {
    public LargeRoom() {
        super("Large", 500000);
    }

    @Override
    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }
}
