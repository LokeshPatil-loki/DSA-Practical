
void BFS(int m[][SIZE],int v){
    int visited[SIZE],i;
    struct Queue q;
    intiQ(&q);
    for(int i=0; i<SIZE;i++)
        visited[i] = 0;
    enqueue(&q,v);
    visited[v] = 1;
    while(!isEmptyQ(&q)){
        int el = dequeue(&q);
        printf("\nVisited Node: %d",el);
        for(int i=0;i<SIZE;i++){
            if(m[el][i] == 1 && visited[i] == 0){
                insert(&q,i);
                visited[i] = 1;
            }
        }
    }
}

