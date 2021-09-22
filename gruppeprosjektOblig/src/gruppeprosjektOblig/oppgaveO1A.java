package gruppeprosjektOblig;

public class oppgaveO1A {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		//A)
		//skrivUt(a);
		
		//B)
		//System.out.println(tilStreng(a));
		
		//C)
		//System.out.println(summer(a)[0] + "  " + summer(a)[1] + "  " + summer(a)[2]);
		
		//D)
		//System.out.println(finnesTall(a, 8));
		//System.out.println(finnesTall(a, 4));
		
		//E)
		//System.out.println(posisjonTall(a, 8));
		//System.out.println(posisjonTall(a, 4));
		
		//F)
		//System.out.println(tilStreng(reverser(a)));
		
		//G)
		//System.out.println(erSortert(a));
		
		//H)
		//System.out.println(tilStreng(settSammen(a, b)));
		
	}
	
	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tabell.length);
		for(int i = 0; i < tabell.length; i++) {
		System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for(int i = 0; i < tabell.length; i++) {
			if(i == (tabell.length - 1)) {
				streng += tabell[i];
			}
			else {
				streng += tabell[i] + ", ";
			}	
			}
		streng += "]";
		return streng;
		
	}

	// c)
	public static int[] summer(int[] tabell) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sumTot[] = {1, 2, 3};
		for(int i = 0; i < tabell.length; i++) {
			sum1 += tabell[i];
		}
		sumTot[0] = sum1;
		
		boolean whileclause = true;
		int teller = 0;
		while(whileclause == true) {
			
			if((teller == tabell.length - 1)) {
				sum2 += tabell[teller];
				whileclause = false;
			}
			else {
				sum2 += tabell[teller];
				teller += 1;
			}
		}
		sumTot[1] = sum2;
		
		for(int i : tabell) {
			sum3 += i;
		}
		sumTot[2] = sum3;
		
		return sumTot;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean svar = false;
		for(int i: tabell) {
			if(i == tall) {
				svar = true;
			}
		}
		
		return svar;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int retur = -1;
		for(int i: tabell) {
			if(i == tall) {
				retur = tabell[0];
			}
		}
		return retur;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nyTabell = new int[tabell.length];
		int teller = 0;
		for(int i: tabell) {
			nyTabell[tabell.length - 1 - teller] = i;
			teller += 1;
		}
		
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean erSortert = true;
		int forrigeTall = tabell[0];
		for(int i: tabell) {
			if(i < forrigeTall) {
				erSortert = false;
			}
			forrigeTall = i;
		}
		
		return erSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] finalArray = new int[tabell1.length + tabell2.length];
		int teller = 0;
		for(int i: tabell1) {
			finalArray[teller] = i;
			teller += 1;
		}
		for(int i: tabell2) {
			finalArray[teller] = i;
			teller += 1;
		}
		return finalArray;
		
	}

}
