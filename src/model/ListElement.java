package model;

import java.util.ArrayList;

public class ListElement extends TagElement implements Element{

	private boolean ordered;
	private String attributes;
	private ArrayList<Element> list = new ArrayList<Element>();
	
	public ListElement(boolean ordered, java.lang.String attributes) {
		 
		super("ul",true,null,attributes);
		this.ordered=ordered;
		this.attributes=attributes;
		
		
	}
	
	public void addItem(Element item) {
		list.add(item);
		
	}
	
	
	public java.lang.String genHTML(int indentation){
		String html="";
		if(this.ordered!=true) {//delete
		if(this.attributes==null)
			html = super.getStartTag().substring(0, 3)+" "+super.getStringId()+">\n";
		else
			html = super.getStartTag().substring(0, 3)+super.getStringId()+this.attributes+">\n";

		 for(Element e:list) {
		html+="<li>\n";
		html+=e.genHTML(indentation)+"\n";
		html+="</li>\n";
	}
		 html+=super.getEndTag();
		}//delete
		else {
			if(this.attributes!=null)
			html+=super.getStartTag().replaceAll("ul", "ol").substring(0, 3)+" "+super.getStringId().replaceAll("ul", "ol")+this.attributes+">\n";
			else 
				html+=super.getStartTag().replaceAll("ul", "ol").substring(0, 3)+" "+super.getStringId().replaceAll("ul", "ol")+">\n";
	
			
			for(Element e:list) {
					html+="<li>\n";
					html+=e.genHTML(indentation)+"\n";
					html+="</li>\n";
			}
			html+=super.getEndTag().replaceAll("ul", "ol");
			
		 
	}	
		return html;
	
	
	
	
	
	
	
	
	
	
}
}