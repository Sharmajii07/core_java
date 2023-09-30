package ManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class Teacher {
		@Id
		private int tid;
		private String tname;
		@ManyToMany
		private List<Student> sname;
		@ManyToMany
		private List<Course> cname;
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Teacher(int tid, String tname, List<Student> sname, List<Course> cname) {
			super();
			this.tid = tid;
			this.tname = tname;
			this.sname = sname;
			this.cname = cname;
		}
		public int getTid() {
			return tid;
		}
		public void setTid(int tid) {
			this.tid = tid;
		}
		public String getTname() {
			return tname;
		}
		public void setTname(String tname) {
			this.tname = tname;
		}
		public List<Student> getSname() {
			return sname;
		}
		public void setSname(List<Student> sname) {
			this.sname = sname;
		}
		public List<Course> getCname() {
			return cname;
		}
		public void setCname(List<Course> cname) {
			this.cname = cname;
		}
		@Override
		public String toString() {
			return "Teacher [tid=" + tid + ", tname=" + tname + ", sname=" + sname + ", cname=" + cname + "]";
		}
		
		

}
