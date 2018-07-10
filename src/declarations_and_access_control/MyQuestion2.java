abstract interface Interface {
	
	public static void main(String[] args) {
		
		System.out.println("Did you enjoy the first question?");
	}
}

class Class {
	
	public static void main(String[] args) {

		if(args.length > 0) {
			args[0] = "Here's another one!";
			System.out.println(args[0]);
		}
	}
}

public class MyQuestion2 extends Class implements Interface {

	public void main(String args) {
		
		Interface.main(null);
		super.main(new String[]{"At least it's the last one"});
		this.main("Or is it?");
	}
}