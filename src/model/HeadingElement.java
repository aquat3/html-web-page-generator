package model;

public class HeadingElement extends TagElement implements Element{
private Element content;
private int level;
private String attributes;
	
	
	public HeadingElement(Element content,
            int level,
            java.lang.String attributes) {
		
		super("h"+level,true,content,attributes);
		
		this.content=content;
		
		this.level=level;
		this.attributes=attributes;
		
	}

	
	
public java.lang.String genHTML(int indentation){
		
		return super.getStartTag()+this.content.genHTML(indentation)+super.getEndTag();
	



}
	
	
	
	
	
	
	
}
