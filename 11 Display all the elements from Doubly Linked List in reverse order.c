
void displayListReverse(struct node* s){
    if(s == NULL){
        printf("Empty List\n");
    }else{
        struct node* temp = s;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->prev;
        }
    }
}

