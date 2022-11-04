fun main(args: Array<String>) {
    fun main(args: Array<String>) {
        val age1 = 42.00
        val age2 = 21.00
        print(age1)
        print(age2)
        val avg1 = (age1+age2)/2
        print(avg1)
        val firstName = "Анна"
        val lastName = "Ермоленко"
        val fullName = "$firstName $lastName"
        print(fullName)
        val myDetails = "Привет, меня зовут $fullName"
        print(myDetails)
        val triple = Triple(20,12,4)
        val month = triple.first
        val day = triple.second
        val year = triple.third
        val str = """
        |$month
        |
        |$year
    """.trimMargin()
        val pair = Pair (2, year)
    }
}