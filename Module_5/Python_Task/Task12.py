language = "Python"  # global variable


def greetings():
    language = "Java"  # local variable
    print("Language is:", language)


print(language)
greetings()
