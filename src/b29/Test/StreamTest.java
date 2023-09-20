package b29.Test;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Zack", "Zola","Max","Mona");

        boolean m = nameList.stream().anyMatch(p -> p.startsWith("X"));

        System.out.println("m = " + m);


    }
}
