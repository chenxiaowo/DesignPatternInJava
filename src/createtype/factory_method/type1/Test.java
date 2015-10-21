package createtype.factory_method.type1;

public class Test {

	public static void main(String[] args) {
		
		SportsSchool school = new SportsSchool();
		Player player = school.educate("Basketball");
		player.play();
		player = school.educate("TableTennis");
		player.play();

	}

}
