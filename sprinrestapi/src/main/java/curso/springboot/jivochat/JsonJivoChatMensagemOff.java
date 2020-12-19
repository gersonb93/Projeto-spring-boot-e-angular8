package curso.springboot.jivochat;

import java.io.Serializable;

public class JsonJivoChatMensagemOff implements Serializable {

	private static final long serialVersionUID = 1L;
	private String event_name;
	private String widget_id;

	private Visitante visitor;

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getWidget_id() {
		return widget_id;
	}

	public void setWidget_id(String widget_id) {
		this.widget_id = widget_id;
	}

	public Visitante getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitante visitor) {
		this.visitor = visitor;
	}

}
