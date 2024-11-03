a = input()
b = input()
num1 =""
num2 = ""

for i in a:
    if i.isdigit():
        num1+=i
for i in b:
    if i.isdigit():
        num2+=i
print(int(num1)+int(num2))