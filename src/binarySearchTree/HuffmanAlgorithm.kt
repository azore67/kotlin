package binarySearchTree

data class TN(val char: Char, val frequency: Int, var left: TN? = null, var right: TN? = null)

class BST{
    private var root: TN? = null

    fun buildHuffmanTree(characters: Map<Char,Int>): TN {
        val nodes = characters.map {(char,frequency) -> TN(char,frequency) }.toMutableList()
        while (nodes.size > 1) {
            nodes.sortBy{it.frequency}
            val leftNode = nodes.removeAt(0)
            val rightNode = nodes.removeAt(0)
            val mergedNode = TN('.', leftNode.frequency + rightNode.frequency)
            mergedNode.left = leftNode
            mergedNode.right = rightNode

            nodes.add(mergedNode)

        }
        return nodes.first()
    }

}

