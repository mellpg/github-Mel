algoritmo "repita"
var
 n,s:inteiro
 resp:caractere
inicio
 s<-0
 resp<- "s"
repita
   escreva( "digite um valor:")
   leia(n)
   s <- s+n
   escreva("voce quer continuar?:")
   leia(resp)
ate ( resp= "n")
    escreval("a soma de todos os resultados foi:" , s )
    

fimalgoritmo