import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void minHops(ArrayList<Integer> array) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int l = 0, h = array.size();

		if (h == 0 || array.get(0) == 0) {
			System.out.println("fail");
			return;
		}

		result.add(0);

		while (l + array.get(l) < h) {
			int record = -1;
			int max = 0;
			for (int i = l + 1; i <= l + array.get(l); i++) {
				if (array.get(i) == 0)
					continue;
				int temp = i + array.get(i);
				if (temp > max) {
					max = temp;
					record = i;
				}
			}

			if (record == -1 || array.get(record) == 0) {
				System.out.println("fail");
				return;
			}

			result.add(record);
			l = record;
		}
		for (int i : result) {
			System.out.print(i + ", ");
		}
		System.out.println("out");
	}

	public static void main(String[] args) {
		String fileName = args[0];
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.length() == 0)
					break;
				int val = Integer.parseInt(line);
				list.add(val);
			}
			minHops(list);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
