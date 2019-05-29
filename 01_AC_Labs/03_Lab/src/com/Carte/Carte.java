package com.Carte;

public class Carte {
	private int numar_pagini;
	
	Carte(int numar_pagini){
		this.numar_pagini = numar_pagini;
	}
	
	public boolean compara ( Carte carte2) {
		return (carte2.numar_pagini == numar_pagini);
	}
	
	public boolean equals(Object o) {
		if(o instanceof Carte)
			return (((Carte)o).numar_pagini == numar_pagini);
		else
			return false;
	}
}
