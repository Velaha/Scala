import repository.ContactRepository
import service.ContactService

object AppContext {
  private val contactRepository: ContactRepository = new ContactRepository()
  val contactService: ContactService               = new ContactService(contactRepository)

}
