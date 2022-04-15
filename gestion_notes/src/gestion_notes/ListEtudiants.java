package gestion_notes;
import java.util.ArrayList;



public class ListEtudiants extends ArrayList<Etudiant> implements Condition {
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
			int index = indexOf(e);
			set(index,e);
			return true;
		}
			return super.add(e);
	}
	
	@Override
	public boolean estVrai(Etudiant e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ListEtudiants filtrer(Condition c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
