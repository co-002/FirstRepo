package github;

class Example{
	void fun(String...values) {
		for(String val : values) {
			System.out.println(val);
		}
	}
}

public class VarArgs {
	public static void main(String[] args) {
		Example e = new Example();
		e.fun("A","B","C","D");
		e.fun("E","F","G","H");
	}
}
