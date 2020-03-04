package repository

import model.Contact

import scala.collection.mutable

trait ContactRepository {
  def insert(contact: Contact): Contact
  def delete(idContact: Long): Option[Contact]
  def getById(idContact: Long): Option[Contact]

}

class ContactRepositoryImpl extends ContactRepository {

  var sequence: Long                      = 0
  var storage: mutable.Map[Long, Contact] = mutable.Map[Long, Contact]()

  override def insert(contact: Contact): Contact = {
    val nextId = incrementSequence
    val c      = contact.copy(id = Some(nextId))
    storage = storage.+((nextId, c))
    c
  }

  override def delete(idContact: Long): Option[Contact] =
    storage.remove(idContact)

  override def getById(idContact: Long): Option[Contact] =
    storage.get(idContact)

  private def incrementSequence: Long = {
    sequence += 1
    sequence
  }
}
