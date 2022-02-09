
int countLeafNodes(struct node* node){
    int i = 0;
    if(node == NULL){
        return i;
    }
    if(node->left==NULL && node->right==NULL)
        i++;
    i += countLeafNodes(node->left);
    i += countLeafNodes(node->right);
    return i;
}

