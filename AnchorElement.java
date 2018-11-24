package model;

public class AnchorElement extends TagElement implements Element {
private String url;
private String linkText;
private String attributes;
	//private Element content;
	
	public AnchorElement(java.lang.String url, java.lang.String linkText, java.lang.String attributes){
		//super("a href=\"http://www.cs.umd.edu\"",true,null,attributes);// change constructor!
		super("a",true,null,attributes);// change constructor!
		
		// href=\"http://www.cs.umd.edu\"
		this.url=url;
		this.linkText=linkText;
		this.attributes=attributes;
		
	}
	
	public java.lang.String getLinkText(){
		
		return this.linkText;
	}
	
	public java.lang.String getUrlText(){
		return this.url;
	}
	
	// <a href="http://www.cs.umd.edu">UMD</a>
	public java.lang.String genHTML(int indentation){
		//return super.getStartTag()+super.genHTML(indentation)+super.getEndTag();
		String indented=""; //this.text;
		for(int i=0;i<=indentation;i++) {
			indented+=" ";
			
		}
		//indented+= this.url;
		//return this.text;// orig
	//return indented+super.getStartTag()+this.url+this.linkText+super.getEndTag();
if(attributes==  null) {
		if(super.choice2!=true) {
		 
	return indented+super.getStartTag().substring(0, 2)+" "+ "href=\""+this.getUrlText()+"\">"+this.linkText+super.getEndTag().substring(0, 3)+">";

	 
}
else		 
return indented+super.getStartTag().substring(0, 2)+" "+super.getStringId()+" "+"href=\""+this.getUrlText()+"\">"+this.linkText+super.getEndTag().substring(0, 3)+">";	
	
}// no attributes	
else {
	
	if(super.choice2!=true) {
		 
		return indented+super.getStartTag().substring(0, 2)+" "+ "href=\""+this.getUrlText()+this.attributes+"\">"+this.linkText+super.getEndTag().substring(0, 3)+">";

		 
	}
	else		 
	return indented+super.getStartTag().substring(0, 2)+" "+super.getStringId()+" "+"href=\""+this.getUrlText()+this.attributes+"\">"+this.linkText+super.getEndTag().substring(0, 3)+">";	
	
	
	
	
	
}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
