package model;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Bundle extends TagSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String key;
public final String getKey() {
	return key;
}
public final void setKey(String key) {
	this.key = key;
}
@Override
public int doEndTag() throws JspException {
	HttpSession session=pageContext.getSession();
	ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
	String value=rb.getString(key);
	JspWriter out=pageContext.getOut();
	try {
		out.print(value);
	}catch (Exception e) {
	e.printStackTrace();
	}
	return super.doEndTag();
}
}
