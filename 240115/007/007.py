a, b, c = map(str,input().split())
c = int(c)

class student:
    def __init__ (self,a,b,c):
        self.a = a
        self.b = b
        self.c = c

tal = student(a,b,c)

print("secret code :",tal.a)
print("meeting point :",tal.b)
print("time :",tal.c)