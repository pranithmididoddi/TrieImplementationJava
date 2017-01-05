/**
 * Created by Pranith on 1/5/17.
 */
import java.util.*;

public class TrieNode {
    char ch;
    HashMap<Character, TrieNode> children=new HashMap<>();
    boolean isLeaf;

    public TrieNode(){

    }

    public TrieNode(char ch){
        this.ch=ch;
    }
}
