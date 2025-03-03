package march3;

import java.util.HashSet;

public class DuplicateCharacter {
	public static void main(String[] args) {
	HashSet<Character> hs=new HashSet<Character>();
	
	String s="javaprogramminglanguage";
	for(char ch:s.toCharArray())
    {
        hs.add(ch);
    }
    System.out.println("Remove Duplicates using HashSet:" + hs);
}
}

