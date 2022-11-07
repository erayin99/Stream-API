package calismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Map_Reduce_StreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(2);
		sayilar.add(5);
		sayilar.add(8);
		sayilar.add(9);
		System.out.println(sayilar);
		ArrayList<Integer> ikikat = new ArrayList<>();
		sayilar.forEach(p->ikikat.add(p*2));
		System.out.println(ikikat);
		//Map kullanimi
		List<Integer> lm = sayilar.stream().map(p->p+2).collect(Collectors.toList());
		System.out.println(lm);
		//Folter
		List<Integer> lf = sayilar.stream().filter(p->p%2==0).collect(Collectors.toList());
		System.out.println(lf);
		//Reduce
		Optional<Integer> toplam = sayilar.stream().reduce((p1,p2)->p1+p2);
		System.out.println(toplam);
		//Distinct
		List<Integer> ld = Arrays.asList(3,5,6,7,0,2,3,5,0,1,5,6);
		ld.stream().distinct().forEach(System.out::println);
		//Limit
		ld.stream().limit(4).forEach(System.out::println);
		//count
		long count = ld.stream().count();
		System.out.println(count);
		//sorted
		ld.stream().sorted().forEach(n->System.out.println(n + " "));
		//Match
		List<String> nl = Arrays.asList("Murat", "Faruk", "Burak","kerem","Furkan","Beril","Zeynep","Demet","Zehra");
		boolean anyMatch = nl.stream().anyMatch(name->name.startsWith("p"));
		System.out.println(anyMatch);
		boolean allmatch = nl.stream().allMatch(name->name.length() == 9);
		System.out.println(allmatch);
		boolean nonematch = nl.stream().noneMatch(name->name.endsWith("z"));
		System.out.println(nonematch);
	}

}
