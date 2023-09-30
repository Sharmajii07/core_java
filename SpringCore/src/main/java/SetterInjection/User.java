package SetterInjection;

public class User {
	
			private int id;
			private String name;
			private long contact;
			 
			public User() {
				super();
				// TODO Auto-generated constructor stub
			}
			public int getId() {
				System.out.println("Getting id");
				return id;
			}
			public void setId(int id) {
				System.out.println("Setting id");
				this.id = id;
			}
			public String getName() {
			 
				return name;
			}
			public void setName(String name) {
				System.out.println("Setting name");
				this.name = name;
			}
			public long getContact() {
				return contact;
			}
			public void setContact(long contact) {
				System.out.println("setting contact");
				this.contact = contact;
			}
			@Override
			public String toString() {
				return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
			}
			
			
}
			