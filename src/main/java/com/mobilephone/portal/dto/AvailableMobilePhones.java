package com.mobilephone.portal.dto;

public enum AvailableMobilePhones {
	SAMSUNG_GALAXY_S9("Samsung Galaxy S9", 10), 
	SAMSUNG_GALAXY_S8("Samsung Galaxy S8", 20),
	SAMSUNG_GALAXY_S7("Samsung Galaxy S7", 30), 
	MOTOROLA_NEXUS_6("Motorola Nexus 6", 40), 
	LG_NEXUS_5X("LG Nexus 5X", 50),
	HUWAEI_HONOR_7X("Huawei Honor 7X", 60), 
	APPLE_IPHONE_X("Apple iPhone X", 70), 
	APPLE_IPHONE_8("Apple iPhone 8", 80),
	APPLE_IPHONE_4S("Apple iPhone 4s", 90), 
	NOKIA_3310("Nokia 3310", 100);

	private AvailableMobilePhones(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}

	private String name;
	private int qty;

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
