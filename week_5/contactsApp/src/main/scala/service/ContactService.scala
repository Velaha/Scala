package service

import model.Contact
import repository.ContactRepository



class ContactService(contactRepo: ContactRepository)  {
  def getAllContacts: Seq[Contact] =
    contactRepo.getAll

  def getContact(idContact: Long): Option[Contact] =
    contactRepo.getById(idContact)

  def suppressionContact(idContact: Long): Option[Contact] = contactRepo.delete(idContact)

  def createContact(contact: Contact): Contact = contactRepo.insert(contact)

  def searchContact(field: String, value: String): Seq[Contact] = ???
}
