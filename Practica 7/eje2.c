// Programa que dice si un numero dado es perfecto, sino lo es no dice nada.

#include <stdio.h>
#include <math.h>

int main(){

	int i, numero;
	printf ("Digite un numero para verificar si es perfecto: ");
	scanf ("%d", &numero);
	
	i = 1;		
	while (i < numero){
		
		if ( pow(2,i-1) * (pow (2, i) - 1) == numero){ // 2 ^ (i - 1) * ((2 ^ i) - 1)
			printf("El numero %d es perfecto.", numero);
		}
		
		i++;
	} 

	return 0;
}