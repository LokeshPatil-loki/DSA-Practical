
struct node* deleteNthNode(struct node* s,int n){
    if(s == NULL){
        printf("List is empty\n");
    }else if(n < 1){
        printf("Position starts from 1\n");
    }else if(n == 1){
        struct node* temp = s;
        s = s->next;
        free(temp);
    }else{
        int i = 1;
        struct node* temp = s;
        while (temp != NULL)
        {
            if(i == n){
                break;
            }
            temp = temp->next;
            i++;
        }
        if(i == n){
            struct node* ptr = temp->prev;
            ptr->next = temp->next;
            free(temp);
        }else{
            printf("List contains only %d elements\n",i-1);
        }
    }
    return s;
}

