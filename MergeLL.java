
class ListNode{
    ListNode next;
    int val;

    ListNode(int val){
        this.val=val;
    }
}
class MergeLL{
    public static void main(String[] args){
    ListNode list1=new ListNode(10);
    list1.next=new ListNode(40);
    list1.next.next=new ListNode(50);

    ListNode list2=new ListNode (20);
    list2.next=new ListNode(60);
    list2.next.next= new ListNode(70);

    ListNode result = mergeLL(list1, list2);

    printList(result);
        
    }
    static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val + " -> ");

            head = head.next;
        }

        System.out.println("NULL");
    }

    static ListNode mergeLL(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }

            else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        }

        if (list2 != null) {
            curr.next = list2;
        }

        return dummy.next;
    }
}