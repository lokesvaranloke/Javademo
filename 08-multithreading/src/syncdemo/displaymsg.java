package syncdemo;

public class displaymsg {

	public synchronized void sayhello(String name) {
		
		String tname = Thread.currentThread().getName();
		
		for (int i=1;i<=10;i++) {
			System.out.println(tname+": "+i+" How are you " +name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
