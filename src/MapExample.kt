fun main(args: Array<String>) {
    val TestMap = hashMapOf("Example" to "test")
    val keysToDel = arrayListOf<String>("")

    var a = ""
    var tmp = ""
    var tmp2 = ""
    var flag = false

    while(a != "0") {

        println("")
        println("if you want to stop, type 0")
        println("1 - add new pair")
        println("2 - remove")
        println("3 - find")
        println("4 - print map")
        a = readLine()!!

        if(a=="1"){
            println("key: ")
            tmp= readLine()!!
            while(TestMap.containsKey(tmp)){
                println("Sorry, key $tmp is already exists, try again ")
                tmp= readLine()!!
            }
            println("value: ")
            tmp2 = readLine()!!
            TestMap.put(tmp,tmp2)
        }

        if(a=="2"){
            if(!TestMap.isEmpty()) {
                println("key - remove by key, value - remove by value")
                tmp = readLine()!!
                if (tmp == "key") {
                    println("\nkeys: " + TestMap.keys)
                    println("remove key: ")
                    tmp = readLine()!!
                    if (TestMap.getOrDefault(tmp, "-1") == "-1") {
                        println("This key doesn't exists")
                        println("")
                    } else {
                        TestMap.remove(tmp)
                        println("Successful")
                    }
                } else if (tmp == "value") {
                    println("\nvalues: " + TestMap.values)
                    println("remove value: ")
                    tmp = readLine()!!
                    for ((keys, value) in TestMap) {
                        if (TestMap.get(keys) == tmp) {
                            keysToDel.add(keys)
                            flag = true
                        }
                        if (TestMap.isEmpty()) break
                    }
                    if (flag) {
                        println("Successful!")
                        for (i in keysToDel) {
                            TestMap.remove(i)
                        }
                        keysToDel.clear()
                    } else println("nothing :(")
                    flag = false
                } else println("Error, please try again")
            }
            else println("Empty")

        }

        if(a=="3") {
            if (!TestMap.isEmpty()) {
                println("if you want find element by key, type 'key', else type 'value'")
                tmp = readLine()!!
                if (tmp == "key") {
                    println("Enter key or fragment of key")
                    tmp = readLine()!!
                    for ((keys, value) in TestMap) {
                        if (keys.contains(tmp)) {
                            println("Successful! \n$keys = ${TestMap[keys]}")
                            flag = true
                            break
                        }
                    }
                    if (!flag) println("no results")
                    flag = false
                } else if (tmp == "value") {
                    println("Enter value or fragment of value")
                    tmp = readLine()!!
                    for ((keys, value) in TestMap) {
                        if (value.contains(tmp)) {
                            println("Successful! \n$keys = ${TestMap[keys]}")
                            flag = true
                            break
                        }
                    }
                    if (!flag) println("no results")
                    flag = false
                } else println("Error, please try again")
            } else println("Empty")
        }

        if(a=="4") {
            if(!TestMap.isEmpty()) {
                println(TestMap)
            }
            else println("Empty")
        }
    }
}