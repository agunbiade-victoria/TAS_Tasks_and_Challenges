#  Create a program that prints out the odd numbers in an array.
#  Sample array: a. [1, 2, 3, 4, 5, 6] b. [ 34, 2, 9, 91, 19,401, 0 ]TECHNICAL QUESTIONS

print("\nMy first list:")
my_list1 = [1, 2, 3, 4, 5, 6]
for i in my_list1:
    if i % 2 == 0:
        pass
    else:
        print(i, end=" ")

print("\nMy second list:")

my_list2 = [4, 2, 9, 91, 19, 401, 0]
for i in my_list2:

    if i % 2 != 0:
        print(i, end=" ")

