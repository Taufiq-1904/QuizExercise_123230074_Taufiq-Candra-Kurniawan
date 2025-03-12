/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.LargeRoom;
import model.SmallRoom;
import model.Room;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author candr
 */


public class MainMenuPage extends JFrame {
    private Room selectedRoom;

    public MainMenuPage() {
        setTitle("Main Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JButton smallRoomButton = new JButton("Small Room (250.000 IDR/night)");
        JButton largeRoomButton = new JButton("Large Room (500.000 IDR/night)");

        smallRoomButton.addActionListener(e -> {
            selectedRoom = new SmallRoom();
            new BookingPage(selectedRoom);
            dispose();
        });

        largeRoomButton.addActionListener(e -> {
            selectedRoom = new LargeRoom();
            new BookingPage(selectedRoom);
            dispose();
        });

        add(smallRoomButton);
        add(largeRoomButton);
        setVisible(true);
    }
}

