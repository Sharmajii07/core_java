package setByConstructor;

public class User {
		private int a,b;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		public User(String a, int b) {
			super();
			System.out.println("Value set by string and int constructor");
			this.a = Integer.parseInt(a);
			this.b = b;
		}
		public User(long a, int b) {
			super();
			System.out.println("Value set by long and int constructor");
			this.a = (int)a;
			this.b = b;
		}
		
		public User(double a, String b) {
			super();
			System.out.println("Value set by double and string constructor");
			this.a = (int)a;
			this.b = Integer.parseInt(b);
		}

		@Override
		public String toString() {
			return "User [a=" + a + ", b=" + b + "]";
		}
		
		

}
