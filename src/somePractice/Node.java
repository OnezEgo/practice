package somePractice;

public class Node{
	
	public static void main(String[] args) {
		
		Node a = new Node(2);
		
		a.addNode(6);
		a.addNode(4);
		a.addNode(3);
		a.removeNode(3);
		a.display();
	}
	
		
		int data;
		Node next;
		
		
		
		
		public Node(int d){
			data = d;
		}
	
		void addNode(int d){
			Node end = new Node(d);
			Node n = this;
			while(n.next!=null){
				n=n.next;
			}
			n.next = end;
		}
	
		Node removeNode(int d){
			Node n = this;
			if(n.data == d){ return n.next; }
				while(n.next!=null){
					if(n.next.data==d){
						n.next = n.next.next;
						return this;
					}
					n = n.next;
				}
				return this;
		}
		
		void display(){
			Node n = this;
			while(n.next!=null){
				System.out.println("Next Node "+ n.next.data);
				n = n.next;
				System.out.println("");
			}
		}
	}


	


