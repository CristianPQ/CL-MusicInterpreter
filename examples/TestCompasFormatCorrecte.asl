func main()
	ndo = 0;
	negra = 2.2;
	compas goodCompasI 2:4 [ndo 1, negra : ndo 2, negra | ndo, negra : ndo,negra | ndo, negra : ndo,negra  ];
	compas goodCompasII 3:2 [nre 1, blanca : ndo 2, blanca : ndo 2, blanca];
	compas goodCompasIII 1:4 [nre 1, corxera : ndo 2, corxera | nfa, corxera : ndo,semicorxera : ndo,semicorxera];
	compas goodCompasIIII 3:4 [nre 1, negra : ndo 2, blanca | nfa, blanca : ndo,corxera : ndo,corxera];
	write goodCompasI;
	write goodCompasII;
	write goodCompasIII;
	write goodCompasIIII;
endfunc
