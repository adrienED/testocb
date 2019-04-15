package persistence;

public class Company {
	
	protected long id;
	protected String name;
	
	
	public Company(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}

}
