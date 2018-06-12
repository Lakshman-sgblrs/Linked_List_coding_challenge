package linkedListExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DetectLoopLL {
	Node head;
	HashSet<Node> map = new HashSet<>();

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int d) {
		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;

	}

	public boolean detectloop() {
		Node m = head;
		while (m != null) {
			if (map.contains(m))
				return true;
			map.add(m);
			m = m.next;
		}
		return false;
	}

	public static void main(String[] args) {
		DetectLoopLL ill = new DetectLoopLL();
		ill.push(1);
		ill.push(2);
		ill.push(3);
		ill.push(4);
		ill.push(5);

		ill.head.next.next.next.next.next = ill.head;

		ill.detectloop();

	}
}
