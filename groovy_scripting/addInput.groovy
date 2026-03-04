
print "Enter the first number: "
def firstInput = System.console()?.readLine() ?: new BufferedReader(new InputStreamReader(System.in)).readLine()
def a = firstInput.toDouble()   // use toInteger() if you only want integers

// Read second number
print "Enter the second number: "
def secondInput = System.console()?.readLine() ?: new BufferedReader(new InputStreamReader(System.in)).readLine()
def b = secondInput.toDouble()

def sum=a+b 

println "The sum of $a + $b=$sum"