package testOptional;

import java.util.*;
import java.util.stream.Collectors;

public class TestOptional {
    public static void main(String args[]){
        User user = new User();

        Optional<User> user1 = Optional.ofNullable(user);
        String result = user1.map(User::getAdress).map(Adress::getStreet).orElse("not specified");
        Map<Integer, String> map = new HashMap<>();
        Set<String> valuesSet = new HashSet<>(map.values());
        map.values().stream().collect(Collectors.toSet());

    }
}
