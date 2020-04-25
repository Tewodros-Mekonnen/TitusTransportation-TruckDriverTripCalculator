package com.titusTransLoadPay.entity;

public class AldiStores {

	// each value in a specific index is equal to the round trip distance(in miles), for all stores served by Rosenberg warehouse.
	// e.x. index-1 = store-1, index-2 = store-2, etc...
	
	private final double[] storeMiles = { 0, 48, 117.8, 149, 66.6, 84.8, 46.4, 118, 54.8, 59.6, 31.2, 91.6, 83.8, 76.4,
			110, 95.6, 115, 94, 64.4, 17.8, 38.2, 134, 134, 0, 0, 352, 0, 0, 0, 0, 26, 207, 57, 0, 84.6, 120, 40, 146,
			119.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 109.4, 44.6, 0, 114, 0, 108, 186, 92.2, 80, 108, 45.4, 117.8,
			97.6, 0, 106, 0, 117.4, 0, 0, 0, 0, 93.4, 0, 0, 304, 82, 212.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 352, 0, 0, 0, 0,
			0, 0, 85, 0, 314 };

	private int storeNumber;

	private double storeRoundTripDistanceFromWarehouseInMiles;

	public AldiStores(int storeNumber) {
		this.storeNumber = storeNumber;
		this.storeRoundTripDistanceFromWarehouseInMiles = storeMiles[storeNumber];
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public double getStoreRoundTripDistanceFromWarehouseInMiles() {
		return storeRoundTripDistanceFromWarehouseInMiles;
	}

	public void setStoreRoundTripDistanceFromWarehouseInMiles(int storeNumber) {
		this.storeRoundTripDistanceFromWarehouseInMiles = storeMiles[storeNumber];
	}

}
