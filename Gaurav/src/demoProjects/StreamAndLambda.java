package demoProjects;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAndLambda {

	public static void main(String[] args) {
		
		List<Integer> orgnl= Arrays.asList(11,22,33,44,55,66,77,88);
		System.out.println(orgnl); //all obj
		
		Stream<Integer> stream= orgnl.stream();
		List<Integer> l= stream.filter(i->i<35).collect(Collectors.toList());
		System.out.println(l); //filtered obj
		
		long fail= l.stream().filter(i->i<35).count();
		System.out.println(fail); //filtered obj count
		
		List<Integer> updated= orgnl.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(updated); //mapped (all) obj affected
		
	}

}
