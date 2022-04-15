package gestion_notes;

public class etudiant{
	private int id; 
	private String nom;
	private double note;
	
	public etudiant(int id,String nom) {
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
		if (! (obj instanceof etudiant) ){
			return false;
		}
	return	((etudiant)obj).id==this.id; 
	}
	
}

