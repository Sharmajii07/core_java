package CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
			private int id;
			private String Name;
			private long contact;
			private List<String> list;
			private Set<Integer> sets;
			private Map<Integer,String > map;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public long getContact() {
				return contact;
			}
			public void setContact(long contact) {
				this.contact = contact;
			}
			public List<String> getList() {
				return list;
			}
			public void setList(List<String> list) {
				this.list = list;
			}
			public Set<Integer> getSets() {
				return sets;
			}
			public void setSets(Set<Integer> sets) {
				this.sets = sets;
			}
			public Map<Integer, String> getMap() {
				return map;
			}
			public void setMap(Map<Integer, String> map) {
				this.map = map;
			}
			@Override
			public String toString() {
				return "User [id=" + id + ", Name=" + Name + ", contact=" + contact + ", list=" + list + ", sets="
						+ sets + ", map=" + map + "]";
			}
			
			

}
