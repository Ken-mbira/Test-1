package devmbira.mobile.duhqatest1

object Constants {
    fun getProducts():ArrayList<Product>{
        val productList = ArrayList<Product>()

        val productOne = Product(
            1,
            "Toshiba Satelite",
            "Intel Celeron Operating System",
            "29,000",
            R.drawable.duhqaproduct5,
            R.drawable.duhqaproduct4,
            R.drawable.duhqaproduct3,
        )
        productList.add(productOne)

        val productTwo = Product(
            2,
            "Toshiba Satelite Dual",
            "Very powerful Operating System",
            "29,000",
            R.drawable.duhqaproduct5,
            R.drawable.duhqaproduct4,
            R.drawable.duhqaproduct5,
        )
        productList.add(productTwo)

        val productThree = Product(
            5,
            "Toshiba Satelite",
            "Intel Celeron Operating System",
            "29,000",
            R.drawable.duhqaproduct4,
            R.drawable.duhqaproduct3,
            R.drawable.duhqaproduct3,
        )
        productList.add(productThree)

        val productFour = Product(
            4,
            "Toshiba Satelite",
            "Intel Celeron Operating System",
            "29,000",
            R.drawable.duhqaproduct3,
            R.drawable.duhqaproduct5,
            R.drawable.duhqaproduct3,
        )
        productList.add(productFour)

        val productFive = Product(
            5,
            "Nike Durable Shoes",
            "Quality sole",
            "2,900",
            R.drawable.duhqaproduct1,
            R.drawable.duhqaproduct2,
            R.drawable.duhqaproduct2,
        )
        productList.add(productFive)

        return productList
    }
}