package com.titusTransLoadPay.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverTrip {

	private String thisTripDate;

	private int numberOfStops;

	private double theFarthestStore_forThisTrip_inMiles;

	private List<Double> collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles;

	private List<AldiStores> storesForThisTrip;

	// a convenient method to be able to add stores in a collection.
	public void addStores(AldiStores theStore) {

		if (storesForThisTrip == null) {
			storesForThisTrip = new ArrayList<AldiStores>();
		}
		storesForThisTrip.add(theStore);
	}

	public DriverTrip() {

	}

	public DriverTrip(int numberOfStops, List<AldiStores> stores) {
		this.numberOfStops = numberOfStops;
		this.storesForThisTrip = stores;
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

	public List<AldiStores> getStores() {
		return storesForThisTrip;
	}

	public void setStores(List<AldiStores> stores) {
		this.storesForThisTrip = stores;
	}

	public double getTheFarthestStore_forThisTripInMiles() {

		return theFarthestStore_forThisTrip_inMiles;
	}

	// setTheFarthestStore_forThisTripInMiles method reads the given stores for a
	// specific trip and then it matches the right round trip mile
	// for a given store using its store number (as described in AldiStores.java)
	// and then it creates a collection of
	// round trip miles, then it takes the maximum mile
	// from this collection and assigns it to theFarthestStore_forThisTrip_inMiles
	// field.
	// this field (theFarthestStore_forThisTrip_inMiles) is essential to calculate
	// driver's pay for a given trip.

	/**
	 * @param numberOfStores, number of stores to deliver in a single trip
	 * @param stores,         stores to deliver in a given trip
	 */
	public void setTheFarthestStore_forThisTripInMiles(int numberOfStores, List<AldiStores> stores) {

		double theFarthestStore_OfThisTrip_inMiles;

		for (int i = 0; i <= numberOfStores; i++) {

			if (collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles == null) {
				collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles = new ArrayList<Double>();
			}
			collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles
					.add(stores.get(i).getStoreRoundTripDistanceFromWarehouseInMiles());
		}

		theFarthestStore_OfThisTrip_inMiles = Collections
				.max(collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles);
		theFarthestStore_forThisTrip_inMiles = theFarthestStore_OfThisTrip_inMiles;
	}

	@Override
	public String toString() {
		return "DriverTrip [thisTripDate=" + thisTripDate + ", numberOfStops=" + numberOfStops
				+ ", theFarthestStore_forThisTripInMiles=" + theFarthestStore_forThisTrip_inMiles
				+ ", storesForThisTrip=" + storesForThisTrip
				+ ", collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles="
				+ collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles + "]";
	}

}
