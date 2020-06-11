package com.design.pattern.creational.builder;

public class Card {
	
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
	 * @param linkedAccountNumber
	 * @param cardPin
	 * @param linkedMobileNumber
	 */
	public Card(String cardType, String cardNumber, String cardHolderName, String cardIssuerBank,
			String linkedAccountNumber, String cardPin, Long linkedMobileNumber) {
		super();
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cardIssuerBank = cardIssuerBank;
		this.linkedAccountNumber = linkedAccountNumber;
		this.cardPin = cardPin;
		this.linkedMobileNumber = linkedMobileNumber;
	}
	
	public String getCardType() {
		return cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCardIssuerBank() {
		return cardIssuerBank;
	}

	public String getLinkedAccountNumber() {
		return linkedAccountNumber;
	}

	public String getCardPin() {
		return cardPin;
	}

	public Long getLinkedMobileNumber() {
		return linkedMobileNumber;
	}

	@Override
	public String toString() {
		return "Card [cardType=" + cardType + ", cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName
				+ ", cardIssuerBank=" + cardIssuerBank + ", linkedAccountNumber=" + linkedAccountNumber + ", cardPin="
				+ cardPin + ", linkedMobileNumber=" + linkedMobileNumber + "]";
	}
	
}
