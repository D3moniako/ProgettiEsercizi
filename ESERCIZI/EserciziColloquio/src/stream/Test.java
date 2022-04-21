package stream;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

public class Test {

public static void main(String[] args) {
List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
System.out.println(strList.stream().filter(x -> x.length()> 3).count());

	}
}


