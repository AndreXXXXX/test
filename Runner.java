public class Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainPanel panel = new MainPanel();
	
		try {
		while (true) {
			panel.repaint();
			Thread.sleep(30);
		}
	} catch ( Exception e) {
		System.out.println("");
	}
			
	} 
}
