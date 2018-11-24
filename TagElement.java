package model;

public class TagElement implements Element{

	
	private String tagName;
	private boolean endTag;
	private Element content;
	private String attributes;
private static int id=0;
private String strID;	
public static boolean choice2;

	public TagElement(java.lang.String tagName,
            boolean endTag,
            Element content,
            java.lang.String attributes) {
this.tagName=tagName;
this.endTag=endTag;
this.content= content;
this.attributes=attributes;
		
		
	}
	
	
	
	
	
	public int getId() {
		id++;
		return id;
	}
	
	public java.lang.String getStringId(){
	if(choice2==true)
		return "id=\""+this.tagName+getId()+"\""	;
	else
		return "";
	}
	
	public java.lang.String getStartTag(){
		if(this.attributes!= null)
		return "<"+this.tagName+">"+this.attributes;	
		else
			return "<"+this.tagName+">";	
		//return "<"+this.content.genHTML(0)+">";	
	}
	
	
	public java.lang.String getEndTag(){
	
		if(endTag== true)
		return "</"+this.tagName+">";	
		else
			return "";
	
	}
	
	
	
	
	public void setAttributes(java.lang.String attributes) {
		
		this.attributes=attributes;
	}

	
	public static void resetIds() {
		id=0;
		
	}
	
	
	public static void enableId(boolean choice) {
		choice2=choice;
	}

	public java.lang.String genHTML(int indentation){
	
		
		return this.tagName;
	}
	
	
	
	
	
	
	
	
	
}
