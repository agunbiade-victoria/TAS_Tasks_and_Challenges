def reduce_number_loop(num):
    while num >= 0:
        print(num)
        num -= 1


def reduce_number_recursion(num):
    print(num)
    if num == 0:
        return
    reduce_number_recursion(num - 1)


def print_greet():
    print("Hello World")
    print_greet()


reduce_number_loop(5)
print()
reduce_number_recursion(5)
print_greet()
