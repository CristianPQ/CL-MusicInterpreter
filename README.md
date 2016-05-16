# CL-MusicInterpreter
Compilers project:
Albert Pérez Toro
Cristian Miguel Pinto Quinto

# TODO #
- DATA
	- Note : integer
		- Autodefinir notas (se define negra, autodefinir corchera, semicorchera, etc)
		- Distinguir entre do, do1, do2, do3, etc
		EXTRA: - default
		EXAMPLE:
			n = 1 , y luego se le pasa al play
				Buscar equivalencias:
					0 --> do
					1 --> re
					...
	- Duration : double : seconds
		- De defina una duracion, y se autodefine el resto
		- Definimos las duraciones como: rodona, blanca, negra, corxera, semicorxera
		
		
		EXTRA: - default
		EXAMPLE: 
			d = 1 --> un segundo

	EXTRA: - Compas :   :: Conjuntos de notas, un 3-4 es que tiene durada de 3 negras, 
		- Definir
		- Comprobar que los compases tengan la duración correcta
		- marca de inicio y fin
		- var = compas(numerador, denominador, numNotas)
		EXAMPLE:
			n = 1 --> do = 1 (uno por encima)
			d = 1 --> redonda = 1 seg

			c = Compas(2, 4, 6)
				note(do, negra)
				note(re, blanca)
				...
			endCompas


- FUNCTION
	- play: initialNote + Duration --> hacer sonido, buscar libreria

- OTHERS
	DONE - if else
	EXTRA: - for


# REPARTICIÓN #
- ALBERT:
	- Duration

- CRISTIAN:
	- Note

- others: Compass
