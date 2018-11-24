package model;

import java.util.ArrayList;

public class ParagraphElement  extends TagElement implements Element{

	private String attributes;
	private ArrayList<Element> list = new ArrayList<Element>();
	
	public ParagraphElement(java.lang.String attributes) {
		
		super("p",true,null,attributes);
		
		this.attributes=attributes;
		
	}
	
	
	public void addItem(Element item) {
		list.add(item);
		
	}
	// fix indenteations
	public java.lang.String genHTML(int indentation){
		String html="";
		
		String indented=""; //this.text;
		for(int i=0;i<=indentation;i++) {
			indented+=" ";
			
		}
		//html=indented;
		//html+=super.getStartTag().substring(0, 2)+" id=\""+super.getStringId()+"\""+">\n";
		if(this.attributes!=null)
		html+=super.getStartTag().substring(0, 2)+" "+this.attributes+ super.getStringId()+">\n";
		else
			html+=super.getStartTag().substring(0, 2)+" "+ super.getStringId()+">\n";	
		for(Element e: list) {
			 
			html+=e.genHTML(indentation)+"\n";
			
		}
		
		//return super.getStartTag()+ list.get(0).genHTML(indentation)+super.getEndTag();
	
		return html+super.getEndTag();	
	}
	
	
	
	
}
