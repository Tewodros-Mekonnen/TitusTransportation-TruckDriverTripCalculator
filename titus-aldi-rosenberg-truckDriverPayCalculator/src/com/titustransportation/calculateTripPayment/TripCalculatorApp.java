package com.titustransportation.calculateTripPayment;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.titustransportation.entity.AldiStores;
import com.titustransportation.entity.DriverTrip;

public class TripCalculatorApp {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("How many stores?");
		int numberOfStores = Integer.parseInt(input);

		AldiStores theStore = null;

		List<Double> storeMiles = new ArrayList<>();

		for (int i = 0; i < numberOfStores; i++) {
			input = JOptionPane.showInputDialog("enter store number " + (i + 1));
			int storeNumber = Integer.parseInt(input);
			theStore = new AldiStores(storeNumber);
			storeMiles.add(theStore.getStoreRoundTripDistance_fromWarehouse_inMiles());
		}

		theStore.setCollectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles(storeMiles);

		System.out.println("Store Miles");
		for (Double miles : storeMiles) {
			System.out.println(miles);
		}

		System.out.println("\n" + theStore.getCollectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles());

		// set the farthest store
		DriverTrip myTrip = new DriverTrip(numberOfStores);
		myTrip.setTheFarthestStore_forThisTrip_inMiles(storeMiles);

		// get the farthest store
		System.out.println("\nThe farthest store is: " + myTrip.getTheFarthestStore_forThisTrip_inMiles()
				+ " miles from the warehouse!");

		// set payment for the longest mile for this trip
		myTrip.setPaymentForTheTotalMilesDriven();
		double milePay = myTrip.getPaymentForTheTotalMilesDriven();
		// get payment for the longest mile driven
		System.out.println("\npayment for miles: " + milePay);

		// set driver extra stop pay
		myTrip.setDriverExtraStopPayment_forThisTrip_inDollars(numberOfStores);

		// get driver extra stop pay
		double extraStpPayment = myTrip.getDriverExtraStopPayment_forThisTrip_inDollars();

		System.out.println("\nextraStpPayment: " + extraStpPayment);

		// set total trip payment
		myTrip.setTripPayment();

		// get total trip payment
		System.out.println("\nTotal trip payment: " + myTrip.getTripPayment());

	}

}
