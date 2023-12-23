number = 0
while number <= 10:
    print("while: Number is", number)
    number += 1

print("\nTask8\n")
number = 11

for i in range(number):
    print("Number:", i)

print("\ncontinue\n")
number = 11
for i in range(number):
    if i == 2:
        continue
    print("Number:", i)

print("\nbreak\n")
number = 11
for i in range(number):
    if i == 8:
        break
    print("Number:", i)
