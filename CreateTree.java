import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CreateTree {
    public static void main(String[] args) {
        //create the binary search tree
        BST<Integer> randomBST = new BST();

        //arraylist to store the random numbers to find min and max
        ArrayList<Integer> storeRandomNumbers = new ArrayList<Integer>();

        Random rand = new Random();

        //for loop to populate BST and arraylist with the random numbers
        System.out.print("Generate a random BST with 10 nodes:");
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(50) + 1;
            randomBST.insert(random);
            storeRandomNumbers.add(random);
            System.out.print("\t" + random);
        }
        System.out.println();
        System.out.println("The min node is: " + Collections.min(storeRandomNumbers));
        System.out.println("The max node is: " + Collections.max(storeRandomNumbers));
    }
}
