import java.util.ArrayList;

public class asarochain {
    public static void main(String[] args) {
        block genesisBlock = new block("This is a very sus block of data to be mined", "0");
        System.out.println("Hash for first block:\n" + genesisBlock.hash + "\n");

        block secondBlock = new block("Yo wtf what is my hash???", genesisBlock.hash);
        System.out.println("Hash for second block:\n" + secondBlock.hash + "\n");

        block thirdBlock = new block("I refuse to be mined for crypto!", secondBlock.hash);
        System.out.println("Hash for third block:\n" + thirdBlock.hash + "\n");
    }
}
