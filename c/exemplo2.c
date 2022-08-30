#include <stdio.h>
int main(){
	int num,valor;
	int *p;
	num=55;
	p=&num;
	valor=*p;
	printf("\n\n%d variavel valor: ",valor);
	printf("\nEndereco para onde o ponteiro aponta: %p", p);
	printf("\nValor da variavel apontada: %d", *p);
	return(0);
}
