import java.util.Random;

public class Simulator {
	private Employee[] workers;
	
	public Simulator() {
		initWorkers();
		//months
		for (int m = 0; m < 6; m++) {
			//weeks
			for (int w = 0; w < 4; w++) {
				//days
				for (int d = 0; d < 5; d++) {
					for (int q = 0; q < workers.length; q++) {
						workers[q].work();
					}
				}
				//add weekly work to the total pay
				for (int q = 0; q < workers.length; q++) {
					workers[q].earnPaycheck();
				}
			}
			Random randObj = new Random();
			int rand = randObj.nextInt(workers.length);
			workers[rand].earnBonus(150);
			System.out.println(workers[rand].getName()+" won the bonus!");
		}
		System.out.println("");
		System.out.println("Outcome:");
		for (int q = 0; q < workers.length; q++) {
			System.out.println(workers[q]);
		}
	}
	
	public void passWeek() {
		for (int i = 0; i < 5; i++) {
			for (int q = 0; q < workers.length; q++) {
				workers[q].work();
			}
		}
	} 
	
	public void initWorkers() {
		workers = new Employee[6];
		workers[0] = new TastebudStylist("Tom");
		workers[1] = new Moover("Bill");
		workers[2] = new Shaker("Joe");
		workers[3] = new TastebudStylist("Susie");
		workers[4] = new Moover("Sarah");
		workers[5] = new Shaker("Sally");
	}
	
	public static void main(String[] args) {
		Simulator s = new Simulator();
	}
}