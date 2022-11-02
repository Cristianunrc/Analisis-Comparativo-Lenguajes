Program P;

Var g:boolean;
	
	{funcion f2 que toma dos parametros, b es un parametro por referencia
	  e y es un parametro por valor, f2 retorna un integer}
	Function f2(Var b:boolean; y:integer):integer;
	
	begin {cuerpo de f2}
 	  if b then f2 := y + 1 else f2 := y - 1;
 	  b := not b
	end;
	
	{Procedimiento p1 que no toma parametros}
	Procedure p1;
	Var x:integer; {variable local de p1}
		
	   {funcion f1 definida dentro de proc p1}
	   Function f1(y:integer):integer;
	   
	   begin {cuerpo de f1}
 	    f1 := y + f2(g,y) {invocacion de f2 dentro de f1}
	   end;

	begin {cuerpo del proc p1}
 	  x := 1;
 	  x := f1(x) {invocacion de f1 en el cuerpo de p1}
	end;

begin {cuerpo principal P}
  g := True; {inicializacion de variable global}
  p1; {invocacion del proc p1 en cuerpo principal}
  writeln('Valor de g = ', g)
end.
