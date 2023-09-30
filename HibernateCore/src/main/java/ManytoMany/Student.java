package ManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {
		@Id
		private int sid;
		private String sname;
		@ManyToMany
		private List<Teacher> tname;
		@ManyToMany
		private List<Course> cname;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int sid, String sname, List<Teacher> tname, List<Course> cname) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.tname = tname;
			this.cname = cname;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public List<Teacher> getTname() {
			return tname;
		}
		public void setTname(List<Teacher> tname) {
			this.tname = tname;
		}
		public List<Course> getCname() {
			return cname;
		}
		public void setCname(List<Course> cname) {
			this.cname = cname;
		}
		@Override
		public String toString() {
			return "Student [getSid()=" + getSid() + ", getSname()=" + getSname() + ", getTname()=" + getTname()
					+ ", getCname()=" + getCname() + "]";
		}
		
		
}
