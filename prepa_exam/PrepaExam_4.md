# Préparation examen Scala (4) 

## Question 1 

Qu'est ce que le concept des _implicits_ ? 


## Question 2

Citez les différents cas d'usages des implicits

    - 
    - 
    - 

## Question 3 

Un des 3 est à proscrire, lequel ? et pourquoi ? 


## Question 4

Qui est en charge de traiter les implicits. 


## Question 7

Quels sont les scopes de résolution des implicits ? 

## Question 8

Que se passe t'il si lors de la résolution d'un implicit, deux candidats sont éligibles  ? 

## Question 9

Qu'est ce que _Type Class_ ? 

## Question 10

Quel est le premier élément décrit dans le cadre du type class ? 

## Question 11

// Typeclass Json
trait Json[T] {
  def serialize(t: T): String
}
// Typeclass user
def jsonFormat[T](t: T)(implicit ?A?: Show[T]) = ...

Comment s'appelle le paramètre nommé : _?A?_ ? 

## Question 12

Est ce que les types classes sont polymorphique ? Pourquoi ? 

## Question 13

Quel principe peut on respecter avec les types classes ? 

## Question 14

Expliquer de manière général le principe de _type class dérivé_ (Derived type class)

## Question 15

Peut on mixer le bounding context et les types classes ? 

