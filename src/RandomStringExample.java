import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashSet;
import java.util.TreeSet;

public class RandomStringExample {

    public static void main(String[] args) {
        String str = RandomStringUtils.randomAlphabetic(2);
        System.out.println(str);
        TreeSet<String> randomStrings = new TreeSet<String>();
        while (true) {

            randomStrings.add(RandomStringUtils.randomAlphabetic(2));
            if (randomStrings.size() == 100) break;

        }
        System.out.println(randomStrings.size());
        System.out.println(randomStrings);
    }
}
