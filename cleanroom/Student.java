public class Student {
	int testVariable = 0;
	int __cleanVariable = 0;

	public int foo() {
		return 4711 + __cleanVariable + testVariable;
	}

	public double bar() {
		return 4711.0815 + testVariable;
	}

	public String baz() {
		return "I am nice.";
	}

	public String foobar() {
		return "I am dangerous.";
	}

	public static Object getNull() {
		return null;
	}

	public static String doNull() {
		return "";
	}

	public static void recur(int i) {
		recur(i - 1);
	}
	
	public static void recur(int i, double d) {
		recur(i - 1);
	}

	public static void ioob() {
		int a[] = new int[10];
		a[a.length + 32]++;
	}

	public Student() {
	}

	public Student(int x) {
	}
}

