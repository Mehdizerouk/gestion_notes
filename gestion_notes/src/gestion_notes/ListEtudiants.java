package gestion_notes;
import java.util.ArrayList;


public class ListEtudiants extends ArrayList<Etudiant> {
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
			int index = indexOf(e);
			set(index,e);
			return true;
		}
			return super.add(e);
	}
	

}
