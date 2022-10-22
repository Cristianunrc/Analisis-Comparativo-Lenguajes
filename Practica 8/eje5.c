// Programa que muestra un ejemplo de como producir BASURA con listas dinamicas
#include <stdio.h>
#include <stdlib.h>

struct Nodo {
	int info;
	struct Nodo * next;
};

struct Nodo * p = NULL; // inicializo el puntero p en NULL

int main (){
	
	p = (struct Nodo *) malloc (sizeof(struct Nodo));
	p->info = 10;
	p->next = NULL;
	
	struct Nodo * q = NULL; // inicializo al puntero q en null
	q = p;
	
	free (q); // se libera el puntero q y automaticamente tambien se libera el puntero p
	
	printf ("Valor basura: %d", q->info); // se muestra basura, tambien puede hacerse: p->info
	
	return 0;
}
