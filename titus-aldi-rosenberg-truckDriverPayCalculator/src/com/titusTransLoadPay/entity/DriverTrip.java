package com.titusTransLoadPay.entity;

import java.util.ArrayList;
import java.util.List;

public class DriverTrip {

	private String tripDate;

	private int numberOfStops;

	private List<AldiStores> stores;

	public void addStores(AldiStores theStore) {

		if (stores == null) {
			stores = new ArrayList<AldiStores>();
		}
		stores.add(theStore);
	}

	public DriverTrip(String tripDate, int numberOfStops, List<AldiStores> stores) {
		this.tripDate = tripDate;
		this.numberOfStops = numberOfStops;
		this.stores = stores;
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
		return stores;
	}

	public void setStores(List<AldiStores> stores) {
		this.stores = stores;
	}

}
