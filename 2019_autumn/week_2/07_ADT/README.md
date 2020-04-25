# Algebric Data Type

## Purpose

Here, we will talk about Algebric Data Type (ADT). This approch allows embrace the type system
 and make our code base more robust 
In this exercise, you will explore the flavor how construct a robust base code based 

## Todo : 

### 1) Make thing more formal

You will retrieve our case class `Browser` in package 

    com.td.scala.adt._1

From type system point of view, two attributes of this case class ask to be defined with a specific type.

both attribute sare : 
    - Kind
    - Platform

In each case, we have a limited number a possible value.

Make that two attributes have their specific type. 

kind will has following values : 

    - Firefox
    - Chrome
    - IE
    - Opera
    - Safari
    
Platform will has following values

    - Windows
    - Linux
    - MacOs
    
Types that you will declare must closed et they mustn't be extended outside of their context.
Requirements : organise those types by modules : 

    - types.kind
    - types.platform
    
tips : module == object nested


    
### 2) Release new version

You will retrieve our case class `Browser` in package 

    com.td.scala.adt._2

with the type system enhanced by Kind and Platform.

In this exercise, you have to implement `releaseVersion` method holded by the `utils.ReleaseManager` 

tips : This implementation must based on the case class characteristics

Check that the new release of the browser is not equals to old one 

### 3) Destructure your case class

Move to the following package 
 
    com.td.scala.adt._3

In the package you will find the following object `utils.DB`
DB provides one method which require a predicate as parameter. 

Your job here is to implement several predicates according the following specifications.

 - select all Firefox browsers
 - select all Chrome browsers compliant with Windows platform
 - select all browser with version equals to 1.0
 - select all Opera and IE browsers
 - select Chrome browser with version 3.4 and compliant with Linux Platform 
   

## Summary

In this exercise, we saw that the type system (throught ADT) help us to produce safe code.  
