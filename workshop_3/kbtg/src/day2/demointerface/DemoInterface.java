package day2.demointerface;

public class DemoInterface 
    implements AddListerner {
	public static void main(String[] args) {
		DemoInterface d = new DemoInterface();
		d.start();
	}

	private void start() {
		AddOperation a = new AddOperation();
		a.setListener(this);
		a.process(1, 2);
	}

	@Override
	public void onSuccess(int result) {
		System.out.println("Result=" + result);
	}
}

interface AddListerner {
	void onSuccess(int result);
}

class AddOperation {
	private AddListerner l;
	public void setListener(AddListerner l) {
		this.l = l;
	}
	public void process(int a, int b) {
		int result = a + b;
		l.onSuccess(result);
	}
}
