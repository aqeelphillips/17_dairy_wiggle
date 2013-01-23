import java.util.Random;

public abstract class Employee {
	public double effectivenessMultiplier;
	private double baseWeeklySalary;
	private double totalPaymentToDate;
	private String name;
	private String job;
	
	public Employee(double bws, String n, String j) {
		effectivenessMultiplier = 1;
		baseWeeklySalary = bws;
		totalPaymentToDate = 0;
		name = n;
		job = j;
	}
	
	public abstract void work();
	
	public void earnPaycheck() {
		double weeksPay = roundify((getBaseWeeklySalary() * getEffectivenessMultiplier()),0);
		setTotalPaymentToDate(weeksPay + getTotalPaymentToDate());
		setEffectivenessMultiplier(1);
	}
	
	public void earnBonus(double amt) {
		setTotalPaymentToDate(amt + getTotalPaymentToDate());
	}
	
	public boolean calcChance(double pct) {
		Random randObj = new Random();
		int rand = randObj.nextInt(100);
		double chance = Double.parseDouble(Integer.toString(rand)); ;
		return chance <= pct;
	}
	
	public String toString() {
		/* String str = name+": "+job+". Base salary: "+baseWeeklySalary+". Earned this week: "+(baseWeeklySalary * effectivenessMultiplier)+". Effectiveness: "+effectivenessMultiplier; */
		String str =  name+": "+job+". Base salary: $"+baseWeeklySalary+". Total earnings: $"+totalPaymentToDate;
		return str;
	}
	
	public double roundify(double inp, int decimalPlaces) {
		double multiplier = Math.pow(10, decimalPlaces);
		return (double)Math.round(inp * multiplier) / multiplier;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String s) {
		job = s;
	}
	
	public double getEffectivenessMultiplier() {
		return effectivenessMultiplier;
	}
	public void setEffectivenessMultiplier(double d) {
		effectivenessMultiplier = d;
	}
	
	public double getBaseWeeklySalary() {
		return baseWeeklySalary;
	}
	public void setBaseWeeklySalary(double d) {
		baseWeeklySalary = d;
	}
	
	public double getTotalPaymentToDate() {
		return totalPaymentToDate;
	}
	public void setTotalPaymentToDate(double d) {
		totalPaymentToDate = d;
	}
}