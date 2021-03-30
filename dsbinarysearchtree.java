//class Node1
//{
//	int data;
//	Node1 left;
//	Node1 right;
//	public Node1(int data)
//	{
//		this.data=data;
//		this.left=null;
//		this.right=null;
//	}
//}
//public class dsbinarysearchtree
//{
//	public static Node1 root=null;
//	public void addNode(int value)
//	{
//		Node new_node=new Node(value);
//		if(root==null)
//		{
//			root=new_node;
//			root.left=null;
//			root.right=null;
//		}
//		else
//		{
//			Node curr=root;
//			while(curr!=null)
//				{
//					if(curr.data<value)
//					{
//						curr=curr.right;
//					}
//					else
//					{
//						curr=curr.left;
//					}
//				}
//			curr=new_node;
//			
//		}
//		
//	}
//	Node node=root;
//	public void print(Node node)
//	{
//		print(node.left);
//		System.out.println(node.data);
//		print(node.right);
//	}
//	public static void main(String[] args) 
//	{
//		dsbinarysearchtree bst=new dsbinarysearchtree();
//		bst.addNode(20);
//		bst.addNode(30);
//		bst.addNode(15);
//		bst.print(root);
//	}
//
//}
