package check;

public class Check {
	private String firstName;
	private String lastName;
	
	public static void main(String[] args) {
		String firstName, lastName;
		firstName = "德永";
		lastName = "拳一";
		printName(firstName, lastName);
		
		Pet pet = new Pet("java吉", "hoge");
		pet.introduce();
		
		RobotPet robotPet = new RobotPet("R2D2","ルーク");
		robotPet.introduce();
	}

	private static void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}
	

}