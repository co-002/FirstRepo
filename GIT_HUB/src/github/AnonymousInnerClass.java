package github;

abstract class Test1{
	abstract void method1();
}

interface Test2{
	void method2();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Test1 test1 = new Test1() {
			void method1() {
				System.out.println("Overriding the method of Test1 class");
			}
		};
		Test2 test2 = new Test2() {
			@Override
			public void method2() {
				System.out.println("Overiding the method of interface Test2");
			}
		};
		test1.method1();
		test2.method2();
	}
}
