print("Parameters")


# default parameter
def add(num1=4, num2=9):
    result = num1 + num2
    print("Result is:", result)


add()
add(67)
add(12, 45)


# required parameter
def greetings(name):
    print(name)


greetings("Testify Python")
