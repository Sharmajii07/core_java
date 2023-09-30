package OnetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	    @Id
		private int sid;
		private String name;
		private int sroll;
		@OneToOne
		private Teacher teachername;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int sid, String name, int sroll, Teacher teachername) {
			super();
			this.sid = sid;
			this.name = name;
			this.sroll = sroll;
			this.teachername = teachername;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSroll() {
			return sroll;
		}
		public void setSroll(int sroll) {
			this.sroll = sroll;
		}
		public Teacher getTeachername() {
			return teachername;
		}
		public void setTeachername(Teacher teachername) {
			this.teachername = teachername;
		}
		@Override
		public String toString() {
			return "Student [getSid()=" + getSid() + ", getName()=" + getName() + ", getSroll()=" + getSroll()
					+ ", getTeachername()=" + getTeachername() + "]";
		}
		
		

}
