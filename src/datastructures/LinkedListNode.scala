package datastructures

class LinkedListNode[A](var value: A, var next: LinkedListNode[A]) {


    def prepend(valueB: A): LinkedListNode[A] =
    {
      var myList: LinkedListNode[A] = new LinkedListNode[A](value, next)
      var idek: LinkedListNode[A]= new LinkedListNode[A](valueB, myList)
      return idek
    }
}
