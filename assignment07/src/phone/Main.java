package phone;

import javax.swing.SwingUtilities;

public class Main {
	private static String ownerNumber = "12345678901";
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	        	 UI ui = new UI();
	     		Listener listen = new Listener(ui, ownerNumber);
	     		
	     		listen.forLogin();
	     		listen.forDial();
	         }
	     });
	}
	 
}
