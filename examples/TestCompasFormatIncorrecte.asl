func main()
	ndo = 0;
	negra = 2.2;
	compas badCompasI 2:4 [ndo 1, negra : ndo 2, negra | ndo, negra : ndo,negra | ndo, blanca : ndo,negra  ];
	compas goodCompasII 3:4 [nre 1, negra : ndo 2, blanca | ndo,corxera : ndo,corxera];
	write badCompasI;
	write goodCompasII;
endfunc
