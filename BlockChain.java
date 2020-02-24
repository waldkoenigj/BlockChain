import java.util.*;
/*
 * Created by Jonah Waldkoenig
 * Date of 02/13/2020
 */

public class BlockChain {
	ArrayList<Block> blockChain = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstTransactions = {"hello", "world"};
		Block first = new Block(0, firstTransactions);
		
		String[] secTransactions = {"test", "outcome"};
		Block second = new Block(first.getBlockHash(), secTransactions);
		
		System.out.println("Hash of first block:");
		System.out.println(first.getBlockHash());
		System.out.println("Hash of second block:");
		System.out.println(second.getBlockHash());
	}
		
}
