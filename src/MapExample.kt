fun main(args: Array<String>) {
    val TestMap = hashMapOf("Example" to "test") //cant change
    //println(TestMap.getOrDefault("Example", "This key doesnt exist"))
    var a = ""
    var tmp = ""
    var tmp2 = ""
    while(a != "0") {
        println("")
        println("if you want to stop type 0")
        println("1 - add new pair")
        println("2 - remove (value)")
        println("3 - find")
        println("4 - print map")
        a = readLine()!!
        if(a=="1"){
            println("key: ")
            tmp = readLine()!!
            println("value: ")
            tmp2 = readLine()!!
            TestMap.put(tmp,tmp2)
        }
        if(a=="2"){
            println("")
            println("keys " + TestMap.keys)
            println("remove, key: ")
            tmp = readLine()!!
            if(TestMap.getOrDefault(tmp,"-1") == "-1")
            {
                println("This key doesn't exists")
                println("")
            }
            else {
                TestMap.remove(tmp)
                println("Successful")
            }
        }
        if(a=="3"){
            println("if you want find element by key, type 'key', else type 'value'")
            tmp= readLine()!!
            if(tmp=="key"){
                tmp= readLine()!!
                if(TestMap.containsKey(tmp)) println("Yes \n ${TestMap[tmp]}")
                else println("No \n")
            }
            else if(tmp=="value"){
                tmp= readLine()!!
                if (TestMap.containsValue(tmp)) println("Yes \n")
                else println("No \n")
            }
            else println("Error, please try again")
        }
        if(a=="4") {
            if(!TestMap.isEmpty()) {
                println(TestMap)
            }
            else println("Empty")
        }
    }
}