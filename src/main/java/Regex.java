public class Regex {

	public static void main(String[] arg) {
		String a = "i19n";
		String[] b = a.split("\\d+");
		for (String s : b) {
			System.out.println(s);
		}
	}
}
