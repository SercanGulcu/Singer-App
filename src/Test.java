import java.util.Scanner;

public class Test {
    
	private static Singers singers = new Singers();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void Islemleri_uygula() {
		System.out.println("\t 0 Islemleri goruntule");
		System.out.println("\t 1 Sarkicilari goruntule");
		System.out.println("\t 2 Sarkici ekle");
		System.out.println("\t 3 Sarkici Guncelle");
		System.out.println("\t 4 Sarkici Sil");
		System.out.println("\t 5 Sarkici Ara");
		System.out.println("\t 6 Uygulamadan cik");	
	}
	public static void Goruntule() {
		singers.print_singers();
	}
	
	public static void Sarkici_ekle() {
		System.out.println("Eklemek istediginiz sarkici ismini giriniz:");
		
		String name=scanner.nextLine();
		
		singers.add_singer(name);
		
	}
	public static void Guncelle() {
		System.out.println("Guncellemek istediginiz pozisyon(1,2,3..)");
		
		int index = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Yeni bir sarkici giriniz:");
		String new_name= scanner.nextLine();
		
		singers.update_singer(new_name, index-1);
		
	}
	
	public static void Sarkici_sil() {
		System.out.println("Silmek istediginiz pozisyon (1,2,3...)");
		
		int index=scanner.nextInt();
		
		singers.remove_singer(index-1);
	}
	
	public static void Sarkici_ara() {
		System.out.println("Aramak istediginiz sarkici:");
		
		String name=scanner.nextLine();
		
		singers.search_singer(name);
	}
	
	public static void main(String[] args) {
		System.out.println("\t Sarkici Uygulamasina Hosgeldiniz...");
	   Islemleri_uygula();
	   
	   boolean 	cikis=false;
	   int islem;
	   
	   while (!cikis) {
	  System.out.println("Bir islem seciniz:");
	  
	  islem=scanner.nextInt();
	  scanner.nextLine();
	  
	  switch(islem) {
	  case 0:
		  Islemleri_uygula();
		  break;
	  case 1: 
		  Goruntule();
		  break;
	  case 2:
		  Sarkici_ekle();
		  break;
	  case 3:
		  Guncelle();
		  break;
	  case 4:
		  Sarkici_sil();
		  break;
	  case 5:
		  Sarkici_ara();
		  break;
	  case 6:
		  cikis=true;
		  System.out.println("Uygulamadan cikiliyor...");
		  break;
		  
	  
	  
	  }
		
	}
     
	}

}
