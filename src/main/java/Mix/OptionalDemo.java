package Mix;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);
       // Optional<String> hello = Optional.ofNullable("hello");
        System.out.println(hello.isPresent());
     //   System.out.println(hello.get());
        String orElse = hello.orElse("Gunjan , there is no hello");
       // System.out.println(orElse);
        String transform = hello
                .map(String::toUpperCase)
                .orElse(orElse);
        System.out.println(transform);


        String orElseGet = hello
                .map(String::toUpperCase)
                .orElseGet(() ->
                {
                    //..extra computation to retrieve the value
                    return "world";
                }
                ) ;

        System.out.println(orElseGet);



        String or = hello
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new ) ;

        System.out.println(or);


    }



}
