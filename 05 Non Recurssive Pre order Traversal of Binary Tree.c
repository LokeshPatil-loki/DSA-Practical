 
void preorder(node *root){
    if(root == NULL){
        return;
    }
    struct Stack s;
    push(&s,root);
    while(!isEmptyS(&s)){
        struct node *node = peek(&s);
        printf("%d ",node->data);
        pop(&s);
        if(node->right != NULL){
            push(&s,node->right);
        }
        if(node->left != NULL){
            push(&s,node->left);
        }
    }
}

