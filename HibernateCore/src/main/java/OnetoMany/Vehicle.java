package OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
			@Id
			private int vid;
			private String vname;
			@ManyToOne
			private Owner ownername;
			public Vehicle() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Vehicle(int vid, String vname, Owner ownername) {
				super();
				this.vid = vid;
				this.vname = vname;
				this.ownername = ownername;
			}
			public int getVid() {
				return vid;
			}
			public void setVid(int vid) {
				this.vid = vid;
			}
			public String getVname() {
				return vname;
			}
			public void setVname(String vname) {
				this.vname = vname;
			}
			public Owner getOwnername() {
				return ownername;
			}
			public void setOwnername(Owner ownername) {
				this.ownername = ownername;
			}
			@Override
			public String toString() {
				return "Vehicle [getVid()=" + getVid() + ", getVname()=" + getVname() + ", getOwnername()="
						+ getOwnername() + "]";
			}
			
}
