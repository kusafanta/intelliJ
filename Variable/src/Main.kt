fun main() {

    //정수 리터럴
    println(100)
    println(100000000000000)
    println(1_23_712_398_217_391_2)

    // 실수 리터럴
    println(11.11)
    println(22.22F)

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    // Row String
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우사하\n우리나라 만세")

    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())


    println("-------------------------------------------------")

    val a1:Int = 100

    println("a1 : ${a1}")
    println("a1 : $a1")

    val a2 = 100

    println("a2 : $a2")

    println("-------------------------------------------------")

    var a3:Int = 100
    val a4:Int = 100//변경 불가

    println("a3 : $a3")
    println("a4 : $a4")

    a3 = 200
    println("a3 : $a3")

    println("-------------------------------------------------")

    var a5:Int = 100
    var a6:Int? = null
    println("a5 : $a5")
    println("a6 : $a6")

    var a7:Int ? = a5

    println("a7 : $a7")

    //var a8:Int = a6!!
    /*
    !!를 넣으면 널을 허용한 변수를 널을 허용하지
     않도록 강제로 바꾸는것
     (문법적으로는 허용하나 값이 널이기 때문에 에러 발생
     */
}