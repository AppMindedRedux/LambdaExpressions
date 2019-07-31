package be.intecbrussel.TextPrinter;

@FunctionalInterface
public interface WordFilter {

	public boolean isValid(String s);
}
