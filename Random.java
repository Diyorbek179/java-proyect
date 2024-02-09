package lessons;

public class Random {
	public static void main(String[] args) {
		boolean isFind = false;
		int totalSumm = 10;
		while (totalSumm > 0) {
			totalSumm = totalSumm - 1;
			int x1 = (int) (Math.random() * 10);
			int x2 = (int) (Math.random() * 10);
			int x3 = (int) (Math.random() * 10);
			int sevenCount = 0;
			StringBuilder sb = new StringBuilder();
			if (x1 == 7) {
				sb.append(x1);
				sevenCount += 1;
			}
			if (x2 == 7) {
				sb.append(x2);
				sevenCount += 1;
			}
			if (x3 == 7) {
				sb.append(x3);
				sevenCount += 1;
			}
			switch (sevenCount) {
			case 1:
				totalSumm = totalSumm + 1;
				break;
			case 2:
				totalSumm = totalSumm + 3;
				break;
			case 3:
				totalSumm = totalSumm + 5;
				break;
			}
			System.out.println(sb);
			System.out.println("mani kissamdagi pullar: " + totalSumm);
		}
	}

}
