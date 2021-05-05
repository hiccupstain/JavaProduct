
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
		System.out.println("国家:" + country);
		System.out.println("省份:" + province);
		System.out.println("城市:" + city);
		System.out.println("街道:" + street);
		System.out.println("邮编:" + postcode);
	}
}
