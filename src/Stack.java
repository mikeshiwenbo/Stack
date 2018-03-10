import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private int N;

	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void push(Item item){
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
	}
	public Item pop(){
		Item item=first.item;
		first=first.next;
		return item;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ArrayIterator();
	}
	private class ArrayIterator implements Iterator<Item>{
		private Node current=first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item=(Item) current.item;
			current=current.next;
			return item;
		}
		
	}
}
