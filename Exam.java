import java.util.*;
import java.util.stream.*;


public class Exam {
	public static Integer[] intersectionArrays(Integer []a ,Integer []b) {
		
		List<Integer> setA =Arrays.asList(a);
		List<Integer> setB = Arrays.asList(b);
		List<Integer> results= setA.stream()
		.filter(setB::contains)
		.collect(Collectors.toList());
		return results.toArray(new Integer[results.size()]);
	}
	public static Integer[] sortNumbers(Integer[]a) {
		List<Integer> list = Arrays.asList(a);
		List<Integer> results= list.stream().sorted().collect(Collectors.toList());
		return results.toArray(new Integer[results.size()]);
	}
	public static Integer[][] findPairs(Integer[]a,Integer n){
		List<Integer[]> results = new ArrayList<Integer[]>();
		List<Integer> inputs = Arrays.asList(a);
		int count = 0;
		for(int index=0;index<inputs.size();index++) {
			Integer x = inputs.get(index);
			List<Integer> result  = new ArrayList<Integer>();
			for(int index2=0;index2<inputs.size();index2++) {
				if(index2!=index) {
					Integer y= inputs.get(index2);
					if(x+y==n) {
						result.add(x);
						result.add(y);
						results.add(result.toArray(new Integer[result.size()]));
						count++;
					}
				}
			}
		}
		return results.toArray(new Integer[results.size()][count]);
	}

	public static void main(String[] args) {
		Integer[] results = intersectionArrays(new Integer[]{1,2,3},new Integer[]{2,3,4});
		for(Integer result : results) {
			System.out.println(result);
		}
		results = sortNumbers(new Integer[] {5, 5, 4, 3, 2, 1});
		for(Integer result : results) {
			System.out.println(result);
		}
		Integer[][] result2s = findPairs(new Integer[] {1, 2, 3, 4, 5}, 6);
		for(Integer[] result : result2s) {
			for(Integer item : result) {
				System.out.print(item+",");
			}
			System.out.println("");
		}
	}

}
