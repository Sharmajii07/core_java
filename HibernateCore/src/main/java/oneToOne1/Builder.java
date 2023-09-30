package oneToOne1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Builder {
		@Id
		private int bid;
		private String bname;
		@OneToOne
		private Flat flatname;
		public Builder() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Builder(int bid, String bname, Flat flatname) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.flatname = flatname;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public Flat getFlatname() {
			return flatname;
		}
		public void setFlatname(Flat flatname) {
			this.flatname = flatname;
		}
		@Override
		public String toString() {
			return "Builder [getBid()=" + getBid() + ", getBname()=" + getBname() + ", getFlatname()=" + getFlatname()
					+ "]";
		}
		

}
