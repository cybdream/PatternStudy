package com.cybdream.patternstudy.compositepattern;

public class TestCompositePattern {
	
	public static void main(String[] args) {
		HtmlTag parentTag = new HtmlParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		
		HtmlTag bodyTag = new HtmlParentElement("<body>");
		bodyTag.setStartTag("<body>");
		bodyTag.setEndTag("</body>");
		parentTag.addChildTag(bodyTag);
		
		HtmlTag child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Testing html tag library");
		bodyTag.addChildTag(child1);
		
		child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Paragraph 2");
		bodyTag.addChildTag(child1);
		
		parentTag.generateHtml();
		
		System.out.println("body count=> "+ bodyTag.getChildren().size());
	}
}
