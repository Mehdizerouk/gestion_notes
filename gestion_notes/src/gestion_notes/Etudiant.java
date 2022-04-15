package gestion_notes;

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
	

}
