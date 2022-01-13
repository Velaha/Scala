# Préparation examen Scala (2) 

## Question 1 

Comment rendre les Classes plus pratiques? 

    - 
    -
    -

## Question 2

Quel pattern est implémenté avec les cases classes ? 



## Question 3

Dans une case classe, les parametres du constructeur sont-ils accessibles sur l'instance?  si oui pourquoi? 


## Question 4

 `case class Voiture(year:Int)`
 `val car1 = Voiture(1985)`
 `val car2 = Voiture(1985)`

 println(car1 == car2) 

Quel résultat sera affiché ? Pourquoi? 

## Question 5

Peut-on utiliser le mot clef new pour instancier une case class?  _(Bien lire la question...)_


## Question 6

A quoi sert la méthode : 

`def unapply(..):Option[...]` 

pour une case classe ?

## Question 7


`case class Vehicule(year:Int)`
`case class Voiture(year:Int) extends Vehicule`

Est ce que ce code compile ? Pourquoi ?

## Question 8 

Combien d'instance maximum peut-on trouver dans la JVM pour un `case object`  ? Pourquoi ?

## Question 9

Comment déclare t'on un companion object pour une classe ? 

## Question 10

Quelles sont les caractéristiques d'un **Trait**

 - 
 -
 -

## Question 11

Pourquoi utiliser un sealed trait ? 

## Question 12

Le pattern matching est une expression ou un statement? 

## Question 13

Expliquer (brièvement) les termes suivants dans le cadre du pattern matching : 

 - Guards : 
 - Union : 
 - Casting : 
 - Binder : 

## Question 14

Que signifie le sigle `ADT` ?  Que permet un `ADT` ? 

## Question 15

Expliquer dans le context d'un `ADT` : 

 - Product type : 
 - Sum type : 

## Question 16

Dans la hiérarchie des types en Scala, donner les grandes familles de type (3 attendus) ainsi que le `Bottom` type.

## Question 17

A quoi sert le `Bottom` type ? 

## Question 18

A quoi sert le type `Null` ?  

## Question 19


Quel est le type de la valeur suivante : 

 `val f = (a:Int, b:Int) => b+a`







