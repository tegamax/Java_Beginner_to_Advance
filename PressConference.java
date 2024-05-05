public class PressConference {

	public static void newsOutlet() {
		String [] newsOutlet = {"abc","bbc","CNN","CBS","AP","NBC","FOX","npr","sky","Aljazera"};
		double lucky = Math.random();
		lucky *= 10;
		int luckyIndex = (int) lucky;
		System.out.println(newsOutlet[luckyIndex]);
	}

	public static void main(String[] args) {
		newsOutlet();
	}
}