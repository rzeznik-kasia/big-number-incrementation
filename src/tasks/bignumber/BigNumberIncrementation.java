package tasks.bignumber;

public class BigNumberIncrementation {
	//napisz funkje ktora bedzie inkrementowala liczbe ktora reprezentuje tablica np. 500 = {5, 0, 0}

	int[] increment(int[] tab) throws NegativeDigitException {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < 0) throw new NegativeDigitException();
		}
		
		for (int i = tab.length - 1; i >= 0; i--) {
			if (tab[i] < 9) {
				tab[i]++; 
				break;
			}
			else if (tab[i] == 9) {
				tab[i] = 0;
				if (i == 0) {
					int[] newTab = new int[tab.length+1];
					newTab[0] = 1;
					for (int j = 1; j < tab.length + 1; j++) {
						newTab[j] = tab[j-1];
					}
					return newTab;
				}
				continue;
			}
		}
		return tab;

	} //sluchawki

}
