import repository.{ ContactRepository, ContactRepository }
import service.{ ContactService, ContactService }

object AppContext {
  private val contactRepository: ContactRepository = new ContactRepository()
  val contactService: ContactService               = new ContactService(contactRepository)

}
