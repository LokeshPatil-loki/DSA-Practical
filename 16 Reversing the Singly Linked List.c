struct node* reverseLinkedList(struct node* s){
    struct node *prev, *temp, *afterTemp;
    prev = NULL;
    temp = NULL;
    while(s != NULL){
        temp = s->next;
        s->next = prev;
        prev = s;
        s = temp;
    }
    return prev;
}
