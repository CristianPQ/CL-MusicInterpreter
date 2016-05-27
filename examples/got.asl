func main()
  ndo = 0;
  negra = 0.5;

  i = 0;

  while i < 10 do

  
  ndo = i;

  i = i + 2;
  
  play nla blanca;
  play nre negra;
  play nfa corxera;
  play nsol corxera;
  play nla blanca;
  play nre negra;
  play nfa corxera;
  play nsol corxera;
  play nmi blanca;

  endwhile;

  ndo = 0;
  i = 0;

  while i < 10 do

  negra = negra / 2;

  i = i + 2;

  play nla blanca;
  play nre negra;
  play nfa corxera;
  play nsol corxera;
  play nla blanca;
  play nre negra;
  play nfa corxera;
  play nsol corxera;
  play nmi blanca;

  endwhile;
	
  play nsol blanca;
  play ndo negra;
  play nfa corxera;
  play nmi corxera;
  play nsol blanca;
  play ndo negra;
  play nfa corxera;
  play nmi corxera;
  play nre blanca;

  

endfunc
