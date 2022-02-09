
int computeHeight(struct node* node){
    if(node == NULL){
        return -1;
    }
    int leftHeight = computeHeight(node->left);
    int rightHeight = computeHeight(node->right);
    return (leftHeight > rightHeight ? leftHeight : rightHeight)+1;
}

