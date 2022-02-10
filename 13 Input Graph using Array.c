
void inputGraph(int m[][SIZE])
{
	int i,j;
	printf("\nEnter Adjacency Matrix\n");
	for(i=0;i<SIZE;i++)
	{
		for(j=0;j<SIZE;j++)
		{
			scanf("%d",&m[i][j]);
		}
	}
}

