import repository.{ ContactRepository, ContactRepositoryImpl }
import service.{ ContactService, ContactServiceImpl }

object AppContext {

// ici nous utilisons l'injection de dépendance à la compilation.
// En d'autre terme, nous créons nous même notre grappe d'objets
  private val contactRepository: ContactRepository = new ContactRepositoryImpl()
  val contactService: ContactService               = new ContactServiceImpl(contactRepository)

}
