public class TastebudStylist extends Employee {
	public TastebudStylist(String n) {
		super(300, n, "TBStylist");
	}
	
	public void makeShake() {
		setEffectivenessMultiplier(roundify((getEffectivenessMultiplier() + 0.1), 2));
		if (calcChance(10)) { setEffectivenessMultiplier(1); }
	}
	
	public void work() {	
		makeShake();
	}
}