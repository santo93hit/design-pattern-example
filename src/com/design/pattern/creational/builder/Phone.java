package com.design.pattern.creational.builder;

public class Phone {
	
//	Required Attribute
	private String operatingSystem;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
//	Optional Attribute
	private boolean isQuardCamera;
	private String madeIn;
	private String brand;
	
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public int getRam() {
		return ram;
	}

	public String getProcessor() {
		return processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public boolean isQuardCamera() {
		return isQuardCamera;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Phone [operatingSystem=" + operatingSystem + ", ram=" + ram + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", battery=" + battery + ", isQuardCamera=" + isQuardCamera
				+ ", madeIn=" + madeIn + ", brand=" + brand + "]";
	}

	/**
	 * @param operatingSystem
	 * @param ram
	 * @param processor
	 * @param screenSize
	 * @param battery
	 */
	private Phone(PhoneBuilder phoneBuilder) {
		super();
		this.operatingSystem = phoneBuilder.operatingSystem;
		this.ram = phoneBuilder.ram;
		this.processor = phoneBuilder.processor;
		this.screenSize = phoneBuilder.screenSize;
		this.battery = phoneBuilder.battery;
		this.isQuardCamera = phoneBuilder.isQuardCamera;
		this.madeIn = phoneBuilder.madeIn;
	}
	
	// Builder Class
	public static class PhoneBuilder{
//		Required Attribute
		private String operatingSystem;
		private int ram;
		private String processor;
		private double screenSize;
		private int battery;
		
//		Optional Attribute
		private boolean isQuardCamera;
		private String madeIn;
		private String brand;
		/**
		 * @param operatingSystem
		 * @param ram
		 * @param processor
		 * @param screenSize
		 * @param battery
		 */
		public PhoneBuilder(String operatingSystem, int ram, String processor, double screenSize, int battery) {
			super();
			this.operatingSystem = operatingSystem;
			this.ram = ram;
			this.processor = processor;
			this.screenSize = screenSize;
			this.battery = battery;
		}
		
		public PhoneBuilder setQuardCamera(boolean isQuardCamera) {
			this.isQuardCamera = isQuardCamera;
			return this;
		}
		
		public PhoneBuilder setMadeIn(String madeIn) {
			this.madeIn = madeIn;
			return this;
		}
		
		public PhoneBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Phone build() {
			return new Phone(this);
		}
	}
	
}
