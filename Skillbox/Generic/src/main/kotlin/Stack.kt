class Stack<T> {
    var listStack = mutableListOf<T>()

    fun push(item: T) {   //добавляет элемент
        listStack.add(item)
    }

    fun pop(): T? {   // извлекает элемент
        if (listStack.isEmpty()) {
            return null
        }
        return listStack.removeAt(listStack.lastIndex)
    }

    fun isEmpty(): Boolean {
        return  listStack.isEmpty()
    }

    fun size(): Int {
        return listStack.size
    }
}