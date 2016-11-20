
/**
 * @author Sagar
 */

public class Stack<E> {
	final int CAPACITY;
	private int size;
	private Node<E>[] table;
	
	public Stack(){
		this.CAPACITY=16;
		this.size=0;
		table=new Node[this.CAPACITY];
	}
	
	public void push(E element){
		table[this.size]=new Node<E>(element);
		++this.size;
	}
	
	public E pop(){
		if(this.size==0) return null;
		Node<E> top=table[this.size-1];
		table[--this.size]=null;
		return top.element;
	}
	
	public E peek(){
		Node<E> top=table[this.size-1];
		return top.element;
	}
	
	public boolean isEmpty(){
		return this.size==0;
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean contains(E element){
		for(int i=0;i<this.size;i++){
			Node<E> node=table[i];
			if(element.equals(node.element)) return true;
		}
		return false;
	}
}
