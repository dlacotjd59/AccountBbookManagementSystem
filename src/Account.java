
public class Account {
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
	public void printInfo() {
		System.out.println("money : " + money + "   " + "name : " + name);
	}
}

