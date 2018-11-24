package model;
//DONT FORGET STUDENT TESTS!!!!
public class ImageElement extends TagElement implements Element{

	private String imageURL;
	private int width;
	private int height;
	private String alt;
	private String attributes;
	
	public ImageElement(java.lang.String imageURL, int width, int height, java.lang.String alt, java.lang.String attributes) {
		super("img",false,null,attributes);
		
		this.imageURL=imageURL;
		this.width=width;
		this.height=height;
		this.alt=alt;
		this.attributes=attributes;
	}
	
	
	
	public java.lang.String getImageURL(){
		return this.imageURL;
		
	}
	// <img id="img1" src="testudo.jpg" width="84" height="111" alt="Testudo Image">
	public java.lang.String genHTML(int indentation){
		
		String indented=""; //this.text;
		for(int i=0;i<=indentation;i++) {
			indented+=" ";
			
		}
		//return indented+super.getStartTag().substring(0,4)+" id=\""+super.getStringId()+"\" "+"src=\""+this.imageURL+"\" width=\""+this.width+"\" height=\""+this.height+"\" alt=\""+this.alt+"\">";
	
		return indented+super.getStartTag().substring(0,4)+" "+super.getStringId()+"src=\" "+this.imageURL+"\" width=\""+this.width+"\" height=\""+this.height+"\" alt=\""+this.alt+"\">";	
		//return super.getStringId();
	
	}
	
	
	
}
