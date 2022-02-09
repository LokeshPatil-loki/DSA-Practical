
struct node* addNode(struct node *root,int data){
    if(root == NULL){
        root = (struct node*)malloc(sizeof(struct node));
        root->data = data;
        root->left = NULL;
        root->right = NULL;
    }else{
        if(data < root->data){
            root->left = addNode(root->left,data);
        }else{
            root->right = addNode(root->right,data);
        }
    }
    return root;
}

