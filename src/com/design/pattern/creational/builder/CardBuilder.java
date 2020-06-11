package com.design.pattern.creational.builder;

public class CardBuilder {
	
//	Required Attribute
	private String cardType;
	private String cardNumber;
	private String cardHolderName;
	private String cardIssuerBank;
	
//	Optional Attribute
	private String linkedAccountNumber;
	private String cardPin;
	private Long linkedMobileNumber;
	
	/**
	 * @param cardType
	 * @param cardNumber
	 * @param cardHolderName
	 * @param cardIssuerBank
	 */
	public CardBuilder(String cardType, String cardNumber, String cardHolderName, String cardIssuerBank) {
		super();
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cardIssuerBank = cardIssuerBank;
	}

	public CardBuilder setLinkedAccountNumber(String linkedAccountNumber) {
		this.linkedAccountNumber = linkedAccountNumber;
		return this;
	}
	
	public CardBuilder setCardPin(String cardPin) {
		this.cardPin = cardPin;
		return this;
	}
	
	public CardBuilder setLinkedMobileNumber(Long linkedMobileNumber) {
		this.linkedMobileNumber = linkedMobileNumber;
		return this;
	}
	
	public Card build() {
		return new Card(cardType, cardNumber, cardHolderName, cardIssuerBank, linkedAccountNumber, cardPin, linkedMobileNumber);
	}
}
