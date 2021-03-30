class Node
    {    
        int data;    
        Node next;    
            
        public Node(int data)//cons
        {    
            this.data = data;    
            this.next = null;    
        }    
    }
public class dslinkedlist 
{
    public Node head = null;    
    public Node tail = null;
    public void addNode(int data)
    {
    	Node newNode = new Node(data);
        if (head == null || head.data  >= newNode.data) 
        { 
            newNode.next = head; 
            head = newNode; 
        } 
        else 
        { 
            Node current = head; 
            while (current.next != null && current.next.data < newNode.data) 
                current = current.next; 
  
            newNode.next = current.next; 
            current.next = newNode; 
        } 
    }    
      void searchNode(int value)
      {
    	  Node temp=head;
    	  int flag=0;
    	  while(temp!=null)
    	  {
    		  if(temp.data==value)
    		  {
    			  System.out.println("Found!");
    			  flag=1;
    		  }
    		  temp=temp.next;
    	  }
    	  if(flag==0)
    	  {
			  System.out.println("Not Found!");
    	  }
      }   
    public void display() 
    {
        Node current = head;    
            
        if(head == null)
        {    
            System.out.println("List is empty");    
            return;    
        }       
        while(current != null) 
        {     
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    public static void main(String[] args) 
    {    
        dslinkedlist sList = new dslinkedlist();    
        System.out.println("Add nodes to the list 10 50 40 20:");
        System.out.println("Add Nodes in sorted order");
        sList.addNode(10);    
        sList.addNode(50);    
        sList.addNode(40);    
        sList.addNode(20); 
        System.out.println("Displays the nodes present in the list:");
        sList.display();
        System.out.println("Add Nodes in sorted order");
        sList.addNode(30);
        System.out.println("Displays the nodes present in the list: after inserting 30");
        sList.display();
        System.out.println("Searching the node 40:");
        sList.searchNode(40);    
    }    
}   
