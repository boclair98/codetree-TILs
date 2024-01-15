n = int(input())

class Student:

    def __init__(self,name,ki,age):
        self.name = name
        self.ki = ki 
        self.age = age

people = [] 

for _ in range(n):
    name , ki , age = map(str,input().split())

    people.append(Student(name,ki,age))

people.sort(key = lambda x:x.ki)

for i in range(n):
    print(people[i].name,people[i].ki,people[i].age)