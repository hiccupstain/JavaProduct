
public class Adress {
	private String country,province,city,street;
	private int postcode;
	
	public Adress(String country, String province, String city, String street, int postcode) {
		super();
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postcode = postcode;
	}

	public void print() {
		System.out.println("����:" + country);
		System.out.println("ʡ��:" + province);
		System.out.println("����:" + city);
		System.out.println("�ֵ�:" + street);
		System.out.println("�ʱ�:" + postcode);
	}
}
