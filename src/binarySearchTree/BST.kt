package binarySearchTree

import com.sun.source.tree.Tree

data class TreeNode (val data: Int, var left: TreeNode?=null, var right: TreeNode?= null)

class BinarySearchTree {
    private var root: TreeNode? = null
//    insert
    fun insert(data: Int) {
        root = insertNode(data,root)
    }
    private fun insertNode(data: Int, node: TreeNode?): TreeNode? {
        if (node==null){
            return TreeNode(data)
        }
        if (data > node.data) {
            node.right = insertNode(data,node.right)
        }
        else if (data < node.data){
            node.left = insertNode(data, node.left)
        }
        return node
    }
    fun searchNode(data: Int): Boolean {
        return searchTree(data,root)
    }
    private fun searchTree(data: Int, node: TreeNode?): Boolean {
        if (node == null) {
            return false
        }
        else if (data == node.data) {
            return true
        }
        else if (data > node.data) {
            return searchTree(data, node.right)
        }
        else {
            return searchTree(data, node.left)
        }
    }
    fun inOrderTraversal() {
        traverseNode(root)
    }
    private fun traverseNode(node: TreeNode?) {
        if(node != null){
            traverseNode(node.left)
            print("${node.data} ")
            traverseNode(node.right)

        }
    }
    fun postOrderTraversal() {
        postOrder(root)
    }
    private fun postOrder(node: TreeNode?) {
        if (node != null) {
            postOrder(node.left)
            postOrder(node.right)
            print("${node.data} ")
        }
    }
    fun preOrderTraversal() {
        preOrder(root)
    }
    private fun preOrder(node: TreeNode?) {
        if (node != null) {
            print("${node.data} ")
            preOrder(node.left)
            preOrder(node.right)
        }
    }

}


fun main() {
    val tree = BinarySearchTree()
    tree.insert(90)
    tree.insert(3)
    tree.insert(2)
    tree.insert(47)
    tree.insert(35)
    tree.inOrderTraversal()


}