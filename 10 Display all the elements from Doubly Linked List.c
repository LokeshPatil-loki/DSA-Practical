
void displayList(struct node* s){
    if(s == NULL){
        printf("Empty List\n");
    }else{
        struct node* temp = s;
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

