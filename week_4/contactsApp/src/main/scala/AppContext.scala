import repository.{ContactRepository, ContactRepositoryImpl}
import service.{ContactService, ContactServiceImpl}

object AppContext{


  private val contactRepository:ContactRepository = new ContactRepositoryImpl()
  val contactService:ContactService = new ContactServiceImpl(contactRepository)


}