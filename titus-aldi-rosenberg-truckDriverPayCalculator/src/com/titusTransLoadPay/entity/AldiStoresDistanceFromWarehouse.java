package com.titusTransLoadPay.entity;

public class AldiStoresDistanceFromWarehouse {

	private int[] storeMiles = { 0, 48, 118, 149, 67, 85, 46, 118, 55, 60, 31, 92, 84 };

	private int storeRoundTripDistanceInMiles;

	public int getStoreRoundTripDistanceInMiles() {
		return storeRoundTripDistanceInMiles;
	}

	public void setStoreRoundTripDistanceInMiles(int storeNumber) {
		storeRoundTripDistanceInMiles = storeMiles[storeNumber];
	}

}
