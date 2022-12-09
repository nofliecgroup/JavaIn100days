
public class StringBuilderDemo {

	public static void main(String[] args) {
		final int n = 22;
		final String y = "Hakuna Matata\n";
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			builder.append(y);
		}
		String result = builder.toString();
		
		System.out.println(result);

	}

}
