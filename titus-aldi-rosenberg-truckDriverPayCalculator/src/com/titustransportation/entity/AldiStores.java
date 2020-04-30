package com.titustransportation.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aldi_stores")
public class AldiStores {

	// each value in a specific index is equal to the round trip distance(in miles), which means, 
	// for all stores served by Rosenberg warehouse.
	// e.x. index-1 = store-1, index-2 = store-2, etc...
	private final double[] storeMiles = { 0, 48, 117.8, 149, 66.6, 84.8, 46.4, 118, 54.8, 59.6, 31.2, 91.6, 83.8, 76.4,
			110, 95.6, 115, 94, 64.4, 17.8, 38.2, 137, 134, 0, 0, 352, 0, 0, 0, 0, 26, 207, 57, 0, 84.6, 120, 40, 146,
			119.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 109.4, 44.6, 0, 114, 0, 108, 186, 92.2, 80, 108, 45.4, 117.8,
			97.6, 0, 106, 0, 117.4, 0, 0, 0, 0, 93.4, 0, 0, 304, 82, 212.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 352, 0, 0, 0, 0,
			0, 0, 85, 0, 314 };

	@Column(name = "store_number")
	private int storeNumber;

	@Column(name = "store_distance")
	private double storeRoundTripDistance_fromWarehouse_inMiles;

	private List<Double> collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles;

	public void addStoreRoundTripDistance(double miles) {
		if (collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles == null) {
			collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles = new ArrayList<Double>();
		}
		collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles.add(miles);
	}

	public AldiStores() {

	}

	public AldiStores(int storeNumber) {
		this.storeNumber = storeNumber;
		this.storeRoundTripDistance_fromWarehouse_inMiles = storeMiles[storeNumber];
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public double getStoreRoundTripDistance_fromWarehouse_inMiles() {
		return storeRoundTripDistance_fromWarehouse_inMiles;
	}

	public void setStoreRoundTripDistance_fromWarehouse_inMiles(int storeNumber) {
		this.storeRoundTripDistance_fromWarehouse_inMiles = storeMiles[storeNumber];
	}

	public List<Double> getCollectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles() {
		return collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles;
	}

	public void setCollectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles(
			List<Double> collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles) {
		this.collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles = collectionOfStores_roundTripDistance_fromRosenbergWarehouse_inMiles;
	}
}
