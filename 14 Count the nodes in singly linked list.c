int countNodes(struct node* s){
    int count = 0;
    if(s == NULL){
        return count;
    }else{
        struct node *temp = s;
        while(temp != NULL){
            count++;
            temp = temp->next;
        }
    }
    return count;
}
