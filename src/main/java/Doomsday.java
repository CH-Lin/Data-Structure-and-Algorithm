import java.util.Calendar;

public class Doomsday {

	final int baseZeroYear = 2000;
	final int baseZeroDay = 2;

	int each100Year[] = { 2, 0, 5, 3 };
	int dooms[][] = { { 4, 5, 6, 7, 8, 9, 10, 11, 12 }, {} };

	public int find(int year, int month, int day) {

		int each100 = ((year - baseZeroYear) / 100) % 4;

		int zeroDay = each100Year[each100];
		int zeroYear = 0;

		int yearInterval = year - ((year / 100) * 100);

		zeroDay += yearInterval / 12;

		zeroYear = ((year / 100) * 100) + ((yearInterval / 12) * 12);

		System.out.println(zeroYear + "\t" + zeroDay);

		for (int i = zeroYear + 1; i <= year; i++) {
			zeroDay++;
			if (i % 4 == 0)
				zeroDay++;

			System.out.println(i + "\t" + zeroDay);
		}

		return zeroDay % 7;
	}

	// Gauss' algorithm
	public int gauss(int year, int month, int day) {
		if (month <= 2)
			year--;
		month -= 2;
		if (month <= 0) {
			month += 12;
		}

		int c = year / 100;

		return (day + ((int) (2.6 * month - 0.2)) + 5 * ((year % 100) % 4) + 3
				* (year % 100) + 5 * (c % 4)) % 7;
	}

	public static void main(String[] args) {

		int year = 2000;
		int month = 12;
		int day = 31;

		System.out.println(new Doomsday().gauss(year, month, day));

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, day);

		System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
	}

}
