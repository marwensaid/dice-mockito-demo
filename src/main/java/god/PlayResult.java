package god;

public class PlayResult implements Comparable<PlayResult> {

	private int value;
	
	public PlayResult(int val) {
		this.value = val;
	}

	public int get() { // int -> dette technique si on veut s'abstraire de Dice
		return value;
	}
	
	public int compareTo(PlayResult o) {
		int otherVal = o.get();
		return value < otherVal ? -1 : value > otherVal ? +1 : 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PlayResult)
			return (value == ((PlayResult)obj).get());
		return false;
	}

}

