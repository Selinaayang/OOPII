//A1063308
public class week3HW implements Runnable {
	private static int totalTicket = 10000;
	private int ticket;
	private Thread t;

	week3HW(String name) {
		ticket = 0;
		t = new Thread(this, name);
		t.start();
	}

	public synchronized void run() {
		while (haveTicket() == true) {
			int r = (int) (Math.random() * 4) + 1;

			if (totalTicket <= 0) {
				break;
			} else if (totalTicket >= r) {
				ticket = ticket + r;
				totalTicket = totalTicket - r;
			} else if (totalTicket < r) {
				r = 0;
				ticket = ticket + totalTicket;
				totalTicket = 0;
				break;
			}
			System.out.println(t.getName() + "買到" + ticket + "張票");
		}

		System.out.println(t.getName() + "總共買到" + ticket + "張票");
		// System.out.println("還剩下" + totalTicket + "張車票");
	}

	private static boolean haveTicket() {
		if (totalTicket > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week3HW A = new week3HW("機台A");
		week3HW B = new week3HW("機台B");
		week3HW C = new week3HW("機台C");
		week3HW D = new week3HW("機台D");
	}

}
