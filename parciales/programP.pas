Program P;
var x, y: integer;

	procedure swap (a: integer; var b: integer); {a es por valor y b por referencia}
	begin {cuerpo del swap}
		a := a + b;
		b := a - b;
		a := a - b;
	end;

	procedure inc (b: integer); {b es por valor}
	  var x: integer;
		procedure duplicar (a: integer); {a es por valor}
		begin {cuerpo de duplicar}
			a := a * 2;
		end;
	begin {cuerpo de inc}
		x := b;
		duplicar (x);
	end;

begin {cuerpo principal}
	x := 5;
	y := 7;
	swap (x, y);
	inc (x);
	writeln(x); {imprime 5}
	writeln(y); {imprime 5}
end.
