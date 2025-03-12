/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author candr
 */

public class Booking {
    private String name;
    private String gender;
    private int guests;
    private int nights;
    private Room room;

    public Booking(String name, String gender, int guests, int nights, Room room) {
        this.name = name;
        this.gender = gender;
        this.guests = guests;
        this.nights = nights;
        this.room = room;
    }

    public double getTotalPrice() {
        return room.calculatePrice(nights);
    }

    public String getDetails() {
        return "=== Booking Details ===\n" +
               "Name       : " + name + "\n" +
               "Gender     : " + gender + "\n" +
               "Guests     : " + guests + "\n" +
               "Room Type  : " + room.getType() + "\n" +
               "Nights     : " + nights + "\n" +
               "Total Price: Rp." + getTotalPrice();
    }
}
