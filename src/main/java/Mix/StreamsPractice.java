package Mix;

import java.util.Arrays;
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

        System.out.println(sp.fromArray1(new String[]{"g","n","u"}).count());

       sp.wordsFlatMap(new String[]{"g j","n j","u k"});
    }


}



