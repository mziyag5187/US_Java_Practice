package self_practice.stream;

import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {

        Stream.iterate(0,n->n+2)
                .limit(5)
                .forEach(System.out::println);




    }
}
