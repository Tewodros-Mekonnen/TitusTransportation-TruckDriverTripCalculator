package com.titustransportation.entity;

import java.util.Collections;
import java.util.List;

public class DriverTrip {

	private final double shortTripFee_inDollars = 20;

	private final double driverPaymentPerMile_inDollars = 0.67;

	private final double fixedAmount_driverExtraStopPayment_inDollars = 18;

	private final double driverTrailerLoadingFee_forEachTrip_inDollars = 15;

	private String thisTripDate;

	private int numberOfStops;

	private double driverExtraStopPayment_forThisTrip_inDollars;

	AldiStores theStore;

	private double theFarthestStore_forThisTrip_inMiles;

	private double paymentForTheTotalMilesDriven;

	private double tripPayment;

	public DriverTrip() {

	}

	public DriverTrip(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public String getThisTripDate() {
		return thisTripDate;
	}

	public void setThisTripDate(String tripDate) {
		this.thisTripDate = tripDate;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public double getDriverExtraStopPayment_forThisTrip_inDollars() {
		return driverExtraStopPayment_forThisTrip_inDollars;
	}

	public void setDriverExtraStopPayment_forThisTrip_inDollars(int stops) {
		this.driverExtraStopPayment_forThisTrip_inDollars = ((stops - 1)
				* fixedAmount_driverExtraStopPayment_inDollars);
	}

	public double getTheFarthestStore_forThisTrip_inMiles() {
		return theFarthestStore_forThisTrip_inMiles;
	}

	// setTheFarthestStore_forThisTrip_inMiles method picks the largest number from
	// a collection and assigns it to a field.
	// this field (theFarthestStore_forThisTrip_inMiles) is essential to calculate
	// driver's pay for a given trip.
	public void setTheFarthestStore_forThisTrip_inMiles(List<Double> collections) {
		this.theFarthestStore_forThisTrip_inMiles = Collections.max(collections);
	}

	public double getPaymentForTheTotalMilesDriven() {
		return paymentForTheTotalMilesDriven;
	}

	public void setPaymentForTheTotalMilesDriven() {

		if (theFarthestStore_forThisTrip_inMiles < 80) {
			paymentForTheTotalMilesDriven = (theFarthestStore_forThisTrip_inMiles * driverPaymentPerMile_inDollars)
					+ shortTripFee_inDollars;
		} else if ((theFarthestStore_forThisTrip_inMiles > 80) & (theFarthestStore_forThisTrip_inMiles < 179)) {
			paymentForTheTotalMilesDriven = (theFarthestStore_forThisTrip_inMiles * driverPaymentPerMile_inDollars);
		} else if ((theFarthestStore_forThisTrip_inMiles > 180)) {
			paymentForTheTotalMilesDriven = (theFarthestStore_forThisTrip_inMiles * driverPaymentPerMile_inDollars);
		}
	}

	public double getTripPayment() {
		return tripPayment;
	}

	public void setTripPayment() {
		this.tripPayment = (paymentForTheTotalMilesDriven + driverExtraStopPayment_forThisTrip_inDollars
				+ driverTrailerLoadingFee_forEachTrip_inDollars);
	}
}
