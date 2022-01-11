package repository

import model.Contact

import scala.collection.mutable



class ContactRepository  {
  //Only for the TP, don't reproduce this in real life!
  var sequence: Long                      = 0
  var storage: mutable.Map[Long, Contact] = mutable.Map[Long, Contact]()

  def insert(contact: Contact): Contact = {
    val nextId = incrementSequence
    val c      = contact.copy(id = Some(nextId))
    storage = storage + ((nextId, c))
    c
  }

  def delete(idContact: Long): Option[Contact] =
    storage.remove(idContact)

  def getById(idContact: Long): Option[Contact] =
    storage.get(idContact)

  def getAll: Seq[Contact] =
    storage.seq.values.toSeq

  private def incrementSequence: Long = {
    sequence += 1
    sequence
  }
}
