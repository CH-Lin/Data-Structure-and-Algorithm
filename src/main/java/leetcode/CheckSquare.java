package leetcode;

public class CheckSquare {

	private int distance(CheckSquarePoint p1, CheckSquarePoint p2) {
		return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
	}

	public boolean check(CheckSquarePoint p1, CheckSquarePoint p2, CheckSquarePoint p3, CheckSquarePoint p4) {
		int d2 = distance(p1, p2);
		int d3 = distance(p1, p3);
		int d4 = distance(p1, p4);

		if (d2 == d3 && 2 * d2 == d4) {
			int d = distance(p2, p4);
			return (d == distance(p3, p4)) && d == d2;
		}

		if (d2 == d4 && 2 * d2 == d3) {
			int d = distance(p2, p3);
			return (d == distance(p3, p4)) && d == d2;
		}

		if (d3 == d4 && 2 * d3 == d2) {
			int d = distance(p2, p3);
			return (d == distance(p2, p4)) && d == d3;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckSquarePoint points[] = { new CheckSquarePoint(10, 10), new CheckSquarePoint(15, 15), new CheckSquarePoint(15, 5), new CheckSquarePoint(20, 10) };
		System.out.println(new CheckSquare().check(points[0], points[1], points[2], points[3]));
	}

}
