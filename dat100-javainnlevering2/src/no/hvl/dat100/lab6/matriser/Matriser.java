package no.hvl.dat100.lab6.matriser;

public class Matriser {

	
	// a)
	public static void skrivUtv1(int[][] matrise) {
			String output = "{";
			for(int[] i: matrise) {
				output += "{";
				for(int t: i) {
					if(t == i[i.length-1] && i != matrise[matrise.length-1]) {
						output += t + "}, ";
					}
					else if(i == matrise[matrise.length-1] && t == i[i.length-1]) {
						output += t + "}";
					}
					else {
						output += t + ", ";
					}
					
				}
			}
			output += "}";
			System.out.println(output);
	}

		// b)
	public static String tilStreng(int[][] matrise) {
			String strengen = "";
			for(int[] i: matrise) {
				for(int t: i) {
					strengen += t + " ";
					
				}
				strengen += "\n";
			}

			return strengen;
	}

		// c)
	public static int[][] skaler(int tall, int[][] matrise) {
			
			int[][] nyMatrise = new int[matrise.length][matrise[0].length];
			for(int i = 0; i < matrise.length; i++) {
				for(int t = 0; t < matrise[i].length; t++) {
					nyMatrise[i][t] = matrise[i][t] * tall;
				}
			}
			
			return nyMatrise;
		
	}

		// d)
	public static boolean erLik(int[][] a, int[][] b) {
			boolean ernLik = true;
			
			for(int i = 0; i < a.length; i++) {
				for(int t = 0; t < a[i].length; t++) {
					if(a[i][t] != b[i][t]) {
						ernLik = false;
					}
				}
			}
			
			return ernLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
