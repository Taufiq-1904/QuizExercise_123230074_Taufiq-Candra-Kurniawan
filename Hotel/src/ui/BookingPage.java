/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Booking;
import model.Room;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author candr
 */


public class BookingPage extends JFrame {
    private JTextField nameField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<Integer> guestDropdown;
    private JTextField nightsField;
    private Room selectedRoom;

    public BookingPage(Room room) {
        this.selectedRoom = room;
        
        setTitle("Booking Page");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel);

        add(new JLabel("Number of Guests:"));
        guestDropdown = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        add(guestDropdown);

        add(new JLabel("Length of Stay:"));
        nightsField = new JTextField();
        add(nightsField);

        JButton bookButton = new JButton("Book");
        JButton resetButton = new JButton("Reset");
        add(bookButton);
        add(resetButton);

        bookButton.addActionListener(e -> bookRoom());
        resetButton.addActionListener(e -> resetFields());

        setVisible(true);
    }

    private void bookRoom() {
        try {
            String name = nameField.getText();
            String gender = maleButton.isSelected() ? "Male" : "Female";
            int guests = (int) guestDropdown.getSelectedItem();
            int nights = Integer.parseInt(nightsField.getText());

            if (name.isEmpty() || (!maleButton.isSelected() && !femaleButton.isSelected())) {
                throw new Exception("Please fill all fields!");
            }

            Booking booking = new Booking(name, gender, guests, nights, selectedRoom);
            JOptionPane.showMessageDialog(this, booking.getDetails());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input for nights!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void resetFields() {
        nameField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        nightsField.setText("");
    }
}

