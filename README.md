#            Functional Programming Introduction

   The topic of functional programming include currying, partial application, and comprehensions. 
   combinators, laziness, and monads.

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
   
   functions as first-class values,that mean we cant pass a function
   as an argument to another function, return a function from a function, or assign a function
   as a value to a variable
   
* Lambdas and Closures

  anonymous function with just the argument list and the body.
  
* Higher Order Functions

    functions that take other functions as arguments or return them as results is a.k.a higher order functions.
     
   【备注：Before java 8, Java methods are limited to primitives and objects as arguments and return values】
   
    Higher order functions are a powerful tool for building abstractions and composing behavior 
    and also promote reUsability.
    

* Side-Effect-Free Functions

* Recursion

* Lazy vs. Eager Evaluation

* Declarative vs. Imperative Programming
   
   
   
   
   
### 3:functional programming resouces
[Functional lambda](http://www.functionaljava.org/)
[functionaljava] (https://github.com/functionaljava/functionaljava)
[functionaljava.github.io](https://github.com/functionaljava/functionaljava.github.io)