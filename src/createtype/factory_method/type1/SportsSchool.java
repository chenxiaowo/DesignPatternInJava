package createtype.factory_method.type1;

public class SportsSchool {
	public Player educate(String type) {
		if ("Basketball".equals(type)) {
			return new BasketballPlayer();
		} else if ("TableTennis".equals(type)) {
			return new TableTennisPlayer();
		} else {
			System.out.println("type is error.");
			return null;
		}
	}
}
