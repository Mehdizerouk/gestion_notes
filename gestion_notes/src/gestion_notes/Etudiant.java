package gestion_notes;

import gestion_notes.Etudiant;

public class Etudiant implements Comparable<Etudiant>{
	private int id;
	private String nom;
	private double note;
	
	public Etudiant(int id,String nom) {
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
	
	@Override
	public int compareTo(Etudiant e) {
		if(this.note==e.note) return 0;
		if(this.note>e.note) return 1;
		return -1;
		
	}
	
	

	

}
