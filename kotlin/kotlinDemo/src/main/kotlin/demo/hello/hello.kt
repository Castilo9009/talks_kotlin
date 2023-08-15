package demo.hello

fun main(args: Array<String>)
{
    if (args.size == 0)
    {
        println("Provide a name")
        return
    }

    // String interpolation
    println("Hello, ${args[0]}!")
}