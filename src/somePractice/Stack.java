package somePractice;

public class Stack {
	
	public static void main(String[] args){
		
	Stack myStack = new Stack();
	myStack.push(1);
	myStack.push(2);
	myStack.push(3);
	System.out.println(myStack.isEmpty());
	System.out.println(myStack.pop());
	System.out.println(myStack.peek());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());

	
		
	}
	
	private static class sNode{
		private int data;
		private sNode next;
		
		public sNode(int data){
			this.data = data;
		}
	}
	
	private sNode top;
	
	public int pop(){
		if(top==null){
			System.out.println("Errpr: Can not pop an empty Stack you dumb fuck");
			return -1;
		} else {
		int item = top.data;
		top = top.next;
		return item;
		}
	}
	
	public void push(int data){
		sNode t = new sNode(data);
		t.next = top;
		top = t;
	}
	
	public int peek(){
		return top.data;
	}
	
	public boolean isEmpty(){
		if(top==null) return true;
		else return false;
	}

}
