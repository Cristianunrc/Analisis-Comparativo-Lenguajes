// Programa que muestra un ejemeplo de REFERENCIAS COLGADAS con listas dinamicas

#include <stdio.h>
#include <stdlib.h>

struct TNodo {
	int valor;
	struct TNodo * sig;
};

struct TNodo * punt, * punt1;

int main (){
	
	punt = NULL, punt1 = NULL; // inicializo ambos punteros en null.
	
	punt = (struct TNodo *) malloc (sizeof(struct TNodo));
	punt->valor = 6;
	punt->sig = NULL;
	
	// primero libero y luego asigno
	free (punt); // libero al puntero punt
	punt1 = punt; // a punt1 le asigno punt, y ademas punt ya se ha liberado.
	
	printf ("Valor referencia colgada: %d", punt1->valor);
	
	return 0;
}

