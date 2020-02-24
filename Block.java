import java.util.Arrays;

/*
 * Created by Jonah Waldkoenig
 * Date of 02/13/2020
 */
public class Block {
	private int previousSignature;
	private String[] transactions;
	private int signature;
	
	public Block(int previousHash, String[] transactions) {
		this.previousSignature = previousHash;
		this.transactions = transactions;
		long[] contents = {Arrays.hashCode(transactions), previousHash};
		this.signature = Arrays.hashCode(contents);
	}
	
	public int getPreviousSignature() {
		return previousSignature;
	}
	
	public String[] getTransactions() {
		return transactions;
	}

	public int getBlockHash() {
		return signature;
	}
}
