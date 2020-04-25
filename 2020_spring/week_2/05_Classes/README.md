# Classes (recall)

## Purpose

Here, we will talk about class. We will do some recalls

## Todo : 

### 1) Your second First class 

Declare one class name `Browser` in package 

    com.td.scala.classes


The class _Browser_ must have 3 attributes : 

    - version - Double : public immutable
    - kind - String : public immutable
    - platform - String : public immutable
 
    
### 2) Comparison : Semantic vs Reference

Here, we are dive in comparison feature.   
Create different kind of browser : 

    - Firefox version 1.0, on Platform : Windows, MacOs Linux
    - Chrome version 2.4, on Platform : Windows, Linux
    - Opera version 0.4, on Platform MacOs
    
Once instances have been created, make a comparison between Firefox and Chrome by equals' method. naturally, both instances are differents

Create two instance (with the same attributes values) for Chrome browser. Make a comparison as above. What do you note.

What we can do to change this behavior ? (think what do you would in Java context).
   
   
### 3) New version 

We are in immutable context. So each time that we want to change the internal state of an object, we have to recreate new one, with old values plus value updated.

New version of Chrome has been released : 2.5. Update the version on current instance of Chrome. 
To be sur that you update has been correctly done, display the version. 

### 4) one companion for life

To create a instance of a class, we need to used the `new` operator. Scala propose a mechanism to avoid this operator. 
For our `Browser` class create the dedicate companion object with the right method to allow instantiation without using the new operator 


## Summary

Here, we just played with the class structure to discover how we can do simples actions (as compare, update object, etc). 
We will see in the next td that Scala hold a really interested structure to ease those action.
