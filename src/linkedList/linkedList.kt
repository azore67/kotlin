package linkedList

data class Node(val data: Int, var next: Node?=null)

class LinkedList {
    var head: Node? = null
    fun insertNode(data:Int) {
        val newNode = Node(data)
        newNode?.next = head
        head = newNode

    }
}