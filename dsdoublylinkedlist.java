import java.util.*;
class Node1
{
	int data;
	Node1 prev;
	Node1 next;
	public Node1(int d) 
	{ 
		this.data = d;
		this.prev=null;
		this.next=null;
	}
}

public class dsdoublylinkedlist {
		Scanner s=new Scanner(System.in);
		Node1 head;
			public void push(int new_data)
			{
				Node1 new_Node = new Node1(new_data);
				if (head == null)
				{
					head = new_Node;
					//System.out.println("inserted");
				}
				else
				{
					new_Node.next = head;
					head=new_Node;
				}
			}
			public  void printlist()
			{
				Node1 node=head;
				System.out.println("Traversal in forward Direction");
				while (node != null) {
					System.out.print(node.data + " ");
					node = node.next;
				}
				System.out.println();
//				System.out.println("Traversal in reverse direction");
//				while (last != null) {
//					System.out.print(last.data + " ");
//					last = last.prev;
//				}
				}
			public static void main(String[] args)
			{
				dsdoublylinkedlist dll = new dsdoublylinkedlist();
				dll.push(7);
				dll.push(1);
				dll.push(4);
				dll.push(8);
				
				System.out.println("Created DLL is: ");
				dll.printlist();
			}
	}
