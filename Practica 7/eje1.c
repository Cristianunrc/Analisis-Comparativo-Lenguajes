// Programa que calcula una operacion de +, -, * o /.

#include <stdio.h>

int suma (int a, int b);
int resta (int a, int b);
int producto (int a, int b);
void division (int a, int b);

int main (){
	
	char op;
	int x, y, result;
	
	printf ("Ingresar un operador (+, -, *, /): ");
	scanf ("%c", &op);
	printf ("Ingesar primer operando: ");
	scanf ("%d", &x);
	printf ("Ingresar segundo operando: ");
	scanf ("%d", &y);
	
	switch (op){
		
		case '+' : result = suma (x, y);
				break;
		
		case '-' : result = resta (x, y);
				break;
		
		case '*' : result = producto (x, y);
				break;
		
		case '/' : division (x, y);
				break;
			
		default:
			printf ("El caracter ingresado no es un operador de +, -, * o / ."); 
	}
	
	if (op == '+' || op == '-' || op == '*'){
		printf ("Resultado: %d", result);
	}
	
	return 0;	
}

int suma (int a, int b){
	return (a + b);
}

int resta (int a, int b){
	return (a - b);
}

int producto (int a, int b){
	return (a * b);
}

void division (int a, int b){
	if (b == 0){
		printf ("Error matematico.");
	}else{
		int r = (a / b);
		printf ("%d ", r);
	}
}
