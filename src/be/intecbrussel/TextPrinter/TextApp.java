package be.intecbrussel.TextPrinter;

public class TextApp {

	public static void main(String[] args) {
		
		TextPrinter tx1 = new TextPrinter("Dag beste mensen!");
		
		System.out.println("*** Words containing 'e' ***");

		tx1.printFilteredWords(new WordFilter() {
			
			@Override
			public boolean isValid(String s) {
				
				System.out.println("s = " + s);
				return s.contains("e");
				
				
			}
			
		});
		
		System.out.println();
		
		System.out.println("*** Long words ***");
		
		tx1.printFilteredWords(new WordFilter() {
			
			@Override
			public boolean isValid(String s) {
				
				return s.length() > 4;
			}
		});
		
		System.out.println();
		
		System.out.println("*** Words starting with 'b' ***");
		
		tx1.printFilteredWords(new WordFilter() {
			
			@Override
			public boolean isValid(String s) {
				
				return s.startsWith("b");
			}
		});
		
		
		
	}
}
