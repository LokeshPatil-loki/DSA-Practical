struct node* deleteNthNode(struct node* s,int n){
    int count = 0;
    struct node *temp = s;
    while(temp != NULL){
        count++;
        temp = temp->next;
    }
    if(n == 0){
        printf("Sorry, Position start from 1\n");
    }else if(count < n){
        printf("There only %d elements in list\n",count);
    }else if(n == 1){
        temp = s;
        s = s->next;
        free(temp);
    }else{
        int i = 1;
        struct node *temp,*prev;
        temp = s;
        prev = NULL;
        while (i < n)
        {
            prev = temp;
            temp = temp->next;
            i++;
        }
        prev->next = temp->next;
        free(temp);
    }
    return s;
}

