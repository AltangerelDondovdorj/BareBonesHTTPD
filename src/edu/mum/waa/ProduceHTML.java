package edu.mum.waa;

public class ProduceHTML {
	String url;
	String input;
	
	public ProduceHTML(String url, String input){
		this.url = url;
		this.input = input;
	}
	
	public StringBuilder generateHTML(){
		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html><html><head>");
		html.append("<title>Class Name</title></head>");
		html.append("<body>");
		html.append("<p>this was your request page : " + url + "</p>");
		html.append("<p style='font-size:23px;font-weight:bold;'>" + input + "</p>");
		html.append("</body>");
		html.append("</html>");
		return html;
	}

}
