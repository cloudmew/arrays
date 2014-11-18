package arrays;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Charles";
		cat1.age = 2;
		cat1.breed = "British Shorthair";
		cat1.color = "gray";
		
		Cat cat2 = new Cat();
		cat2.name = "Lilly";
		cat2.age = 5;
		cat2.breed = "unknown";
		cat2.color = "white";
		
		Cat[] cats ={cat1,cat2};
		
		for(int i = 0; i < cats.length; i++) {
			
			System.out.println(cats[i].name);
			
		}
			
			
		Plant plant1 = new Plant();
		plant1.botanicalName = "Achillea millefolium";
		plant1.germanName = "Schafgarbe";
		
		Plant plant2 = new Plant();
		plant2.botanicalName = "Acmella oleracea";
		plant2.germanName = "Husarenknopf";
		
		Plant plant3 = new Plant();
		plant3.botanicalName = "Aconitum napellus";
		plant3.germanName = "Eisenhut, Blauer";
		
		Plant plant4 = new Plant();
		plant4.botanicalName = "Aconitum vulparia";
		plant4.germanName = "Eisenhut, Gelber";
		
		Plant plant5 = new Plant();
		plant5.botanicalName = "Acorus calamus";
		plant5.germanName = "Kalmus";
		
		Plant[] plants ={plant1,plant2,plant3,plant4,plant5};
		
		StrUtils su = new StrUtils();
		

		
		
		for(int i = 0; i < plants.length; i++) {
			
			String s = plants[i].botanicalName;
			su.countChars(s);
			
			int count = su.countChars(s);
			
			System.out.println(count);
			
		}
		
			
		
		
		}
	}


