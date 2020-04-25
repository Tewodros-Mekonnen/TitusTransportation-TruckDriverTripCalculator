package com.titusTransLoadPay.entity;

public class AldiStores {

	private final int[] storeMiles = { 0, 48, 118, 149, 67, 85, 46, 118, 55, 60, 31, 92, 84 };

	private int storeNumber;

	private int storeRoundTripDistanceFromWarehouseInMiles;

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

	public int getStoreRoundTripDistanceFromWarehouseInMiles() {
		return storeRoundTripDistanceFromWarehouseInMiles;
	}

	public void setStoreRoundTripDistanceFromWarehouseInMiles(int storeNumber) {
		this.storeRoundTripDistanceFromWarehouseInMiles = storeMiles[storeNumber];
	}

}
