package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
//		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test 
	public void getBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct_RemainingBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("deduct()", "Remaining Balance:  90.00", card.deduct(10));
	}
	
	@Test
	public void deduct_NegAmount()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("deduct()", "Invalid Transaction", card.deduct(-10));
	}
	
	@Test
	public void deduct_NegBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("deduct()", "Amount Due:  10.00", card.deduct(110));
	}
	
	@Test
	public void constructor_OpeningBalance_Low()
	{
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1,-100.00);});
	}
	
	@Test
	public void constructor_IncorrectID_Low()
	{
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1,100.00);});
	}
	
//	@Test
//	public void constructor_IncorrectID_High()
//	{
//		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(10000,100.00);});
//	}
}