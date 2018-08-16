#            Functional Programming Introduction

### 0: some idea we should keep in mind nowdays
* It is not a better to use object-oriented programming (OOP) as our primary solution to 
  develop software system , we can think of functional way now.
  
* functional programming (FP) is the best way to approach concurrency

* The topic of functional programming include currying, partial application, and comprehensions. 
   combinator, laziness, and monad.

###  1: functional programming offers the best approach to meet the following challenges


*

*

*

###  2: Root Source of Functional Programming and Some Functional Programming Language

* Category Theory has been a fruitful source of ideas for functional programming.
        【范畴论理论是函数式编程语言的数学思想源泉】
* The first language to incorporate functional programming ideas was Lisp.

* The best known functional language that comes closest to pure function is Haskell.

* Other functional languages include Clojure, Scala and Kotin, all of which run on the JVM.

* Java 8 now has some functional features such as lambda expression,stream api and functional interface.


###  3: The Basic Principles of Functional Programming

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

    In mathematics, functions never have side effects, meaning they are side-effect-free. 

* Recursion

   Recall that functional programming in its purest form doesn’t allow mutable values.
   That means we can’t use mutable loop counters to iterate through a collection.
   
   The classic functional alternative to an iterative loop is to use recursion, where each
   pass through the function operates on the next item in the collection until a termination
   point is reached
   
   Recursion is also a natural fit for certain algorithms, such as traversing
   a tree where each branch is itself a tree.

* Lazy vs. Eager Evaluation
    
  Mathematics defines some infinite sets, such as the natural numbers (all positive integers).
  
  Any particular finite subset of values is evaluated only on demand. We call this lazy evaluation.
  
  Eager evaluation would force us to represent all of the infinite values, which is clearly impossible.
  
  lazy evaluation is useful for deferring expensive operations until needed or
  never executing them at all.
    

* Declarative vs. Imperative Programming
   
   
   
   
   
### 4:functional programming resouces

[Functionallambda] (http://www.functionaljava.org/)

[functionaljava] (https://github.com/functionaljava/functionaljava)

[functionaljava.github.io] (https://github.com/functionaljava/functionaljava.github.io)

[BecomingFunctional] (https://github.com/jbackfield/BecomingFunctional)

[Learn Functional Programming In Java (2)]  (https://zhuanlan.zhihu.com/p/24553892)

[Functional Programming in Java]    (https://zhuanlan.zhihu.com/fpjava)
[Learn Functional Programming In Java (9) -Thinking Java functionally]  (https://zhuanlan.zhihu.com/p/24652782)

[compare-fp]    (https://github.com/corneil/compare-fp)

[OnJava8-Examples:  Think in java 5]    (https://github.com/BruceEckel/OnJava8-Examples/)