/*
You are given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending
order. Delete nodes and return a sorted list with each distinct value in the original list. The given head pointer
may be null indicating that the list is empty.

Example:
head referes to the first node in the list 1->2->2->3->3->3->3->null
Remove duplicate values gets you 1->2->3->null
*/

public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode temp = llist;

        while(temp.next != null) {
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return llist;
    }
