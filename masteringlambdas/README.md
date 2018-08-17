##     Mastering Lambdas: Java Programming in a Multicore World

### 0: thinking about abstraction【powerful tools for abstraction】

* inheritance and generics, which are largely about abstracting over data.

* Lambda expressions complement these by giving us a better tool for abstracting over behavior.

* embrace OOP and FP,use them together

  while it might seem that object-oriented programming and functional programming are competing disciplines, 
  they offer us complementary tools for managing program complexity. 
  and, as hardware parallelism continues to increase, the building blocks of functional programming【immutable values and pure functions】
  become even more effective tools for managing that complexity.
  
### functional interface

        /**
         *  函数式接口的抽象方法不可以是
         *  下述三个方法中的任何一个，他们是Object的
         *  默认所有的接口都继承的，函数式接口可以定义
         *  三个方法的一个或者几个以便实现类进行重写
         */
        boolean equals(Object obj);
        String toString();
        int hashCode();
  
  
  
  
 #### 网上的资源
 
 [Java8资料汇总重点]  (https://wizardforcel.gitbooks.io/java8-tutorials/content/index.html)
 
 [Lambda FAQ]   (http://www.lambdafaq.org/)
 
 [ByteBuffer（HeapByteBuffer与DirectByteBuffer）]  (http://songwie.com/articlelist/120)
 
 [songwie-framework]    (https://github.com/songwie/songwie-framework)
 
 [Groovy,Java8&VirtualExtensionMethods] (https://blog.andresteingress.com/2012/10/22/groovy-java-8-virtual-extension-methods)
 
 [Java8使用lambdas和重载方法的模糊性]  (https://codeday.me/bug/20171018/87731.html)
 
 [深入理解Java8Lambda]  (https://www.cnblogs.com/figure9/p/java-8-lambdas-insideout-language-features.html)
 
 [应用fork-join框架]    (https://www.ibm.com/developerworks/cn/java/j-jtp11137.html)
 
 [AnIntroductionTo java.util.stream library]    (https://www.ibm.com/developerworks/library/j-java-streams-1-brian-goetz/index.html)
 
 
 
 http://wiki.jvmlangsummit.com/images/a/a1/2011_Goetz_Extension_Slides.pdf
 
 http://wiki.jvmlangsummit.com/images/7/71/2011_Goetz_Extension.pdf