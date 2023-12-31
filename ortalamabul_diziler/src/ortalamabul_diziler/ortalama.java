package ortalamabul_diziler;

import java.util.Scanner;

public class ortalama {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		int i;
		int notlar[][]={{10,20,30},{40,50,60},{70,80,90},{10,20,30}};
        float ort[]=new float[3];
        ort = AVG(notlar);
        for(i=0;i<ort.length;i++) {
        	System.out.println((i+1)+".ogrencinin ortalamasi "+ort[i]);
        	
        }
}

public static float[] AVG(int n[][]) {
	float arr[]=new float[n.length];
	int i,j,top=0;
	float avg;
	for(i=0;i<n.length;i++){
		for(j=0;j<n[0].length;j++) {
			top+=n[i][j];
		}
		arr[i]=top/j;
		top=0;
	}
		return arr;
	}
}
