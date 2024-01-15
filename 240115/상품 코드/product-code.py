name, age = map(str,input().split())

class people:

    def __init__(self,name,age):
        self.name = name
        self.age = age

human = people(name,age)

print("product 50 is codetree")
print("product "+human.age+" is "+human.name)