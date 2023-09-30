package ManytoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
		@Id
		private int cid;
		private String cname;
		@ManyToMany
		private List<Teacher> tname;
		@ManyToMany
		private List<Student> sname;
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Course(int cid, String cname, List<Teacher> tname, List<Student> sname) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.tname = tname;
			this.sname = sname;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public List<Teacher> getTname() {
			return tname;
		}
		public void setTname(List<Teacher> tname) {
			this.tname = tname;
		}
		public List<Student> getSname() {
			return sname;
		}
		public void setSname(List<Student> sname) {
			this.sname = sname;
		}
		@Override
		public String toString() {
			return "Course [getCid()=" + getCid() + ", getCname()=" + getCname() + ", getTname()=" + getTname()
					+ ", getSname()=" + getSname() + "]";
		}
		
		
	}


