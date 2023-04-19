package com.in28minutes.exception;

class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
		// 이 클래스의 생성자.
		// 생성자는 Exception의 fillInStackTrace 메서드로 간다.
	}
}
class Amounts {

	// state variable
	private String currency;
	private int amount;

	// constructor
	public Amounts(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;

	}

	// behavior
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void add(Amounts that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {// 현재 Amounts와 비교할 that.currency상태가 같지 않다면.
//			throw new RuntimeException("Currencies Don't Match: " + this.currency + " & " + that.currency);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match: " + this.currency + " & " + that.currency);
			// 예외 print 부분
		}
		this.amount += that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}


}


public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amounts usd = new Amounts("USD", 100);
		Amounts kor = new Amounts("Kor", 120);

		try {
			String str = null;
			str.toString();

		} catch (CurrenciesDoNotMatchException e) {
			System.out.println("Handled Exception");
		} catch (Exception e) {
			System.out.println("Handled Exception");
		}
		kor.add(kor);
		System.out.println(kor);

	}

}
