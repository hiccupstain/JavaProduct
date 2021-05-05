package webExtraction;

public class Link {
	String name;
	String add;
	@Override
	public String toString() {
		String info="";
		info+=name;
		info+="\t";
		info+=add;
		return info;
	}
	public Link(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}
