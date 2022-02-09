struct node* removeLastNode(struct node* s){
    if(s == NULL){
        printf("List is already Empty\n");
    }else if(s->next == NULL){
        free(s);
        return NULL;
    }else{
        struct node *temp, *previous;
        temp = s;
        previous = NULL;
        while(temp->next != NULL){
            previous = temp;
            temp = temp->next;
        } 
        previous->next = NULL;
        free(temp);
    }
    return s;
}
