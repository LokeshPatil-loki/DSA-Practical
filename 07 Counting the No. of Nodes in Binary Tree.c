
int countNodes(struct node* node){
    int i = 0;
    if(node == NULL){
        return i;
    }
    i++;
    printf("%d ",node->data);
    i += countNodes(node->left);
    i += countNodes(node->right);
    return i;
}

