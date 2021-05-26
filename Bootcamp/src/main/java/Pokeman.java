import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Pokeman implements Comparable<Pokeman>{
		private String type;
        
		private int id;
		private String name;

		public Pokeman() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public Pokeman(String type, String name, int id) {
			super();
			this.type = type;
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		
    
		@Override
		public String toString() {
			return "Pokeman [type=" + type + ", name=" + name + ", id=" + id + "]";
		}
		public int compareTo(Pokeman p) {
			return this.getType().compareTo(p.getType());
			int result;
			if (result != 0) {
				return result;
			
			}
			return this.getId() - p.getId();
		}



		public static void main(String[] args) {
			
			List<Pokeman> mypokeman = new ArrayList<Pokeman>();
			
			mypokeman.add(new Pokeman("Fire", "Charmander", 4));
			mypokeman.add(new Pokeman("Electric", "Pikachu", 1000));
			mypokeman.add(new Pokeman("water", "Squirtle", 45));
			mypokeman.add(new Pokeman("Temple", "Camel", 40));
			mypokeman.add(new Pokeman("Tree", "Leaves", 100));
			mypokeman.add(new Pokeman("Remo", "Nemo", 25));
			
			Collections.sort(mypokeman);
				
			for(Pokeman P : mypokeman) {
				System.out.println(P);
			}
			
		
		}
		
		
		
	
}
