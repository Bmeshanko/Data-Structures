public class List {
	
	private List previous;
	private List next;
	
	private int value;
	
	public List() {
		value = (int) (1 + 10 * Math.random());
	}
	
	public void setPrevious(List list) {
		this.previous = list;
	}
	
	public void setNext(List list) {
		this.next = list;
	}
	
}