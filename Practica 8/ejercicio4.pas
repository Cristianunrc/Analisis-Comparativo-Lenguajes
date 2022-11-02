Program M;
Var a:integer; {variable global}

  Procedure P2(e:Char; Var f:integer; g:integer);

     Function fun(c:char; a:integer):integer;
       begin
	 {la funcion ord toma un caracter y lo transforma a su valor
          representativo en condigo ASCII}
         fun := ord(c) + a
       end;

  begin {cuerpo del proc P2}
    f := f + 1;
    g := fun(e,f); {invocacion de funcion fun dentro del cuerpo de P2}
    writeln(g) {imprime 129}
  end;

  Procedure P1(b:integer);
  Var c:Char; {variable local de P1}
  begin
   {la funcion chr toma un entero y lo convierte en su caracter
     representativo en codigo ASCII}
   c := chr(b);
   P2(c, b, a) {se invoca el proc P2 dentro del cuerpo del proc p1}
  end;

begin
 a := 64; {inicializacion de la var global}
 P1(a); 
end.
