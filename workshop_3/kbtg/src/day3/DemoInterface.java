package day3;

interface V1 {
	void method1();
}

interface V21 extends V1, V2 {
	void method1();
}

interface V2 {
	void method2();
}

interface V3 {
	void method1();
	void method2();
}

class DemoInterface
 implements V3{

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
