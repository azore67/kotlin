package linkedList
class Student(val name: String, val age: Int, val grade: String, val id: Int) {
    var next: Student? = null
}
class StudentRecords {
    private var head: Student? = null
    fun isEmpty(): Boolean {
        return head == null
    }
    fun add(student: Student) {
        student.next = head
        head = student
    }
    fun remove(id: Int) {
        if (isEmpty()) {
            return
        }
        if (head!!.id == id) {
            head = head!!.next
            return
        }
        var current = head
        var previous: Student? = null
        while (current!= null && current.id != id) {
            previous = current
            current = current.next
        }
        previous!!.next = current?.next
    }
    fun find(id: Int): Student? {
        var current = head
        while (current!= null) {
            if (current.id == id) {
                return current
            }
            current = current.next
        }
        return null
    }



}

fun main() {

}