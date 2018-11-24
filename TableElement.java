package model;
import java.util.*;
public class TableElement extends TagElement implements Element {

	private int rows;
	private int cols;
private String attributes;

	private  String [][] table;
 private ArrayList<Element> list= new ArrayList<Element>();
	
	public TableElement(int rows, int cols, java.lang.String attributes) {
		
		super("table",true,null,attributes);
		this.rows=rows;
		this.cols=cols;
		this.attributes=attributes;
		
		table= new String[rows][cols];
		//initialize all elements in table to empty string
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				table[i][j]="";
				
			}
			
			
		}
	}

	public void addItem(int rowIndex, int colIndex, Element item) {

		
		
		
		
		
		 
	 
table[rowIndex][colIndex]= item.genHTML(0);
	
list.add(item);
		
	}
	public java.lang.String genHTML(int indentation){
		String html="";
		//int i=0;//row
		//int j=1;//col
		
		String indented=""; //this.text;
		for(int k=0;k<=indentation;k++) {
			indented+=" ";
			
		}
		
		if(attributes!=null) {
		html += indented+super.getStartTag().substring(0, 6)+" "+super.getStringId()+" "+this.attributes+">\n";
		}
		else
			html += indented+super.getStartTag().substring(0, 6)+" "+super.getStringId()+">\n";

		
		
			for(int i=0;i<rows;) {
				//html+= table[i][i];
				html+="<tr>";
				for(int j=0;j<cols;j++) {
					 
					html+= "<td>"+table[i][j]+"</td>";
			 
				
				}
				//html+="\n";
				html+="</tr>";
				i++;
			html+="\n";
			
			}
			 
		
			
	
		html+="\n";
		html+=super.getEndTag();
		return html;
		
	}
	
	public double getTableUtilization() {
		
		double utiliz=0.0;
		int total=0;
		for(int i=0;i<rows;) {
			 
			for(int j=0;j<cols;j++) {
			if(!(table[i][j].equals("")))
				total++;
				
			}
			
		}
		utiliz= (double) total/(rows*cols);
		return utiliz;
	
	
	}

	
	
	
	
	
}
