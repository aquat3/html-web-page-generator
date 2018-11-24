package model;

public class TextElement implements Element{

	
	private String text;
	public TextElement(java.lang.String text) {
		
		this.text=text;
	}
	
	
	
	public java.lang.String genHTML(int indentation){
		String indented=""; //this.text;
		for(int i=0;i<=indentation;i++) {
			indented+=" ";
			
		}
		indented+= this.text;
		//return this.text;// orig
	return indented;
	
	}
	
	
	
	
	
	
	
	
	
}
