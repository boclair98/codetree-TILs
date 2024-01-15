r,g,b = map(str,input().split())

class color:

    def __init__(self,r,g,b):
        self.r = r
        self.g = g
        self.b = b

student = color(r,g,b)

print("code :",student.r)
print("color :",student.g)
print("second :",student.b)