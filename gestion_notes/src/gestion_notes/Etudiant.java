package gestion_notes;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	
	public Etudiant(int id,String nom,double note) {
		this.id=id;
		this.nom=nom;
		this.note=10;
		
	}
	
	public String toString()
	{
		return this.nom+ " : "+this.note; 
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id; 
	}
	
	

	

}
