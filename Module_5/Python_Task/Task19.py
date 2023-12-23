class Human:
    leg_count = 4
    can_walk = True

    def __init__(self, name):
        self.name = name

    def get_description(self, description):
        self.get_description = description


princess = Human("Princess")
print("Human:", princess.name, princess.leg_count, princess.can_walk)

princess.get_description("This is human")
print("\nPrincess:", princess.get_description)

print("\nHuman:", princess.leg_count)
