/*
Write a function that inserts a new item into a Linked List of integers at the given position.

Input Format
Your function should accept the following parameters:
  Parameter #1: The first Node of the Linked List (Node is defined in the sample code below)
  Parameter #2: The integer value to be inserted
  Parameter #3: The zero-indexed integer position to insert the item
    
Constraints
  1 <= n <= 1000
  Insertion index will be in the range [0, n]
  
Output Format
Your function should return the first Node of the Linked List with the new value inserted.

Sample Input:
  3 1 3 5 2 1
Sample Output:
  1,2,3,5
*/

public static SinglyLinkedListNode insert_at_position(SinglyLinkedListNode head, int val, int pos) {
        SinglyLinkedListNode temp = head;
        if(pos == 0) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
            newNode.next = head;
            head = newNode;
        }
        else {
            while(pos >= 0) {
                pos--;
                if(pos == 0) {
                    SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
        return head;
    }
