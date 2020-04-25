package com.titustransportation.calculateTripPayment;

import javax.swing.JOptionPane;

import com.titustransportation.entity.DriverTrip;

public class TripCalculatorApp {

	private DriverTrip myTrip;
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many stops does your trip has?");
	}

}
