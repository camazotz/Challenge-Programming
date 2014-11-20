
public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		
		root.createNodes();
		root.next.createNodes();
		root.next.next.createNodes();
		root.next.next.next.createNodes();
		
		root.data = 1;
		root.next.data = 2;
		root.next.next.data = 3;
		root.next.next.next.data = 4;
		root.next.next.next.next.data = 5;
		
		Node tmp = reverse(root);
		
		System.out.println(tmp.data);
	}
	
	public static Node reverse(Node root)
	{
		if (root == null || root.next == null)
			return root;
		
		Node previous = null;
		Node current = root;
		Node next = root.next;
		
		while (next != null)
		{
			current.next = previous;
			previous = current;
			current = next;
		//	System.out.println(current.data);
			next = current.next;
		}
		
		root = current;
		
		return root;
	}

}
