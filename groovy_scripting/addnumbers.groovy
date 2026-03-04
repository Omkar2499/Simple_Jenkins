if (args.length!=2){
    println "Usage: groovy ${this.class.simpleName} <num1> <num2>"
    System.exit(1)
}


def a=args[0] as double
def b=args[1] as double


def sum = a+b

println "Result:$sum"