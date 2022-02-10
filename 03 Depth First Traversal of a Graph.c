
void DFS(int m[][SIZE],int v){
    int visited[SIZE], i, el, flag;
    struct Stack s;
    initS(&s);
    for(int i=0;i<SIZE;i++)
        visited[i] = 0;
    push(&s,v);
    visited[v] = 1;
    print("\nVisited Node: %d ",v);
    while(!isEmptyS(&s)){
        el = peek(&s);
        flag = 1;
        for(int i=0;i<SIZE;i++){
            if(m[el][i] == 1 && visited[i] == 0){
                push(&s,i);
                visited[i] = i;
                printf("%d ",i);
                flag = 0;
                break;
            }
        }
    }
    if(flag == 1){
        pop(&s);
    }
}

