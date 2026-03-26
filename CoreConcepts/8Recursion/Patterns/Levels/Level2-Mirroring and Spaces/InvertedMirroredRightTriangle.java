
/*
        j -> col  - space, star
i v (rows)

              *    
            * *   
          * * *    
        * * * *    
         
   i=1 : sp=3 - 3,2,1, st=1 - 1
   i=2 : sp=2 - 2,1  , st=2 - 1,2
   i=3 : sp=1 - 1    , st=3 - 1,2,3
   i=4 : sp=0 -      , st=4 - 1,2,3,4

    st=i, sp=n-i
   logic :  i=1, i<=n, i++  ;  j=sp, j>=0, j-- ; j=st, j<=n, j++   

  
*/


public class InvertedMirroredRightTriangle {
    
}
