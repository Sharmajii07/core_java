package ReferenceType1;

public class Tourist {

	private int id;
	private String name;
	private Country country;

	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tourist(int id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
