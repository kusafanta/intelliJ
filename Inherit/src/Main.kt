fun main() {
    val s1 = SubClass1 ()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMember1()

    println("s1.syoerMember1 : ${s1.superMember1}")
    s1.superMethod1()

    
}

open class SuperClass1{
    var superMember1 = 100

    fun superMethod1(){
        println("SuperClass1의 메서드입니다.")
    }
}//open을 붙이지 않으면 final키워드가 자동으로 붙어서 부모가 될 수 없다.

class SubClass1 : SuperClass1(){
    val subMember1 = 200

    fun subMember1(){
        println("SubClass1의 메서드입니다.")
    }
}

open class SuperClass2(val a1:Int)

class SubClass2 : SuperClass2(100)

class SubClass3 : SuperClass2{
    constructor():super(100)
}