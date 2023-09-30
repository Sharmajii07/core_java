package oneToOne1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Flat {
		@Id
		private int fid;
		private String fname;
		@OneToOne
		private Builder buildername;
		public Flat() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Flat(int fid, String fname, Builder buildername) {
			super();
			this.fid = fid;
			this.fname = fname;
			this.buildername = buildername;
		}
		public int getFid() {
			return fid;
		}
		public void setFid(int fid) {
			this.fid = fid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public Builder getBuildername() {
			return buildername;
		}
		public void setBuildername(Builder buildername) {
			this.buildername = buildername;
		}
		@Override
		public String toString() {
			return "Flat [getFid()=" + getFid() + ", getFname()=" + getFname() + ", getBuildername()="
					+ getBuildername() + "]";
		}
		

}
