import java.util.*;

public class YoungPhysicst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][3];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		boolean flag = true;
		for(int i = 0; i<3; i++) {
			int sum = 0;
			for(int j =0; j<n; j++) {
				 sum += mat[j][0];
			}
			if(sum != 0) {
				System.out.println("NO");
				flag = false;
				break;
			}
		}
		if(flag)System.out.println("YES");
	}

}
