package day2.inhertitant;

public class Report {
	public static void main(String[] args) {
		BaseReport report1 = new Report1();
		report1.process();
	}
}

abstract class BaseReport {	
	public abstract void generateTitle();
	public abstract void generateFooter();
	public void process() {
		generateTitle();
		generateFooter();
	}
}
class Report1 extends BaseReport {

	@Override
	public void generateTitle() {
	}

	@Override
	public void generateFooter() {
	}
	
	public void xxx() {}
	
}

