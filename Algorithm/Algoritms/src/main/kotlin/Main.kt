import java.time.LocalDate
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val warehouse = Warehouse()

    // Добавление продуктов
    warehouse.addProduct(
        Product(
            "Молоко", "Ферма",
            quantity = 50,
            pricePerPackage = 1.5,
            manufactureDate = LocalDate.of(2023, 5, 1),
            expirationDate = LocalDate.of(2024, 5, 1)
        )
    )
    warehouse.addProduct(
        Product(
            "Хлеб", "Пекарня",
            quantity = 100,
            pricePerPackage = 0.8,
            manufactureDate = LocalDate.of(2023, 10, 1),
            expirationDate = LocalDate.of(2023, 11, 1)
        )
    )

    // Поиск продукта
    val product = warehouse.findProduct("Молоко")
    println("Найден продукт: $product")

    // Продажа продукта
    warehouse.sellProduct("Молоко", 10)

    // Списание просроченных продуктов
    warehouse.discardExpiredProducts()

    // Вывод всех продуктов
    println("\nТекущий список продуктов на складе:")
    warehouse.displayProducts()
}




    data class Product(
        val name: String,
        val manufacturer: String,
        var quantity: Int,
        val pricePerPackage: Double,
        val manufactureDate: LocalDate,
        val expirationDate: LocalDate,
    )

    class TreeNode(var product: Product) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class Warehouse {
        private var root: TreeNode? = null

        fun addProduct(product: Product) {
            root = addRecursive(root, product)
        }

        private fun addRecursive(current: TreeNode?, product: Product): TreeNode {
            if (current == null) {
                return TreeNode(product)
            }
            if (product.name < current.product.name) {
                current.left = addRecursive(current.left, product)
            } else if (product.name > current.product.name) {
                current.right = addRecursive(current.right, product)
            }
            return current
        }

        fun findProduct(name: String): Product? {
            return findRecursive(root, name)?.product
        }

        private fun findRecursive(current: TreeNode?, name: String): TreeNode? {
            if (current == null) {
                return null
            }

            if (name == current.product.name) {
                return current
            }

            return if (name < current.product.name) {
                findRecursive(current.left, name)
            } else {
                findRecursive(current.right, name)
            }
        }

        // Продажа продукта
        fun sellProduct(name: String, quantity: Int): Boolean {
            val productNode = findRecursive(root, name)
            if (productNode != null) {
                val product = productNode.product
                if (product.expirationDate.isAfter(LocalDate.now())) {
                    if (product.quantity >= quantity) {
                        product.quantity -= quantity
                        println("Продано $quantity упаковок продукта $name.")
                        return true
                    } else {
                        println("Недостаточное количество продукта $name на складе.")
                    }
                } else {
                    println("Продукт $name просрочен и подлежит списанию.")
                }
            } else {
                println("Продукт $name не найден.")
            }
            return false
        }

        // Списание просроченных продуктов
        fun discardExpiredProducts() {
            discardExpiredRecursive(root)
        }

        private fun discardExpiredRecursive(current: TreeNode?) {
            if (current != null) {
                if (current.product.expirationDate.isBefore(LocalDate.now())) {
                    println("Продукт ${current.product.name} просрочен и подлежит списанию.")
                    current.product.quantity = 0
                }
                discardExpiredRecursive(current.left)
                discardExpiredRecursive(current.right)
            }
        }

        // Вывод всех продуктов
        fun displayProducts() {
            displayProductsRecursive(root)
        }

        private fun displayProductsRecursive(current: TreeNode?) {
            if (current != null) {
                displayProductsRecursive(current.left)
                println(current.product)
                displayProductsRecursive(current.right)
            }
        }
    }
