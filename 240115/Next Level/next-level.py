name, age = map(str,input().split())
class student:
    def __init__(self,name,age):
        self.name = name
        self.age = age

stu = student(name,age)
print("user codetree lv 10")
print("user "+stu.name+" lv "+stu.age)