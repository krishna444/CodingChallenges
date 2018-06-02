import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class LambdaExp {
    public static void main(String... args) {
        List<String> stringsList = Arrays.asList("1", "2", "4", "5", "6", "3");
        List<Integer> integerList = stringsList.stream().map(element -> Integer.valueOf(element))
                .collect(Collectors.toList());

        List<Integer> evenList = integerList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        evenList.forEach(element -> System.out.println(element));

        int[] integerArray = new int[10000000];
        integerArray[0]=100;
        integerList = Arrays.asList(integerArray);
        integerList.forEach(element -> System.out.println(element));

    }
}