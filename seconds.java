public class Seconds {
	public static void main(String[] args) {
		int totalSeconds = 185;
		
		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;
		
		System.out.println("Minutes = " + minutes);
		System.out.println("Remaining Seconds = " + seconds);
		
				}
}