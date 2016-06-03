public class dowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		even_odd();
		leap_year(2016, 2050);
	}

	private static void even_odd() {
		int num = 1;
		String flag = "";
		while (num <= 10)

		{
			if (num % 2 == 0) {
				flag = "even";
			} else if (num % 2 == 1) {
				flag = "odd";
			}

			System.out.println(num + flag);
			num++;
		}

	}

	private static void leap_year(int a, int b) {
		for (int i = a; a <= 2050; a += 4) {
			if (a % 4 == 0 && a % 100 != 0) {
				System.out.println(a + "is a leap year");
			} else if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
				System.out.println(a + "is a leap year");
			}
		}

	}

}
