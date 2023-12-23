# Writing  a  well-documented  code  creates  a  function  that calculates simple interest

def simple_interest(p, r, t):
    si = p * r * t / 100
    return si


result = simple_interest(1800, 2, 5)

print("The Simple Interest is: ", result)
