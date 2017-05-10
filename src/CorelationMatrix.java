package tutorial;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CorelationMatrix {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		double arr[][];
		arr = new double[3][3];
		for (int i=0; i < 3; i++) {
			for (int j = 0;j < 3;j++) {
				arr[i][j] = Double.valueOf(br.readLine());
			}
		}
		double standardDeviation[][];
		standardDeviation = new double[3][3];
		for (int i=0; i < 3; i++) {
			for (int j = 0;j < 3;j++) {
				if (i == j) {
					standardDeviation[i][j] = 1/Math.sqrt(arr[i][j]);					
				}
			}
		}
		double result[][];
		result = new double[3][3];
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] = result[i][j] + arr[i][k] * standardDeviation[k][j];
                }
            }
        }
        double result1[][];
		result1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result1[i][j] = result1[i][j] + result[i][k] * standardDeviation[k][j];
                }
            }
        }
        for (int i=0; i < 3; i++) {
			for (int j = 0;j < 3;j++) {
				System.out.print(result1[i][j] + "  ");
			}
			System.out.println();
		}
	}
}