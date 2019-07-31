package be.intecbrussel.LambdaExpressions;

interface Abc {
	final int A = 10;
	void show();
}

public class InterFaceDemo implements Abc {

	public static void main(String[] args) {

		Abc obj = new Abc() {
			
			public void show() {
				System.out.println("Im' the Best");
				System.out.println(A);
			}
		};
		
		obj.show();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
