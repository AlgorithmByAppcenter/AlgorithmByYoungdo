import java.util.ArrayList;
import java.util.Scanner;

public class hongFence {
	static ArrayList<Integer> area = new ArrayList<Integer>();

	public minInfo min(ArrayList<Integer> array) {
		int min = 0, index = 0;
		min = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (min > array.get(i)) {
				min = array.get(i);
				index = i;
			}
		}
		minInfo mininfo = new minInfo(min, index);
		return mininfo;

	}

	public int max(ArrayList<Integer> array) {
		int max = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (max < array.get(i)) {
				max = array.get(i);
			}
		}
		return max;
	}

	public ArrayList division(ArrayList<Integer> array, int RollerWidth) {
		ArrayList<Integer> R_List = new ArrayList<Integer>();
		ArrayList<Integer> L_List = new ArrayList<Integer>();
		hongFence histo = new hongFence();
		minInfo currentInfo;
		currentInfo = histo.min(array);
		//area.add(array.size() * currentInfo.getmin());
		if (!array.isEmpty()) {
			for (int i = 0; i < currentInfo.getindex(); i++) {
				L_List.add(array.get(i));
			}
			if (!L_List.isEmpty()) {
				currentInfo = histo.min(L_List);
				if (L_List.size() == RollerWidth) {
					area.add(currentInfo.getmin() * L_List.size());
				}
				histo.division(L_List, RollerWidth);
			}
		}
		currentInfo = histo.min(array);
		if (!array.isEmpty()) {
			for (int i = currentInfo.getindex() + 1; i < array.size(); i++) {
				R_List.add(array.get(i));
			}
			if (!R_List.isEmpty()) {
				currentInfo = histo.min(R_List);
				if (R_List.size() == RollerWidth) {
					area.add(currentInfo.getmin() * R_List.size());
				}
				histo.division(R_List, RollerWidth);
			}
		}

		return area;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		minInfo currentInfo;
		hongFence histo = new hongFence();
		ArrayList<Integer> S_List = new ArrayList<Integer>();
		ArrayList<Integer> R_List = new ArrayList<Integer>();
		ArrayList<Integer> L_List = new ArrayList<Integer>();
		ArrayList<Integer> area = new ArrayList<Integer>();
		int width = scan.nextInt();
		int RollerWidth = scan.nextInt();
		for (int i = 0; i < width; i++) {
			S_List.add(scan.nextInt());
		}
		System.out.println(histo.division(S_List, RollerWidth));
	}
}
