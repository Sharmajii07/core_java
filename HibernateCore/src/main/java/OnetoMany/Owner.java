package OnetoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
			@Id
			private int oid;
			private String oname;
			@OneToMany
			private List<Vehicle> vehiclename;
			public Owner() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Owner(int oid, String oname, List<Vehicle> vehiclename) {
				super();
				this.oid = oid;
				this.oname = oname;
				this.vehiclename = vehiclename;
			}
			public int getOid() {
				return oid;
			}
			public void setOid(int oid) {
				this.oid = oid;
			}
			public String getOname() {
				return oname;
			}
			public void setOname(String oname) {
				this.oname = oname;
			}
			public List<Vehicle> getVehiclename() {
				return vehiclename;
			}
			public void setVehiclename(List<Vehicle> vehiclename) {
				this.vehiclename = vehiclename;
			}
			@Override
			public String toString() {
				return "Owner [getOid()=" + getOid() + ", getOname()=" + getOname() + ", getVehiclename()="
						+ getVehiclename() + "]";
			}
			
			

}
