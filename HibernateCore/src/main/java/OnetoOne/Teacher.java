package OnetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	        @Id
			private int tid;
			private String tname;
			@OneToOne
			private Student studentname;
			public Teacher() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Teacher(int tid, String tname, Student studentname) {
				super();
				this.tid = tid;
				this.tname = tname;
				this.studentname = studentname;
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
			public Student getStudentname() {
				return studentname;
			}
			public void setStudentname(Student studentname) {
				this.studentname = studentname;
			}
			@Override
			public String toString() {
				return "Teacher [getTid()=" + getTid() + ", getTname()=" + getTname() + ", getStudentname()="
						+ getStudentname() + "]";
			}
			
			
			

}
