package somePractice;

public class Queue {
	
	public static void main(String[] args){
		Queue myQ = new Queue();
		myQ.enqueue(4);
		myQ.enqueue(5);
		myQ.enqueue(6);
		System.out.println(myQ.dequeue());
		System.out.println(myQ.peek());
		System.out.println(myQ.isEmpty());
	}
	
	private static class qNode{
		private int data;
		private qNode next;
		
		public qNode(int data){
			this.data = data;
		}
	}
	
	private qNode first;
	private qNode last;
	
	public int dequeue(){
		int item = first.data;
		first = first.next;
		if(first==null){
			last = null;
		}
		return item;
	}
	
	public void enqueue(int data){
		qNode t = new qNode(data);
		if(last!=null){
			last.next=t;
		}
		last = t;
		if(first==null){
			first = last;
		}
	}
	
	public int peek(){
		if(first==null){
			System.out.println("You cant peek at an empty stack");
		}
		return first.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}

}
