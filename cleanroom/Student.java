public class Student {
	public int foo() {
		return 4711;
	}

	public double bar() {
		return 4711.0815;
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

	public static void recur() {
		recur();
	}

	public static void ioob() {
		int a[] = new int[10];
		a[a.length + 32]++;
	}
}