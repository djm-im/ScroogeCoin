package im.djm;

public class TxHandler {

	/**
	 * Creates a public ledger whose current UTXOPool (collection of unspent
	 * transaction outputs) is {@code utxoPool}. This should make a copy of utxoPool
	 * by using the UTXOPool(UTXOPool uPool) constructor.
	 */
	public TxHandler(UTXOPool utxoPool) {
		// IMPLEMENT THIS
	}

	/**
	 * @return
	 * 
	 * 		<b>true</b> if: <br />
	 *         <br />
	 *         (1) all outputs claimed by {@code tx} are in the current UTXO pool,
	 *         <br />
	 *         (2) the signatures on each input of {@code tx} are valid, <br />
	 *         (3) no UTXO is claimed multiple times by {@code tx}, <br />
	 *         (4) all of {@code tx}s output values are non-negative, and <br />
	 *         (5) the sum of {@code tx}s input values is greater than or equal to
	 *         the sum of its output values; and false otherwise.
	 */
	public boolean isValidTx(Transaction tx) {
		// IMPLEMENT THIS
		// TODO
		return false;
	}

	/**
	 * Handles each epoch by receiving an unordered array of proposed transactions,
	 * checking each transaction for correctness, returning a mutually valid array
	 * of accepted transactions, and updating the current UTXO pool as appropriate.
	 */
	public Transaction[] handleTxs(Transaction[] possibleTxs) {
		// IMPLEMENT THIS
		// TODO
		return null;
	}

}
