class Stack<T> {
    private val listStack = mutableListOf<T>()

    fun push(item: T) {
        listStack.add(item)
    }

    fun pop(): T? {
        if (listStack.isEmpty()) {
            return null
        }
        return listStack.removeAt(listStack.lastIndex)
    }

    fun isEmpty(): Boolean {
        return listStack.isEmpty()
    }

    fun size(): Int {
        return listStack.size
    }

    fun clear() {
        listStack.clear()
    }
}