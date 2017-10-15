package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			if (args[i].equals("")) {
				System.out.println("Hello!");
			} else {
				System.out.println("Hello " + args[i] + "!");
			}
		}
	}
}
