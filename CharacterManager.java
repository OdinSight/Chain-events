package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterManager {
	private Character[] Characters;
	private String SaveName=""; // to fucking do
	public CharacterManager(){
		String text;
		String portion;
		int id;
		String Description;
		String Name;
		int InitialRelation;
		int index;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Initializer.txt"));
			text=reader.readLine();
			this.Characters= new Character[Integer.parseInt(text)];
			for(int i=0; i<Characters.length;i++){
				index=0;
				portion="";
				text=reader.readLine();
				for(;text.charAt(index)!=';';index++){
					portion+=text.charAt(index);	
				}
				id=Integer.parseInt(portion);
				portion="";
				for(;text.charAt(index)!=';';index++){
					portion+=text.charAt(index);	
				}
				Name=portion;
				for(;text.charAt(index)!=';';index++){
					portion+=text.charAt(index);	
				}
				Description=portion;
				for(;text.charAt(index)!=';';index++){
					portion+=text.charAt(index);	
				}
				InitialRelation=Integer.parseInt(portion);
				Characters[i]= new Character(Description, Name, id , InitialRelation);
			}
			 
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean Save(){
		try {
			BufferedWriter save= new BufferedWriter(new FileWriter(SaveName));
			save.write(Characters.length);
			save.newLine();
			for(int i=0; i<Characters.length;i++){
				save.write(Characters[i].getId()+";"+Characters[i].getName()+";"+Characters[i].getDescription()+";"+Characters[i].getRelation()+";");
				save.newLine();
			}
			// to-do save day and other stats like int and past actions
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return true;
	}
	
}
