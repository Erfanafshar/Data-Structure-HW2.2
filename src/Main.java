import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberOfFriends;
        BigInteger result = new BigInteger("0");
        long h1 = 0;
        String string;
        Scanner scanner = new Scanner(System.in);
        numberOfFriends = Integer.valueOf(scanner.nextLine());
        String[] friends;
        PriorityQueue<Long> numbers = new PriorityQueue<>(numberOfFriends);
        string = scanner.nextLine();


        friends = string.split(" ");

        for (int i = 0; i < numberOfFriends; i++) {
            numbers.add(Long.valueOf(friends[i]));
        }

        for (int i = 0; i < numbers.size() - 1; ) {
            h1 = numbers.poll() + numbers.poll();
            numbers.add(h1);
            result = result.add(BigInteger.valueOf(h1));
        }

        result = result.add(BigInteger.valueOf(h1));
        System.out.println(result);
    }

}
