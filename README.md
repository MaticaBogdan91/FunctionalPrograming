# Functional Programing in Java , using Streams   ( using Pokemons  example)

Project main purpose to use FunctionalPrograming because it avoid concepts of shared state, mutable data observed in Object Oriented Programming. 

 Stream API is used to proces collections of object : LIST,SET,MAP, being a sequence of objects that supports various methods to produce te desired result

 Stream is not a data structure instead it takes input from the Arrays or Collections 

 Terminal opreations mark the end of the stream and return the result 

 Intermediate Methods of Stream in Java -  Intermediate operators  do not execute until a terminal operation is invoked , they are not executed until is actually neded

 Most frecvently used : filter(predicate) , sorted() , distinct() , map() ,limit() , skip(),mapToObj() = all of them they return one Stream , and we write them just
when we have Terminal Operations 

 Terminal methods of Stream in Java - is an operation that start internal iteration of elements, call all the listeners , and returns a result

 We can have Temrinal methods : Collect() ,forEach(),toArray(),min(),max(),count(),reduce(),anyMatch(),allMatch(),noneMatch()

 In my project I used pokemon exampels  where we can thake them one by one and chek witch pokemon has name pikachu , as Intermediar operation we schould se returned just the pokemon with name pikachu , 

 We have in this project Lambdas Expressions and  Functional Interfaces as : Predicate witch is a functional Interface witch means we can pass it in lambda expresions wherever a predicate is expected , 
  Predicates =  they evaluate an expresion and return a boolean value , has as method boolean test (T t). ( intermediate )

 Function =  accepts one argument and produce a result  = recive an argument and produce a result. ( intermediate )

 Consumer = accepts a single argument and return no result because is a consumer, has method accept(T t) , andThen() . ( terminal) 

 Suplier  =  does not take in any argument but produces a value of type T , has as method get() .(terminal )
 
 https://www.geeksforgeeks.org/functional-programming-paradigm/


