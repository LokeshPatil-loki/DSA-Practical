struct node* addBeforeSpecifiedNode(struct node* s, int specifiedNode,int data){
    if(s == NULL){
        printf("List is Empty\n");
    }else if(s->data == specifiedNode){
        struct node* nn = (struct node*)malloc(sizeof(struct node));
        nn->data = data;
        nn->next = s;
        s = nn;
        return s;
    }else{
        struct node* temp = s;
        struct node* previous = NULL;
        while(temp != NULL){
            if(temp->data == specifiedNode){
                struct node* nn = (struct node*)malloc(sizeof(struct node));
                nn->data = data;
                nn->next = temp;
                previous->next = nn;
                return s;
            }
            previous = temp;
            temp = temp->next;
        }
        printf("List does not cointain specified node: %d that's why cannot add node before %d\n", specifiedNode,specifiedNode);
    }
    return s;
}
