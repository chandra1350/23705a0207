Class LinkedList {
    void insertPos(int data,int pos) {
        Node newNode = new Node(data);
        Var length = o;
        Var temp = head;
        while (temp!=null) {
            length = length+1;
            temp = temp.next;
        }
        if(pos>=0 && poc<=length) {
            if(pos==0)
            insertBeg(data);
            elseif(pos==length)
            insertend(data);
        }
     else {
        temp=head;
        for(int i=1; i<pos; i++) {
            temp = temp.next;
        }
        newNode,next = temp.next;
        temp.next = newNode;
    }else {
    System.out.println("the pos is in valid");

}
 Node getHead() {
     returnhead;
}
    
    }