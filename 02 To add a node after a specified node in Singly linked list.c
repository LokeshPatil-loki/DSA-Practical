struct node* addAfterSpecifiedNode(struct node* s, int specifiedNode,int data){
    if(s == NULL){
        printf("List is Empty\n");
    }else{
        struct node* temp = s;
        while(temp != NULL){
            if(temp->data == specifiedNode){
                struct node* nn = (struct node*)malloc(sizeof(struct node));
                nn->data = data;
                nn->next = temp->next;
                temp->next = nn;
                return s;
            }
            temp = temp->next;
        }
        printf("List does not cointain specified node: %d that's why cannot add node after %d\n", specifiedNode,specifiedNode);
    }
    return s;
}

