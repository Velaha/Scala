# Case classes

## Purpose

Here, we will talk about case class. 
In this exercise, you will see how the case class will ease your life developer

## Todo : 

### 1) Same but with case class

Declare one case class name `Browser` in package 

    com.td.scala.case_classes


The class _Browser_ must have 3 attributes : 

    - version - Double : public immutable
    - kind - String : public immutable
    - platform - String : public immutable
 
*tips: for a case class, all fields are public and immutable by default*
    
### 2) Comparison : Semantic vs Reference

Here, we are diving in comparison feature.   
Create different kind of browser : 

    - Firefox version 1.0, on Platform : Windows, MacOs Linux
    - Chrome version 2.4, on Platform : Windows, Linux
    - Opera version 0.4, on Platform MacOs
    
Once instances have been created, make a comparison between Firefox and Chrome by equals' method or == operator. naturally, both instances are differents

Create two instance (with the same attributes values) for Chrome browser. Make a comparison as above. What do you note.

We will see here that the behavior of case class is different than class. If you need same semantic than class, you can use `eq` and `ne` methods. 
Both methods are based on reference comparison
   
   
### 3) New version 

We are in immutable context. So each time that we want to change the internal state of an object, we have to recreate new one, with old values plus value updated.

New version of Chrome has been released : 2.5. Update the version on current instance of Chrome. In this context, take a look at the `copy` method.
To be sur that you update has been correctly done, display the version. 

### 4) one companion for life

You should notice for the case class, the companion object isn't required. At this stage, 
the companion object provide nothing more (wait until will cover implicit feature)

## Summary

Here, we discovered the case class feature. It is a central feature in scala language. Case class provide plenty on methods which ease and clarify our code base 
