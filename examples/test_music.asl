func starwars(n, d)
   la=n;   // starting note
   fa=n-5; // minus 5 half-tones
   do=n+3; // plus 3 half-tones

   rodona=d;  
   blanca=d/2;
   negra=d/4;
   corxera=d/8;
   semicorxera=d/16;

   i = 1
   while(i<=3) DO 
     play(la,negra)
     i = i+1
   endwhile
   
   for (i=1; i<=2; i++) {
     play(fa,3*semicorxera);
     play(do,semicorxera);
     if (i==1) play(la,negra);
     else play(la,blanca);
   }
endfunc

