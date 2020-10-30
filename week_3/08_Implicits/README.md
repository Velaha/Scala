# Classes (recall)

## Purpose

Here, we will talk about implicits.

## Todo : 

### 1) Addition of Option

We want to implement some function that allow us to addition two Option[A]

We mean that we want to addition the type contained into both options : 

    val a:A
    val b:A

    val o1:Option[A] = Some(a) + Some(b)
    o1 should be equals to Some(a+b) 
    
For our implementation, we will use Int as A type.    


### 2) Enhance Option type

In exercise above, we implemented functions. Those functions are not directly invoked on the option. 

Now we want enhance the Option type by invoking our function directly on the Option type


### 3) Option[A] + a:A 

Now add a new function that allows to add one option[Int] and a simple value of type Int


### 4) Bonus (not mandatory)

Try to make things more generic and provide an implementation (based on implicits) that allow to add every kind of types...


## Summary

Here, we see how, with implicit mechanism, we can help us to enhance a standard type. It could usefull in some case.  