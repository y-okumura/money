package jp.co.nichiwa_system.money;

import static org.junit.Assert.*;
import static jp.co.nichiwa_system.money.Currency.*;

import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void threeDollIsthreeDoll() {
		assertEquals(new Money(3, USD), new Money(3, USD));
	}
	
	@Test
	public void threeDollNotEqualfourDoll() {
		assertNotEquals(new Money(3, USD), new Money(4, USD));
	}
	
	@Test
	public void threeDollNotTreeYen() {
		assertNotEquals(new Money(3, USD), new Money(3, JPY));
	}
}
