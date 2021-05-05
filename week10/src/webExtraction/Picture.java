package webExtraction;

public class Picture {
	String name;

	@Override
	public String toString() {
		return name;
	}

	public Picture(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
