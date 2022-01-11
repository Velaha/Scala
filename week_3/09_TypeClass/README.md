# Type class

## Purpose

Here, we will talk about _typeclass_ and we try to understand the mechanism
In this module you have one base code to be fill. Read instructions, it will drive you step by step.

## Instructions

Create your own bank `LaNef()`

### 1) Need converter

Based on the `trait Converter`, implement implicits converters.
Converter defined one exchange between two currencies with a fixed rate (in our case).

### 2) Fill Bank trait implementation

We have one trait that define the contract for a bank.
You have to fill the implicit parameter and provide an implementation of the Bank trait (based currency of the bank, choose EUR)

### 3) Exchange, Exchange...

In class `Main`, from your bank, make different exchange from EURO to USD, JPN and your own currency


## Summary

Here, we introduced the typeClass's mechanism.
We see how typeClass will help us to extends our code based in respect of open/close paradigm
