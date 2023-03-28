package god;

public class PlayResult implements Comparable<PlayResult> {

	private final int value;
	
	public PlayResult(int val) {
		this.value = val;
	}

	public int get() { // int -> dette technique si on veut s'abstraire de Dice
		return this.value;
	}
	
	@Override
	public int compareTo(PlayResult o) {
		int otherVal = o.get();
		return Integer.compare(this.value, otherVal);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PlayResult)
			return (this.value == ((PlayResult)obj).get());
		return false;
	}

}

