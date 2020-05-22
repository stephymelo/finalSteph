package model;

import java.util.Comparator;

public class ContadorColor implements Comparator<Contador> {

	public int compare(Contador o1, Contador o2) {
		return o1.getNumero() - o2.getNumero();
		
	
	}

	
}
