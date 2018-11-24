package model;
import java.util.*;
public class WebPage extends TagElement implements Element {
private String title;
	private ArrayList<Element> list = new ArrayList<Element>();
	private static int lCount=0;
	private static int pCount=0;
	private static int tCount=0;
	
	
	public WebPage(java.lang.String title) {
		super("html",true,null,"");
		this.title=title;
		
	}
	
	
	
	public int addElement(Element element) {
		list.add(element);
		if(!(element instanceof TagElement))
		return -1;
		else
		return super.getId();
	}

	public java.lang.String getWebPageHTML(int indentation){
		String html="<!doctype html>\n";
		
		
		html+=super.getStartTag()+"\n";
				
				 
				html+="<head lang=\"en\">"+"\n";
				html+=" <meta charset=\"utf-8\"/>"+"\n";
				html+="<title>"+this.title+"</title>"+"\n";
				html+="</head>"+"\n";
				html+=""+"\n";
				html+="<body>"+"\n";
				if(list!=null) {
					for(Element e:list) {
					html+=e.genHTML(indentation)+"\n";
				}
				
				
				html+="</body>"+"\n";
				html+=super.getEndTag();
		}return html;
				
	}
	public void writeToFile(java.lang.String filename,
            int indentation) {
		
		Utilities.writeToFile(filename,this.getWebPageHTML(indentation) );
	}
	
	public Element findElem(int id) {
		return list.get(id);
		
	}
	public java.lang.String stats(){
		double t=(double) (3)/(2*2);
		t*=100;
		String stats="";
		String util="";
		for(Element e:list) {
			if(e.genHTML(0).contains("<tr")) {
				tCount++;
				//TableElement t= (TableElement) e;
			//util+=t.getTableUtilization();// problem
			
			}if(e.genHTML(0).contains("<p"))
				pCount++;
			if(e.genHTML(0).contains("<ul") ||e.genHTML(0).contains("<ol"))
				lCount++;
			stats="List Count: "+lCount+"\n";
			stats+="Paragraph Count: "+pCount+"\n";
			stats+="Table Count: "+tCount+"\n";			
		//if(e instanceof TableElement) {
			//TableElement t= (TableElement) e;
			stats+="TableElement Utilization: "+t;//fix
		
		//}
		
		}
		
		
		
		return stats;
		
	}
	public int compareTo(WebPage webPage) {
		if(this.genHTML(0).length()==webPage.genHTML(0).length())
		return 0;
		
		if(this.genHTML(0).length()<webPage.genHTML(0).length())
		return -1;
		else 
			return 1;
	}
	public static void enableId(boolean choice) {
		
	}
	
	
}
