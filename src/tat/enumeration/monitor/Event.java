package tat.enumeration.monitor;

public enum Event {
	create("create"), update("update"), nextElement("nextElement");
	
	private String name;
	
	Event (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}