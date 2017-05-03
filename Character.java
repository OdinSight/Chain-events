package manager;

public class Character {
	private String Description;
	private String Name;
	private int Id;
	private int Relation;
	
	public Character(String Description, String Name, int Id, int InitialRelation){
		this.Description=Description;
		this.Name=Name;
		this.Id=Id;
		this.Relation=InitialRelation;
	}
	
	public int getRelation(){ return this.Relation;}
	
	public String getName(){return Name;}
	
	public int getId(){return Id;}
	
	public String getDescription(){return Description;}
	
	public void ChangeRelation(int change){
		this.Relation+=change;
		if(this.Relation>100)this.Relation=100;
		if(this.Relation<0)this.Relation=0;
	}
}
