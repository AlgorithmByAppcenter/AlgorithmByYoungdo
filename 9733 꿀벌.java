import java.util.Scanner;

public class honeybee {
	public static void main(String[] args){
		String beeJobs[] = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
		double percent = 0;
		double number = 0;
		Scanner scan = new Scanner(System.in);
		String str = "Cc Pt Pt Re Tb Re Cm Cm Re Pt Pt Re Ea Ea Pt Pt Pt Re Re Cb Cb Pt Pt Cb";
		String Jobs[] = str.split(" ");
		System.out.println("\n");
		for(int j = 0; j<beeJobs.length; j++){
			for(int k = 0; k<Jobs.length; k++){
				if(beeJobs[j].equals(Jobs[k])){
					number++;
				}
				//System.out.println(Jobs[k]);
			}
			percent = Double.parseDouble(String.format("%.2f", number/Jobs.length));
			number = Double.parseDouble(String.format("%.0f",number));
			System.out.println(beeJobs[j] + " " + number + " " + percent);
			number = 0; 
		}
		System.out.println("Total" + " " + Jobs.length + " " + 1);
	}
}