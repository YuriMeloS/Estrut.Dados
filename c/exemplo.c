#include <stdio.h>
int main(){
	int count = 10;
	int *pt;
	pt = &count;
	
	printf("\nvalor de count:%d", count);
	printf("\nvalor de pt:%d",pt);
	printf("\nvalor do comteudo de pt:%d",*pt);
	return 0;
}
