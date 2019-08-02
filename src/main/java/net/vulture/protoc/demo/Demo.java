package net.vulture.protoc.demo;

import net.vulture.grpc.demo.AddressBook;
import net.vulture.grpc.demo.Person;

public class Demo {

   public static void main(String[] args) {
      Person john = Person.newBuilder()
            .setId(1234)
            .setName("Joe")
            .build();

      AddressBook book = AddressBook.newBuilder()
            .addPeople(john)
            .build();

      int size = book.getSerializedSize();

      System.out.println(john.getName() + " " + size);

   }
}
