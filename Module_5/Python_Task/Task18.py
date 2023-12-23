class Human:
    leg_count = 4
    can_walk = True

    def __init__(self, name):
        self.name = name


Princess = Human("Princess")

print(Princess.name)

print(Princess.leg_count)

print(Princess.can_walk)
