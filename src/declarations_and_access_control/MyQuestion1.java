public class MyQuestion1 {

	public static void Main(String[] args) {
		
		System.out.printf(" Prints %s...", args[1]);
	}

	public static void main(String[] args) {
		
		main(new String[][]{ {"Hello", "World"} , {"Hello World", "."} });
	}
	
	public static void main(String[] args[]) {
		
		System.out.printf("Doesn't print %s%s", args[0][0], args[1][1]);
		Main(new String[]{"\n", "World"});
		main(new String[][]{{"Hello World"}});
	}
}