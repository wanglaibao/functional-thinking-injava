#            Functional Programming Introduction

###  1: Root Source of Functional Programming and Some Functional Programming Language

* Category Theory has been a fruitful source of ideas for functional programming.
        【范畴论理论是函数式编程语言的数学思想源泉】
* The first language to incorporate functional programming ideas was Lisp.

* The best known functional language that comes closest to pure function is Haskell.

* Other functional languages include Clojure, Scala and Kotin, all of which run on the JVM.

* Java 8 now has some functional features such as lambda expression,stream api and functional interface.


###  2: The Basic Principles of Functional Programming
* Prefer immutable values over mutable values

  mutable values will make multi thread programming too difficult. 
  because multiple threads can modify the same shared value, so have to synchronize access to that value. 
  but it is quite tedious and error-prone.
  If we make a value immutable, the synchronization problem disappears. Concurrent reading
  is harmless, so multithreaded programming becomes far easier.
  
  
* Functions as First-Class Values
   
   
   