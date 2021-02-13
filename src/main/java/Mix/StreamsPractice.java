package Mix;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

//Can use Stream.of OR Arrays.stream to start the streaming
    public Stream<String> fromArray1(String[] stringArray) {
        Stream<String> stringStream = Stream.of(stringArray);//Stream.generate(() -> "HELLO");

            //   Arrays.stream(stringArray);
        return stringStream;
    }



    public Stream<String> letters(String someWord) {
        String[] characters = someWord.split("");
        return Stream.of(characters);
    }

    public void wordsFlatMap(String[] stringArray1) {
        Stream<String> wordStream = Stream.of(stringArray1);
        List<String> wordList =
                wordStream.collect(Collectors.toList());
        System.out.println(wordList.stream().flatMap(w -> letters(w)));
    }



    public static void main(String[] args) {
        StreamsPractice sp= new StreamsPractice();
        List<String> stremspractice = new ArrayList<>();
        stremspractice.add("abc");
        stremspractice.add("bbb");
        stremspractice.add("ccc");
        stremspractice.add("abc");
        stremspractice.add("eee");
        stremspractice.add("fff");
//        System.out.println(sp.fromArray1(new String[]{"g","n","u"}).count());
//
//       sp.wordsFlatMap(new String[]{"g j","n j","u k"});

        System.out.println(stremspractice.stream().map(t -> t.getClass().toString()).toArray());
        System.out.println(stremspractice.stream().filter(t -> t.equals("abc")).collect(Collectors.toList()));
        System.out.println("Limited to 2");
        stremspractice.stream().limit(2).forEach(t -> System.out.println(t));;
        System.out.println("Display Distinct");
        stremspractice.stream().distinct().forEach(System.out::println);
        System.out.println("Display skip");
        stremspractice.stream().skip(3).forEach(System.out::println);

       // System.out.println("Display sorted");
       // stremspractice.stream().sorted(Comparator.comparing(stremspractice.get())).forEach(System.out::println);
    }


}



