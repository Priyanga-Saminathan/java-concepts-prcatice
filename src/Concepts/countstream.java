package Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.function.*;

public class countstream {
	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		Map<String,Long> mp=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
}
