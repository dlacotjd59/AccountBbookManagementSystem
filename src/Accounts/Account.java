package Accounts;

public abstract class Account {
	
	public MoneyKind kind = MoneyKind.PartTimeJob;
	String name;
	int money;
	public Account() {
	}
	public Account(int money) {
		this.money = money;
	}
	public Account(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	public MoneyKind getKind() {
		return kind;
	}
	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public abstract void printInfo();
}