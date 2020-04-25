package com.titusTransLoadPay.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverTrip {

	private String tripDate;

	private int numberOfStops;

	private int theFarthestStore_forThisTripInMiles;

	private List<AldiStores> storesForThisTrip;

	public void addStores(AldiStores theStore) {

		if (storesForThisTrip == null) {
			storesForThisTrip = new ArrayList<AldiStores>();
		}
		storesForThisTrip.add(theStore);
	}

	private List<Integer> collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles;

	public DriverTrip(String tripDate, int numberOfStops, List<AldiStores> stores) {
		this.tripDate = tripDate;
		this.numberOfStops = numberOfStops;
		this.storesForThisTrip = stores;
	}

	public String getTripDate() {
		return tripDate;
	}

	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
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

	public int getTheFarthestStore() {

		return theFarthestStore_forThisTripInMiles;
	}

	public void setTheFarthestStore(int numberOfStores, List<AldiStores> stores) {

		int farthestStoreOfTheTripInMiles;

		for (int i = 0; i <= numberOfStores; i++) {

			if (collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles == null) {
				collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles = new ArrayList<Integer>();
			}
			collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles
					.add(stores.get(i).getStoreRoundTripDistanceFromWarehouseInMiles());
		}

		farthestStoreOfTheTripInMiles = Collections
				.max(collectionOfStoresRoundTripDistanceFromRosenbergWarehouseInMiles);
		theFarthestStore_forThisTripInMiles = farthestStoreOfTheTripInMiles;
	}

}
