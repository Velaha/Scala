# Real world

## Purpose

The exercice aims to implement features in 'real" web application

## How it works

To launch the web server: 

 1) Start sbt
 2) type `project week_4`
 3) type `run`

From your browser, run the following request :

`http://localhost:8080/api/test`

Endpoints availables : 

  - GET http://localhost:8080/api/contacts/:id -> read on contact by its id
  - DELETE http://localhost:8080/api/contacts/:id -> delete one contact by its id
  - POST http://localhost:8080/api/contacts/ with payload 
    >{
    "lastName":"Randant",
    "firstname":"Michel",
    "mail":"M.randant@mail.com"
    }
  - GET  http://localhost:8080/api/search?field=lastname&value=*** -> `to be implemented


## Instructions

### 1) JsonFormat

Data format of HTTP endpoints must in JSON. 
Currently, a simple access to the 'toString' method is used to convert Contact instance to serializable representation  

- We have to find a general solution to format a Contact case class instance. 
- Solution must be extensible in transparency manner

*Tips : Look at 'formater' package. Base your implementation on the trait defined in and the typeClass Pattern.* 

### 1) Search feature

Contacts web app manage your contacts list. You can add one contact, get one contact, remove on contact.
Now we want to add a new feature : search engine that aims to find a contact by criteria

- In HttpWebApp class, one endpoint is declared with a call on contactService : 
  
>} ~ path("api" / "search") {
    get {
      parameters('field, 'value) { (field: String, value: String) =>
      onComplete(Future(AppContext.contactService.searchContact(field, value)))(contacts =>
      complete(OK -> convert(contacts).toString)
    )
  }
}

This endpoint wait for two parameters in queryString : `Field` and `value`. Those parameters are the search criterias.
Field : contains the field on the search will be run, Value : contains the information that we are searching

- Implementation must be done in ContactService class.
- Implentation must rely on ConctactRepository class.
- No strict constraints is required here, you have to code  efficient solution based on type system
    
