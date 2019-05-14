import java.util.ArrayList;

public class Singers {

	private ArrayList<String> singer_list = new ArrayList<String>();

	public void print_singers() {

		System.out.println("Listede " + singer_list.size() + " sarkici bulunmaktadir.");

		for (int i = 0; i < singer_list.size(); i++) {
			System.out.println(i + 1 + ".sarkici : " + singer_list.get(i));
		}
	}

	public void add_singer(String name) {

		singer_list.add(name);
		System.out.println("Listeniz guncellendi.");
	}

	public void update_singer(String new_name, int index) {

		singer_list.set(index, new_name);
		System.out.println("Listeniz guncellendi.");
	}

	public void remove_singer(int index) {

		String isim = singer_list.get(index);
		singer_list.remove(index);
		System.out.println(isim + " adli sarkici listeden silindi");

	}
	
	public void search_singer(String name) {
		int index= singer_list.indexOf(name);
		if(index>=0) {
			System.out.println("Sarkici bulundu.");
			System.out.println(name + " adli sarkici "+ (index+1) +" posizyonda.");
		}
		else {
			System.out.println("Bulunumadi");
		}
	}
}
