package service

import model.Contact
import repository.ContactRepository

trait ContactService {

  def getContact(idContact: Long): Option[Contact]
  def suppressionContact(idContact: Long): Option[Contact]
  def createContact(contact: Contact): Contact
  def searchContact(field: String, value: String): Seq[Contact]

}

class ContactServiceImpl(contactRepo: ContactRepository) extends ContactService {
  override def getContact(idContact: Long): Option[Contact] =
    contactRepo.getById(idContact)

  override def suppressionContact(idContact: Long): Option[Contact] = contactRepo.delete(idContact)

  override def createContact(contact: Contact): Contact = contactRepo.insert(contact)

  override def searchContact(field: String, value: String): Seq[Contact] = ???
}
